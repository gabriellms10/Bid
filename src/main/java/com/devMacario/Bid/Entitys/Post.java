package com.devMacario.Bid.Entitys;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany
	private Pessoa atleta;
	@OneToMany
	private Clube clube;
	private Date data_publicada;
	private String tipo_contrato;

	public Post() {

	}
 
	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}

	public Pessoa getAtleta() {
		return atleta;
	}

	public void setAtleta(Pessoa atleta) {
		this.atleta = atleta;
	}

	public long getId() {
		return id;
	}

	public Date getData_publicada() {
		return data_publicada;
	}

	public void setData_publicada(Date data_publicada) {
		this.data_publicada = data_publicada;
	}

	public String getTipo_contrato() {
		return tipo_contrato;
	}

	public void setTipo_contrato(String tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}

}
