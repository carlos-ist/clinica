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

}