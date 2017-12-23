package com.mycompany.tecnoar.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public abstract class Repository <T, ID extends Serializable>{

	protected Class<T> persistedClass = getClazz();
    
	@PersistenceContext(unitName = "TecNoar")
	protected EntityManager em;
	
	public void insert(T entity){
		em.persist(entity);
	}
	
	public void update(T entity){
		em.merge(entity);
	}
	
	public void delete(ID id) {
		em.remove( em.getReference(persistedClass, id));
	}
	
	public T findById(ID id) {
		return em.find(persistedClass, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return em.createQuery("from " + persistedClass.getName() + 
				" Order By id").getResultList();
	}
	
	@SuppressWarnings({ "unchecked" })
	private Class<T> getClazz() {
		Class<?> clazz = this.getClass();
		
		while (!clazz.getSuperclass().equals(Repository.class)) {
			clazz = clazz.getSuperclass();
		}
		
		ParameterizedType tipoGenerico = (ParameterizedType) clazz.getGenericSuperclass();
		return (Class<T>) tipoGenerico.getActualTypeArguments()[0];
	}
}
