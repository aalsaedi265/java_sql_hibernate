

package errorHandel.bankEx;

public class insufficentFund extends Exception {
    
    private String message;
	
	// Constructor
	public insufficentFund (String message) {
		this.message = message;
	}
    // getter method of message
	public String getMessage() {
		return message;
	}
}
