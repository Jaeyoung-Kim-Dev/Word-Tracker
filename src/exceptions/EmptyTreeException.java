package exceptions;

/**
 * Empty stack exception
 * 
 * @author Jaeyoung Kim
 * 
 */
@SuppressWarnings("serial")
public class EmptyTreeException extends Exception {

	public EmptyTreeException()
	{
		super();
	}

	/**
	 * @param message error message specific to cause of error.
	 */
	public EmptyTreeException(String message)
	{
		super(message);
	}
}
