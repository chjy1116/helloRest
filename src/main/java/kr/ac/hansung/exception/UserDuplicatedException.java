package kr.ac.hansung.exception;

public class UserDuplicatedException extends RuntimeException {

	private static final long serialVersionUID = 8243872807814294582L;
	private String username;
	
	public UserDuplicatedException(String username) {
		super();
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
}
