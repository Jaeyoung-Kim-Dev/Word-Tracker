/**
 * 
 */
package application;

import contracts.BSTreeADT;
import problemdomain.Word;
import utilities.*;

/**
 * Class containing the apllication driver.
 * @author Jaeyoung Kim
 *
 */
public class WordTracker {
	private static final char PRINT_FILES = 'f';
	private static final char PRINT_FILES_LINES = 'l';
	private static final char PRINT_FILES_LINES_FREQUENCY = 'o';

	/**
	 * CEntry point to the word tracker program.
	 * @param args
	 */
	public static void main(String[] args) {
		BSTreeADT<Word> tree = new BSTReferenceBased<>(); 
		
		char printOption = 'f';
		String outputFile = null;
		
		for (String arg : args) {
			if (arg.equals("-pf")) {
				printOption = PRINT_FILES;
			} else if (arg.equals("-pl")) {
				printOption = PRINT_FILES_LINES;
			}  else if (arg.equals("-po")) {
				printOption = PRINT_FILES_LINES_FREQUENCY;
			}
		}

	}

}
