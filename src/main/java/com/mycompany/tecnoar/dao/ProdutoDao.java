package com.mycompany.tecnoar.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import com.mycompany.tecnoar.entidades.Produto;

@Stateless
public class ProdutoDao extends Repository<Produto, Long>{

	public List<Produto> listarProdutosCategoria(Long id){
		Query query = em.createQuery("select p from Produto p where p.categoria.id = :id").setParameter("id", id);
		return query.getResultList();
	}
	
        public List<Produto> listarProdutosFabricantes(Long id){
		Query query = em.createQuery("select p from Produto p where p.fabricante.id = :id").setParameter("id", id);
		return query.getResultList();
	}

    public Object listarProdutos(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}



