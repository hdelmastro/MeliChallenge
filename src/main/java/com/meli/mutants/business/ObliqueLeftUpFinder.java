package com.meli.mutants.business;

import org.springframework.stereotype.Component;
/**
 * 
 * @author hdelmastro@gmail.com
 *
 */
@Component
public class ObliqueLeftUpFinder extends AbstractFinder implements IPathFinder {

	@Override
	public void buildAvailablePath( int x, int y, int patternSize, int matrixLength,char letter) {
		
		createAvailablePath( matrixLength+1, patternSize);
		
		if (x < matrixLength - y) {	
	  		int minHL = patternSize - y -1 ;				
			if (x>= minHL) {								
				if (y == 0 ) {
					availablePath[x-minHL] = new StringBuffer();
				}
				availablePath[x-minHL].append(letter);				
			}
		}
	}
	

}
