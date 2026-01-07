import java.lang.Object;
class StudentContructorOverloading extends Object{
	String name;
	char gender;
	String dob;
	String mailId;
	long contactNumber;

	StudentContructorOverloading(String name,char gender,String dob){
		super();
		this.name=name;
		this.gender=gender;
		this.dob=dob;
	}
	StudentContructorOverloading(String name,char gender,String dob,String mailId){
		this(name,gender,dob);
		this.mailId=mailId;
	}

	StudentContructorOverloading(String name,char gender,String dob,String mailId,long contactNumber){
		this(name,gender,dob,mailId);
		this.contactNumber=contactNumber;	
	}
	public void displayStudentInfo(){
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("DOB : "+dob);
		System.out.println("MailId : "+mailId);
		System.out.println("Contact Number : "+contactNumber);
		System.out.println();
	}
}