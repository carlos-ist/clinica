package com.pessoal.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Teste {
	
	@RequestMapping("/")
	@ResponseBody
	public String TesteHello() {
		return "<h1>Hello World</h1>";
	}

}