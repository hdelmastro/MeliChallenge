package com.meli.mutants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meli.mutants.model.DnaWrapper;
import com.meli.mutants.service.IMutantService;

@Controller
@RequestMapping("/meli")
public class MutantController {

	@Autowired
	private IMutantService service;
	
	@PostMapping("/mutant")
	public ResponseEntity<Boolean> mutant(@RequestBody DnaWrapper dnaBody){
		
		Boolean body = false;
		
		body = service.isMutant(dnaBody.getDna());
				
		return new ResponseEntity<Boolean>(body, HttpStatus.OK);
	}
}
