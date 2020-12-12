/**
 * 
 */
package problemdomain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Jaeyoung Kim
 *
 */
public class Word implements Serializable {
	private String word;
	
	private int occurences; //counter
	
	private ArrayList<Integer> lineNumbers = new ArrayList<>();
	
	/**
	 * 
	 * @param word
	 */
	public Word(String word) {
		this.word = word;
	}

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * @return the lineNumbers
	 */
	public ArrayList<Integer> getLineNumbers() {
		return lineNumbers;
	}

	/**
	 * @param lineNumbers the lineNumbers to set
	 */
	public void setLineNumbers(ArrayList<Integer> lineNumbers) {
		this.lineNumbers = lineNumbers;
	}
	
	
}
