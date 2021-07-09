package com.habilidadementalidade.habilidadementalidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidadementalidade")

public class HabilidadeMentalidadeController {

	@GetMapping
	public String HabilidadeMentalidade() {
		return "Habilidade: Atenção aos detalhes e Mentalidade: Persistência";
	
	}
}
