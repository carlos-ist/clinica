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
	
}