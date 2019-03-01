

class User {
	int userId;
	String userName;
	String userQual;
	
	public User(int userId, String userName, String userQual) { 
		super();
		this.userId = userId;
		this.userName = userName;
		this.userQual = userQual;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserQual() {
		return userQual;
	}
	public void setUserQual(String userQual) {
		this.userQual = userQual;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userQual=" + userQual + "]";
	}
	
	
	
}
