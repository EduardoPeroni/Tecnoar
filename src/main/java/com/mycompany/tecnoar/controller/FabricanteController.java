package com.mycompany.tecnoar.controladores;

import static br.com.caelum.vraptor.view.Results.status;
import javax.inject.Inject;

import com.mycompany.tecnoar.dao.annotation.Restrito;
import com.mycompany.tecnoar.dao.dao.CategoriaDao;
import com.mycompany.tecnoar.dao.dao.FabricanteDao;
import com.mycompany.tecnoar.dao.entidades.Fabricante;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
@Path(value = "/fabricante")
public class FabricanteController {
	private Result result;
	private FabricanteDao fabricanteDao;
        
	/** Utilizado pelo CDI
	 *  @deprecated
	 */
	public FabricanteController(){}
	
	@Inject
	public FabricanteController(Result result, FabricanteDao fabricanteDao){
		this.result = result;
		this.fabricanteDao = fabricanteDao;
	}
	
	@Get
	@Path(value = {"/", ""})
	public void list(){
		result.include("fabricante", fabricanteDao.findAll());
	}
	
	@Get
	@Path(value = "/cadFabricante")
	@Restrito
	public void cadFabricante(){
		result.include("fabricante", fabricanteDao.findAll());
	}
	
	@Get
	@Path(value = "/cadFabricante/{id}")
	@Restrito
	public void cadFabricante(Long id){
		result.include("fabricante",fabricanteDao.findById(id));
	}
	
	@Post
	@Path(value = "/")
	public void salvar(Fabricante fabricante){
		if (fabricante.getId() != null && fabricante.getId() > 0){
			fabricanteDao.update(fabricante);
		}else{
			fabricanteDao.insert(fabricante);
		}
		result.use(status()).ok();
		
	}

}









