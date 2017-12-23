package com.mycompany.tecnoar.controladores;

import javax.inject.Inject;

import com.mycompany.tecnoar.dao.dao.CategoriaDao;
import com.mycompany.tecnoar.dao.dao.ProdutoDao;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {
	@SuppressWarnings("unused")
	private Result result;
	private ProdutoDao produtoDao;
	private CategoriaDao categoriaDao;
	
	/**
	 * 
	 * @deprecated
	 */
	public IndexController(){}
	
	@Inject
	public IndexController(Result result, ProdutoDao produtoDao, CategoriaDao categoriaDao){
		this.result = result;
		this.produtoDao = produtoDao;
		this.categoriaDao = categoriaDao;
	}
	
	@Get
	@Path(value = {"/", ""})
	public void index(){
		result.include("produtos", produtoDao.findAll());
		result.include("categorias", categoriaDao.findAll());
	}
	
}
