class SoftwareDeveloper extends Employees{
	String designation;
	double salary;
	String role;
	double incentive;
	static String branch;
	static String department;
	static String company;

	static{
		city="Jalandhar";
		state="Punjab";
		country="India";
		branch="Amritsar";
		department="Software Developer";
		company="Capgemini";
	}
	public void task(){
		System.out.println("Software Development");
	}
	public void employeeInfo(){
		System.out.println("Employee Info!");
		System.out.println("----------------");
		System.out.println("Id : "+super.id);
		System.out.println("Name : "+super.name);
		System.out.println("Mail Id : "+super.mailId);
		System.out.println("Contact Number : "+super.contactNumber);
		System.out.println("Designation : "+this.designation);
		System.out.println("Salry : "+this.salary);
		System.out.println("Branch : "+this.branch);
		System.out.println("Department : "+this.department);
		System.out.println("Company : "+this.company);
		System.out.println("City : "+this.city);
		System.out.println("State : "+this.state);
		System.out.println("Country : "+country);
		System.out.println();
	}
}