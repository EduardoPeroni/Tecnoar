package com.mycompany.tecnoar.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.mycompany.tecnoar.entidades.Usuario;

@Stateless
public class UsuarioDao extends Repository<Usuario, Long>{

	public Usuario findByEmailAndSenha(String nome, String senha){
		try{
			Query query = (Query) em.createQuery("from Usuario c where c.nome=:nome and c.senha=:senha");
			query.setParameter("nome", nome);
			query.setParameter("senha", senha);
			
			return (Usuario) query.getSingleResult();
		}catch (NoResultException e){
			return null;
		}
	
	}
	
}