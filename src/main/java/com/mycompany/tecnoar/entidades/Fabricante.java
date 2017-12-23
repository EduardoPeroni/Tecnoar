
package com.mycompany.tecnoar.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "Fabricante")
@Data
public class Fabricante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descricao", length=60, nullable = false)
	private String Fabricante;
	
	public Fabricante() {
	}

	public Fabricante(Long id, String descricao) {
		super();
		this.id = id;
		this.Fabricante = descricao;
	}
}