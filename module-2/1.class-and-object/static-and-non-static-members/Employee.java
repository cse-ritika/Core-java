class Employee {

    int id;
    String name;
    String mailId;
    long contactNumber;
    long aadhaarNumber;
    long panNumber;
    String dob;
    int age;
    String gender;
    String maritalStatus;
    static String company;
    // String company;
    String branch;
    String department;
    String reportingManager;
    String designation;
    double salary;
    String role;
    long uanNumber;
    int yearOfExperience;
    String city;
    String state;
    String country;

    public void displayEmployeeDetails() {
        System.out.println("----- Employee Details -----");
        System.out.println("Company: " + company);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + mailId);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + yearOfExperience + " years");
        System.out.println("Location: " + city + ", " + state + ", " + country);
    }
}
