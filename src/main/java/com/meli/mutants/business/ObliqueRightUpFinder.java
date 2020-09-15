package com.meli.mutants.business;

import org.springframework.stereotype.Component;
/**
 * 
 * @author hdelmastro@gmail.com
 *
 */
@Component
public class ObliqueRightUpFinder extends AbstractFinder implements IPathFinder {

	
	@Override
	public void buildAvailablePath(int x, int y, int patternSize, int matrixLength,
			char letter) {
		
		createAvailablePath(matrixLength+1, patternSize);
		
		if (y <= x) {								
			int maxH = matrixLength - (patternSize - y);
			if (x <= maxH) {					
				if(y == 0) {						
					availablePath[x-y] = new StringBuffer();					
				}
				availablePath[x-y].append(letter);
			}
		}
	}

}
