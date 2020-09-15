package com.meli.mutants.utils;

import org.springframework.stereotype.Component;
/**
 * @author hdelmastro@gmail.com
 *
 */
@Component
public class Checker {
	/**
	 * Returns true if the word have a char of patternAlphabeth repeated patternSize times, otherwise returns false
	 * @param word
	 * @param patternSize
	 * @param patternAlphabhet
	 * @return
	 */
	private boolean havePattern(String word, int patternSize, String patternAlphabhet) {

		if (word.length() < patternSize) {
			return false;
		}

		int index = patternSize - 1;
		char letter = word.charAt(index);

		while (index >= 1 && letter == word.charAt(index - 1)) {
			index--;

		}

		if (index == 0) {
			return patternAlphabhet.contains(String.valueOf(letter));
		} else {
			return havePattern(word.substring(index), patternSize, patternAlphabhet);
		}

	}
	
	/**
	 * Increments and returns the counter if find a pattern in the word.
	 * @param counter
	 * @param word
	 * @param patternSize
	 * @param patternAlphabhet
	 * @return
	 */
	public int countPattern(int counter, String word, int patternSize, String patternAlphabhet) {		
		if (havePattern(word, patternSize, patternAlphabhet)) {
			counter++;
		}
		return counter;
	}
	
	/**
	 * Increments and returns the counter for each pattern found within the text until counter is equals to patterNumberThreshold or search ends. 
	 * @param counter
	 * @param patterNumberThreshold
	 * @param text
	 * @param patternSize
	 * @param patternAlphabhet
	 * @return
	 */
	public int findPatterns(int counter, int patterNumberThreshold, StringBuffer[] text, int patternSize, String patternAlphabhet) {		
		int v=0;
		while(counter < patterNumberThreshold && v < text.length) {			
			counter = countPattern(counter, text[v].toString(), patternSize, patternAlphabhet);			
			v++;
		}		
		return counter;
	}
}
