package com.meli.mutants.business;
/**
 * 
 * @author hdelmastro@gmail.com
 *
 */
public interface IPathFinder {

	/**
	 * Creates and store the available path to search patterns.
	 * @param x
	 * @param y
	 * @param patternSize
	 * @param matrixLength
	 * @param letter
	 */
	public void buildAvailablePath(int x, int y, int patternSize, int matrixLength, char letter);
	
	/**
	 * Returns the available path.
	 * @return
	 */
	public StringBuffer[] getAvailablePath();
}
