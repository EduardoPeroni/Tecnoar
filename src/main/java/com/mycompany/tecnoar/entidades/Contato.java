
package com.mycompany.tecnoar.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "contato")
@Data
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long senha;	

	@Column(name = "mensagem", length=1000, nullable = false)
	private String mensagem;
        
        @Column(name = "email", length=60, nullable = false)
	private String email;
        @Column(name = "assunto", length=100, nullable = false)
	private String assunto;
        @Column(name = "nome", length=60, nullable = false)
	private String nome;
        @Column(name = "telefone", length=40, nullable = false)
	private String telefone;
        @Column(name = "cidade", length=40, nullable = false)
	private String cidade;
	
	public Contato() {
	}

	public Contato(Long senha, String mensagem, String email, String assunto, String nome, String telefone, String cidade ) {
		super();
		this.senha = senha;
		this.mensagem = mensagem;
                this.email = email;
                this.assunto = assunto;
                this.nome = nome;
                this.telefone = telefone;
                this.cidade = cidade;
                
	}
}