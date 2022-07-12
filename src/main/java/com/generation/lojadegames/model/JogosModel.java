package com.generation.lojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_jogos")

public class JogosModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=1, max=100)
	private String nome;
	
	@NotNull
	private int ano_lancamento;
	
	@NotNull
	@Size(min=1, max=3)
	private String multiplayer;
	
	@NotNull
	@Size(min=1, max=100)
	private String plataforma_1;
	
	
	@Size(max=100)
	private String plataforma_2;
	
	@Size(max=100)
	private String plataforma_3;
	
	@ManyToOne
	@JsonIgnoreProperties("jogos")
	private CategoriasModel categorias;

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

	public int getAno_lancamento() {
		return ano_lancamento;
	}

	public void setAno_lancamento(int ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}

	public String getMultiplayer() {
		return multiplayer;
	}

	public void setMultiplayer(String multiplayer) {
		this.multiplayer = multiplayer;
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

	public CategoriasModel getCategorias() {
		return categorias;
	}

	public void setCategorias(CategoriasModel categorias) {
		this.categorias = categorias;
	}

}
