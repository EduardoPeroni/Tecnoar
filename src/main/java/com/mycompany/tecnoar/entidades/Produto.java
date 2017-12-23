
package com.mycompany.tecnoar.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Cascade;


@Entity
@Table(name = "produto")
@Data
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	public static final String findAll = "Produto.findAll";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 1000, nullable = false)
	private String descricao;

	@Column(nullable = false, length = 255)
	private String imagem;
	
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idCategoria", referencedColumnName="id")
	private Categoria categoria;
        
        @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idFabricante", referencedColumnName="id")
	private Fabricante fabricante;

	public Produto(){
		super();
	}
	
	public Produto(Long id, String nome, String descricao, double valor, int estoque, String imagem, Categoria categoria, Fabricante fabricante){
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
		this.categoria = categoria;
                this.fabricante = fabricante;
	}
	


}