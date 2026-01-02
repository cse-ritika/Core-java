


// import java.util.Scanner;
// class JavaApplication{
// 	public static void execution(){
// 		EmployeeTask e=new EmployeeTask();
// 		int choice;
// 		do{
// 			System.out.println("Employee Details!");
// 			System.out.println("-------------------");
// 			System.out.println("1.Create");
// 			System.out.println("2.Insert");
// 			System.out.println("3.Read");
// 			System.out.println("4.Update");
// 			System.out.println("5.Delete");
// 			System.out.println("6.Exit");
// 			Scanner sc=new Scanner(System.in);
// 			System.out.print("Enter your choice: ");
// 			choice = sc.nextInt();

// 			sc.nextLine();

// 			switch(choice){
// 			case 1:
// 				System.out.println("Employee is created.");
// 				break;
// 			case 2:
// 				System.out.print("Enter ID: ");
//                 e.setId(sc.nextInt());
//                 sc.nextLine();

//                 System.out.print("Enter Name: ");
//                 e.setName(sc.nextLine());

//                 System.out.print("Enter Mail ID: ");
//                 e.setMailId(sc.nextLine());

//                 System.out.print("Enter Department: ");
//                 e.setDept(sc.nextLine());

//                 System.out.print("Enter Salary: ");
//                 e.setSalary(sc.nextDouble());

//                 System.out.println("Employee data inserted successfully.");
// 				break;
// 			case 3:
// 				e.read();
// 				break;
// 			case 4:
// 				System.out.print("Enter new Department: ");
//                 e.setDept(sc.nextLine());

//                 System.out.print("Enter new Salary: ");
//                 e.setSalary(sc.nextDouble());

//                 System.out.println("Employee data updated successfully.");
//                 break;
// 			case 5:
// 				e.delete();
//                 System.out.println("Employee data deleted successfully.");
//                 break;
// 			case 6:
// 				System.out.println("Exiting the program.....");
// 				break;
// 			default:
// 				System.out.println("Invalid choice!");
// 			}
// 		}while(choice!=6);
// 	}
// }






// class JavaApplication{
// 	public static void execution(){
// 		Student s = new Student();
// 		//indirect read operation - safe
// 		System.out.println(s.getId());
// 		System.out.println(s.getName());
// 		//indirect write operation - safe
// 		s.setId(1);
// 		s.setName("Raja");
// 		//indirect read operation - safe
// 		System.out.println(s.getId());
// 		System.out.println(s.getName());
// 	}
// }