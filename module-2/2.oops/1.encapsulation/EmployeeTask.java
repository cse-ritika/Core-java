public class EmployeeTask{
	private int id;
	private String name;
	private String mailId;
	private String dept;
	private double salary;

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getMailId(){
		return mailId;
	}
	public String getDept(){
		return dept;
	}
	public double getSalary(){
		return salary;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setMailId(String mailId){
		this.mailId=mailId;
	}
	public void setDept(String dept){
		this.dept=dept;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public void read() {
        if (id == 0) {
            System.out.println("No employee data available.");
            return;
        }

        System.out.println("\nEmployee Details:");
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Mail ID : " + mailId);
        System.out.println("Dept    : " + dept);
        System.out.println("Salary  : " + salary);
    }
    public void delete() {
        id = 0;
        name = null;
        mailId = null;
        dept = null;
        salary = 0;
    }

}