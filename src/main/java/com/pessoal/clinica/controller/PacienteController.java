package com.pessoal.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PacienteController {
	
	@RequestMapping("/paciente")
	@ResponseBody
	public String viewPaciente () {
		return "Hello World";
	}
	
}