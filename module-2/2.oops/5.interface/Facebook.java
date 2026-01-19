class Facebook extends SoftwareApplication {
	@Override
	public void open(){
		System.out.println("Facebook opened!");
	}
	@Override
	public void signUp(){
		System.out.println("Facebook signed Up!");
	}
	@Override
	public void signIn(){
		System.out.println("Facebook signed In!");
	}
	@Override
	public void signOut(){
		System.out.println("Facebook signed Out!");
	}
	@Override
	public void close(){
		System.out.println("Facebook closed!");
	}
}