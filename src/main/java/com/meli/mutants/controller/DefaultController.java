package com.meli.mutants.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

	@GetMapping("/")
	public ResponseEntity<String> mutant(){
		String body = "<html> "
						+ "<head> "
							+ "<title> del Mastro Héctor, Meli Mutant Challenge </title> "
						+ "</head> "
						+ "<body> "
							+ "<h1>del Mastro Héctor, Meli Mutant Challenge </h1>"	
							+ "<a href=\"https://github.com/hdelmastro/MeliChallenge/\">https://github.com/hdelmastro/MeliChallenge/</a> "
						+ "</body> "
					+ "</html>";
		return new ResponseEntity<String>(body , HttpStatus.OK);
	}
}
