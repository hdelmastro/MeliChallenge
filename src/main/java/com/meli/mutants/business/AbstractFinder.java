package com.meli.mutants.business;
/**
 * 
 * @author hdelmastro@gmail.com
 *
 */
public class AbstractFinder {

	protected StringBuffer[] availablePath;
	
	/**
	 * Creates the available path to store valid ways to find patterns.
	 * @param size
	 * @param gap
	 */
	protected void createAvailablePath( int size, int gap) {
		if (availablePath == null) {
			availablePath = new StringBuffer[size-gap];
		}
		
	}

	public StringBuffer[] getAvailablePath() {
		return availablePath;
	}
		

}
