package com.mycompany.tecnoar.controladores;

import static br.com.caelum.vraptor.view.Results.status;

import javax.inject.Inject;

import com.mycompany.tecnoar.dao.annotation.Restrito;
import com.mycompany.tecnoar.dao.dao.CategoriaDao;
import com.mycompany.tecnoar.dao.dao.FabricanteDao;
import com.mycompany.tecnoar.dao.dao.ProdutoDao;
import com.mycompany.tecnoar.dao.entidades.Produto;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
@Path(value = "/produto")
public class UsuarioController {
	private Result result;
	private ProdutoDao produtoDao;
	private CategoriaDao categoriaDao;
        private FabricanteDao fabricanteDao;
	
	/** Utilizado pelo CDI
	 *  @deprecated
	 */
	public UsuarioController(){}
	
	@Inject
	public UsuarioController(Result result, ProdutoDao produtoDao, CategoriaDao categoriaDao){
		this.result = result;
		this.produtoDao = produtoDao;
		this.categoriaDao = categoriaDao;
                this.fabricanteDao = fabricanteDao;

                
	}
	
	@Get
	@Path(value = "/{id}")
	public void paginaInterna(Long id){
		result.include("produto", produtoDao.findById(id));
		result.include("categorias", categoriaDao.findAll());
                result.include("fabricante", fabricanteDao.findAll());

	}
	
	@Get
	@Path(value = "/categoria/{id}")
	public void ProdCategoria(Long id){
		result.include("produtos", produtoDao.listarProdutos(id));
		result.include("categorias", categoriaDao.findAll());
                result.include("fabricante", fabricanteDao.findAll());

	}
	
	@Get
	@Path(value = "/prodCadastro")
	@Restrito
	public void prodCadastro(){
		result.include("categorias", categoriaDao.findAll());
                result.include("fabricante", fabricanteDao.findAll());

	}
	
	@Post
	@Path(value = "/")
	public void salvar(Produto produto){
		if (produto.getId() != null && produto.getId() > 0){
			produtoDao.update(produto);
		}else{
			produtoDao.insert(produto);
		}
		result.use(status()).ok();
		
	}
}
