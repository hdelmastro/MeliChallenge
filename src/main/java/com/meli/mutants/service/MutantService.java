package com.meli.mutants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.meli.mutants.business.IPathFinder;
import com.meli.mutants.exceptions.NoMutantFoundException;
import com.meli.mutants.utils.Checker;
/**
 * 
 * @author hdelmastro@gmail.com
 *
 */
@Service
public class MutantService implements IMutantService {

	@Value("${patternSize}")
	private int patternSize;
	
	@Value("${patternAlpahbet}")
	private String patternAlpahbet;
	
	@Value("${patterNumberThreshold}")
	private int patterNumberThreshold;
	
	@Autowired
	private Checker checker;

	@Autowired
	private List<IPathFinder> finders;
	
	@Override
	public Boolean isMutant(String[] dna) {
		int patternCounter = 0;
		int matrixLength = dna.length;
		
		int y = 0;
		while (patternCounter < patterNumberThreshold && y < matrixLength ) {
			patternCounter = checker.countPattern(patternCounter, dna[y], patternSize, patternAlpahbet);			
			int x = 0; 
			while (patternCounter < patterNumberThreshold && x < matrixLength) {
				char letter = dna[y].charAt(x);				
				for (IPathFinder  finder : finders) {
					finder.buildAvailablePath(x, y, patternSize, matrixLength, letter);
				}								
				x++;
			}			
			y++;
		}
		
		int f = 0;		
		while(patternCounter < patterNumberThreshold && f<finders.size() ) {
			patternCounter = checker.findPatterns(patternCounter, patterNumberThreshold, finders.get(f).getAvailablePath(), patternSize, patternAlpahbet);		
			f++;
		}
		
		if(patternCounter >= patterNumberThreshold) {
			return  true;
		}else {
			throw new NoMutantFoundException("No Mutant found");
		}
		
		

	}

	
}