package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/site")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World, Larissa!!!";
	}

	@GetMapping("/bsms")
	public List<String> getBSMs() {
		List<String> bsmList = Arrays.asList("trabalho em equipe", "atenção aos detalhes", "proatividade",
				"comunicação", "persistência", "responsabilidade pessoal", "orientação ao futuro",
				"mentalidade de crescimento");
		return bsmList;
	}

	@GetMapping("/objetivos")
	public List<String> getLearningObjectives() {
		List<String> objetivosList = Arrays.asList("Aprender Spring Boot", "Aprofundar conhecimentos em endpoints",
				"Melhorar habilidades com Java", "Melhorar habilidade de orientação ao futuro",
				"Aprofundar conhecimentos no MYSQL", "Aprofundar conhecimentos em RESTful APIs"

		);
		return objetivosList;
	}
}
