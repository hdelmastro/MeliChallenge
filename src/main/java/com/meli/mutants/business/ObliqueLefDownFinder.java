package com.meli.mutants.business;

import org.springframework.stereotype.Component;
/**
 * 
 * @author hdelmastro@gmail.com
 *
 */
@Component
public class ObliqueLefDownFinder extends AbstractFinder implements IPathFinder{
	
	@Override
	public void buildAvailablePath(int x, int y, int patternSize, int matrixLength, char letter) {

		createAvailablePath(matrixLength, patternSize);
		
		if (x >= (matrixLength - y)) {
			int minVL = matrixLength -patternSize + matrixLength-y ;						
			if (x < minVL) {
				if (x == matrixLength -1 ) {
					availablePath[x+y-matrixLength] = new StringBuffer();	
				}							
				availablePath[x+y-matrixLength].append(letter);				
			}
		}	
	}
}
