package com.meli.mutants.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meli.mutants.model.Stats;
import com.meli.mutants.persistence.MutantRepository;
import com.meli.mutants.persistence.ProcessedRepository;
import com.meli.mutants.service.IStatisticsService;
/**
 * 
 * @author hdelmastro@gmail.com
 *
 */
@Service
public class StatisticsService implements IStatisticsService {

	@Autowired
	MutantRepository mutantRepository;
	
	@Autowired
	ProcessedRepository processedRepository;
	
	@Override
	public Stats getStats() {
		
		Stats response = new Stats();
		
		Long totalMutants = mutantRepository.findAll().stream().count();
		response.setCountMutantDna(totalMutants);
		Long totalProcessed = processedRepository.count();
		response.setCountHumanDna(totalProcessed);
		
		Double ratio = totalProcessed >0 ? totalMutants.doubleValue()/totalProcessed : 0  ;
		
		response.setRatio(ratio);
		
		return response ;
	}

}
