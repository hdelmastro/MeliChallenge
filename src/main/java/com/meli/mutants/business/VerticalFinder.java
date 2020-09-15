package com.meli.mutants.business;

import org.springframework.stereotype.Component;
/**
 * 
 * @author hdelmastro@gmail.com
 *
 */
@Component
public class VerticalFinder extends AbstractFinder implements IPathFinder {

	
	@Override
	public void buildAvailablePath( int x, int y, int patternSize, int matrixLength,
			char letter) {
		
		createAvailablePath(matrixLength, 0);
		
		if (y==0) {
			availablePath[x] =  new StringBuffer();
		}
		availablePath[x].append(letter);
	}

}
