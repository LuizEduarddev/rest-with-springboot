package br.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.math.MathValidations;

@RestController
@RequestMapping(path = "/api/")
public class MathController {

	@GetMapping(path="/operations")
	public double mathOperations(
			@RequestParam(value = "op", required = true) String op,
			@RequestParam(value = "n1", required = true) String n1,
			@RequestParam(value = "n2", required = false) String n2){
		
		MathValidations validations = new MathValidations();
		return validations.validate(op, n1, n2);
	}
}
