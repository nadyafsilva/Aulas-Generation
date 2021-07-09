package com.objetivos.objetivos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/Objetivos")

public class ObjetivosController {
	
	@GetMapping
	public String ObjetivosController() {
		return "Objetivos: Tecnicas de Spring";
	}

}
