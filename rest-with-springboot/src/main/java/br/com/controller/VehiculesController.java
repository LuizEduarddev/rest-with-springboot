package br.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class VehiculesController 
{
	@GetMapping
	public String primeiraApi()
	{
		return "Olá, mundo!";
	}
}
