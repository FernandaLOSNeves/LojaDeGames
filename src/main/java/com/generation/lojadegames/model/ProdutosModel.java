package com.generation.lojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produtos")

public class ProdutosModel {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	@Size(min=1, max=100)
	private String nome;
	
	@NotNull
	private int ano_lancamento;
	
	@NotNull
	@Size(min=1, max=100)
	private String multiplayer;
	
	@NotNull
	@Size(min=1, max=100)
	private String plataforma_1;
	
	@NotNull
	@Size(min=1, max=100)
	private String plataforma_2;
	
	@NotNull
	@Size(min=1, max=100)
	private String plataforma_3;
	
	
	@ManyToOne
	@JsonIgnoreProperties("jogos")
	private ProdutosModel categorias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlataforma_1() {
		return plataforma_1;
	}

	public void setPlataforma_1(String plataforma_1) {
		this.plataforma_1 = plataforma_1;
	}

	public String getPlataforma_2() {
		return plataforma_2;
	}

	public void setPlataforma_2(String plataforma_2) {
		this.plataforma_2 = plataforma_2;
	}

	public String getPlataforma_3() {
		return plataforma_3;
	}

	public void setPlataforma_3(String plataforma_3) {
		this.plataforma_3 = plataforma_3;
	}

	public int getAno_lancamento() {
		return ano_lancamento;
	}

	public void setAno_lancamento(int ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}

	public ProdutosModel getCategorias() {
		return categorias;
	}

	public void setCategorias(ProdutosModel categorias) {
		this.categorias = categorias;
	}

	public String getMultiplayer() {
		return multiplayer;
	}

	public void setMultiplayer(String multiplayer) {
		this.multiplayer = multiplayer;
	}

	
}
