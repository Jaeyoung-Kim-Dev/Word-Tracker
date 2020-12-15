/**
 * 
 */
package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.Scanner;

import contracts.BSTNodeADT;
import contracts.BSTreeADT;
import problemdomain.Word;
import utilities.*;

/**
 * Class containing the application driver.
 * 
 * @author Jaeyoung Kim
 *
 */
public class WordTracker {
	private static final char PRINT_FILES = 'f';
	private static final char PRINT_FILES_LINES = 'l';
	private static final char PRINT_FILES_LINES_FREQUENCY = 'o';

	/**
	 * CEntry point to the word tracker program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BSTreeADT<Word> tree = new BSTReferenceBased<>();

		String filename = null;

		// boolean a = tree.hasLeftChild((BSTNodeADT<Word>) tree);

		char printOption = 'f';
		String outputFile = null;

		for (String arg : args) {
			if (arg.equals("-pf")) {
				printOption = PRINT_FILES;
			} else if (arg.equals("-pl")) {
				printOption = PRINT_FILES_LINES;
			} else if (arg.equals("-po")) {
				printOption = PRINT_FILES_LINES_FREQUENCY;
			} else if (arg.startsWith("-f")) {
				filename = arg.substring(2);
			}
		}

		try {
			File file = new File(filename);
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				String readWord = sc.next().replaceAll("[^a-zA-Z0-9]", "");
				if (readWord != "" || readWord != null) {
					tree.add(new Word(readWord));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(tree.iterator().hasNext()) {
			System.out.print((tree.iterator().next()).getWord());
		}

	}
}
