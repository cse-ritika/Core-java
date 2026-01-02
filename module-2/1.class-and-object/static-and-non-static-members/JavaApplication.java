import java.util.Scanner;
class JavaApplication{
    public static void execution(){
        Student s1=new Student(1,"Raja","raja@gmail.com",9876543210l);
        System.out.println("Student1 : "+s1);
        s1.displayStudentDetails();
        Student s2=new Student(2,"Rani","rani@gmail.com",9876543211l);
        System.out.println("Student2 : "+s2);
        s2.displayStudentDetails();

        // Test t1=new Test();
        // Test t2=new Test();
    }
}










// class JavaApplication {
//     public static void execution() {

//         Scanner sc = new Scanner(System.in);
//         CIRUD s = new CIRUD();
//         int choice;

//         do {
//             System.out.println("\n--- Student CRUD Menu ---");
//             System.out.println("1. Create");
//             System.out.println("2. Read");
//             System.out.println("3. Update");
//             System.out.println("4. Delete");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");

//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     s.create(sc);
//                     break;
//                 case 2:
//                     s.read();
//                     break;
//                 case 3:
//                     s.update(sc);
//                     break;
//                 case 4:
//                     s.delete();
//                     break;
//                 case 5:
//                     System.out.println("Exiting program...");
//                     break;
//                 default:
//                     System.out.println("Invalid choice!");
//             }
//         } while (choice != 5);
//     }
// }


















// class JavaApplication{
//     public static void execution(){
//         System.out.println(Members.sv);
//         Members.sm();

//         Members m=new Members();
//         System.out.println(m.nsv);
//         m.nsm();
//     }
// }








// class JavaApplication {

//     public static void execution() {

//         Employee.company = "Capgemini";

//         Employee e = new Employee();

//         e.id = 1;
//         e.name = "Raja";
//         e.mailId = "raja@gmail.com";
//         e.contactNumber = 9876543210L;
//         e.aadhaarNumber = 1234432156788765L;
//         e.panNumber = 1234657L;
//         e.dob = "21/03/2005";
//         e.age = 20;
//         e.gender = "Female";
//         e.maritalStatus = "Single";
//         // e.company="Capegemini";
//         e.branch = "CSE";
//         e.department = "Developers";
//         e.reportingManager = "Ram";
//         e.designation = "Software Developer";
//         e.salary = 60000;
//         e.role = "Software";
//         e.uanNumber = 123456789L;
//         e.yearOfExperience = 3;
//         e.city = "Jalandhar";
//         e.state = "Punjab";
//         e.country = "India";

//         e.displayEmployeeDetails();
//     }
// }





// class JavaApplication{
// 	public static void execution(){
		// Student.city="Jalandhar";
		// Student.state="Punjab";
		// Student.country="India";

		// Student s1 = new Student();
		// System.out.println("student1 : "+s1);
		// s1.id=1;
		// s1.name="Raja";
		// s1.mailId="raja@gmail.com";
		// s1.contactNumber=9876543210l;
		// s1.displayStudentDetails();


		// Student s2 = new Student();
		// System.out.println("student1 : "+s2);
		// s2.id=2;
		// s2.name="Rani";
		// s2.mailId="rani@gmail.com";
		// s2.contactNumber=9876543211l;
		// s2.displayStudentDetails();
// 	}
// }