class Employees{
	int id;
	String name;
	String mailId;
	long contactNumber;
	static String city;
	static String state;
	static String country;
	public void entry(){
		System.out.println("Employee entered into the campus!");
	}
	public void login(){
		System.out.println("Employee login into the campus!");
	}
	public void shortBreak(){
		System.out.println("Employee went for tea!");
	}
	public void meeting(){
		System.out.println("Employee is in the meeting!");
	}
	public void longbreak(){
		System.out.println("Employee went for lunch!");
	}
	public void logout(){
		System.out.println("Employee logged out!");
	}
	public void exit(){
		System.out.println("Employee exit the campus!");
	}
}