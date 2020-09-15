package com.meli.mutants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meli.mutants.model.Stats;
import com.meli.mutants.service.IMutantService;
import com.meli.mutants.service.IStatisticsService;

@Controller
@RequestMapping("/meli")
public class StatisticsController {

	
	@Autowired
	private IStatisticsService statisticsService;
		
	
	@GetMapping("/stats")
	public ResponseEntity<Stats> mutant(){
		
		Stats body = statisticsService.getStats();
		
		return new ResponseEntity<Stats>(body, HttpStatus.OK);
	}
	
	
}
