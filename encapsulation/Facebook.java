/*
 * Encapsulation: Wrapping up of data member(variable) and function member(method) in order to form a single unit is called as encapsulation.
 * 
 * How To Achieve:
 * 1. Declare all the data members as private.
 * 2. Restrict its direct access outside the class.
 * 3. Provide indirect access by using public services called getters and setters.
 */

package encapsulation;

public class Facebook {
	
	// Private Data Members
	
	private String username;
	private String password;
	
	
	// Constructor - It will initialize initial Value.
	
	public Facebook(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// getters and setters
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
