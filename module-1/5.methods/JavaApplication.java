import java.util.Scanner;
class JavaApplication{
	public static void execution() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		// SpecialNumber.num(n);
		// HarshadNumber.num(a);
		// NeonNumber.num(a);
		// FactorialNumber.num(n);
		// ArmstrongNumber.num(n);
		// StrongNumber.num(n);
		// PrimeOrComposite.num(n);
		// PalindromeNumber.num(n);
		// PalindromePrimeOrComposite.num(n);
		// RamanujanNumber.num(n);
		DisariumNumber.num(n);
}
}












		// ArithmeticMethod.addition(2,2);
		// ArithmeticMethod.subtraction(1,4);
		// ArithmeticMethod.division(34,2);
		// ArithmeticMethod.multiplication(6,6);

		// NumberDisplayerSystem.series(-5,5);
		// NumberDisplayerSystem.series(10,-10);
		// NumberDisplayerSystem.series(0,0);

		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the starting point of integer type: ");
		// int s = sc.nextInt();
		// System.out.println("Enter the ending point of integer type: ");
		// int e = sc.nextInt();

		// NumberDisplayerSystem.series(s,e);























// import java.util.Scanner;

// class JavaApplication {

//     public static void execution() {

//         Scanner sc = new Scanner(System.in);
//         int choice;

//         do {
//             System.out.println("\nSelect Your Choice:");
//             System.out.println("1. Addition");
//             System.out.println("2. Subtraction");
//             System.out.println("3. Multiplication");
//             System.out.println("4. Division (Quotient & Remainder)");
//             System.out.println("5. Exit");

//             choice = sc.nextInt();

//             if (choice == 5) {
//                 System.out.println("Exiting Calculator...");
//                 return;  
//             }

//             if (choice >= 1 && choice <= 4) {
//                 System.out.print("Enter i value: ");
//                 int i = sc.nextInt();

//                 System.out.print("Enter j value: ");
//                 int j = sc.nextInt();

//                 BasicCalculator.calc(i, j, choice);
//             } 
//             else {
//                 System.out.println("Invalid choice!");
//             }

//         } while (choice != 5);
//     }
// }