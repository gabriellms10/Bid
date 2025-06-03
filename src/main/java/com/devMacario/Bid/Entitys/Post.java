package com.devMacario.Bid.Entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "atleta_id")
	private Pessoa atleta_id;
	@ManyToMany
	@JoinTable(name = "post_clubes", joinColumns = @JoinColumn(name = "post_id"), inverseJoinColumns = @JoinColumn(name = "clube_id"))
	private List<Clube> clubes = new ArrayList<Clube>();
	private Date data_publicada;
	private String tipo_contrato;

	public Post() {

	}

	public List<Clube> getClubes() {
		return clubes;
	}

	public Pessoa getAtleta() {
		return atleta_id;
	}

	public void setAtleta(Pessoa atleta_id) {
		this.atleta_id = atleta_id;
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
