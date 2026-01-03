class Sub extends Super {
	public String nsv="Sub";
	public void nsm(){
		System.out.println("nsm() of class Sub");
	}
	public void displaySubInfo(){
		System.out.println("display Sub class Info!");
		System.out.println(this.nsv);
		this.nsm();
		System.out.println();
	}
	public void displaySuperInfo(){
		System.out.println("display Super class Info!");
		System.out.println(super.nsv);
		super.nsm();
		System.out.println();
	}
}