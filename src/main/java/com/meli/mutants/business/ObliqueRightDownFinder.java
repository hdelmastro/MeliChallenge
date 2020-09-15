package com.meli.mutants.business;

import org.springframework.stereotype.Component;
/**
 * 
 * @author hdelmastro@gmail.com
 *
 */
@Component
public class ObliqueRightDownFinder extends AbstractFinder implements IPathFinder {


	@Override
	public void buildAvailablePath( int x, int y, int patternSize, int matrixLength,
			char letter) {
		
		createAvailablePath( matrixLength, patternSize);
		if (y > x) {				
			int maxV = matrixLength - (patternSize - x);
			if (y <= maxV) {					
				if(x == 0) {						
					availablePath[y-1-x] = new StringBuffer();					
				}					
				availablePath[y-1-x].append(letter);
			}
		}
	}

	

}
