package com.meli.mutants.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meli.mutants.model.Stats;

@Controller
@RequestMapping("/meli")
public class StatisticsController {

	
	
	@GetMapping("/stats")
	public ResponseEntity<Stats> mutant(){
		
		Stats body = null; 
				
		return new ResponseEntity<Stats>(body, HttpStatus.OK);
	}
	
	
}
