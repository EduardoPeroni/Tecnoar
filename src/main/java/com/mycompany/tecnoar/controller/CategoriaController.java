package com.mycompany.tecnoar.controladores;

import static br.com.caelum.vraptor.view.Results.status;
import javax.inject.Inject;

import com.mycompany.tecnoar.dao.annotation.Restrito;
import com.mycompany.tecnoar.dao.dao.CategoriaDao;
import com.mycompany.tecnoar.dao.entidades.Categoria;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
@Path(value = "/categoria")
public class CategoriaController {
	private Result result;
	private CategoriaDao categoriaDao;
        
	/** Utilizado pelo CDI
	 *  @deprecated
	 */
	public CategoriaController(){}
	
	@Inject
	public CategoriaController(Result result, CategoriaDao categoriaDao){
		this.result = result;
		this.categoriaDao = categoriaDao;
	}
	
	@Get
	@Path(value = {"/", ""})
	public void list(){
		result.include("categorias", categoriaDao.findAll());
	}
	
	@Get
	@Path(value = "/cadCategoria")
	@Restrito
	public void cadCategoria(){
		result.include("categorias", categoriaDao.findAll());
	}
	
	@Get
	@Path(value = "/cadCategoria/{id}")
	@Restrito
	public void cadCategoria(Long id){
		result.include("categoria", categoriaDao.findById(id));
	}
	
	@Post
	@Path(value = "/")
	public void salvar(Categoria categoria){
		if (categoria.getId() != null && categoria.getId() > 0){
			categoriaDao.update(categoria);
		}else{
			categoriaDao.insert(categoria);
		}
		result.use(status()).ok();
		
	}

}









