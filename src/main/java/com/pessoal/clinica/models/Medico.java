package com.pessoal.clinica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medico {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String Nome;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	@Override
	public String toString() {
		return "Medico [id=" + id + ", Nome=" + Nome + "]";
	}
	
	
	
	
}