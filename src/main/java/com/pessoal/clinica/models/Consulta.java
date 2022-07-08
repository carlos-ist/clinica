package com.pessoal.clinica.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Consulta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	@OneToOne
	Paciente paciente;
	
	@OneToOne
	Medico medico;
	
	String dataHora;

	//Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	
	@Override
	public String toString() {
		return "Consulta [id=" + id + ", paciente=" + paciente + ", medico=" + medico + ", dataHora=" + dataHora + "]";
	}
	
	
	
	
	
}