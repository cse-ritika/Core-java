import java.util.Scanner;

class CIRUD {
    int id;
    String name;
    int age;

    void create(Scanner sc) {
        System.out.print("Enter the student id: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the student name: ");
        name = sc.nextLine();

        System.out.print("Enter the student age: ");
        age = sc.nextInt();

        System.out.println("Student is created successfully!");
    }

    void read() {
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void update(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter new Name: ");
        name = sc.nextLine();

        System.out.print("Enter new Age: ");
        age = sc.nextInt();

        System.out.println("Student record updated successfully!");
    }

    void delete() {
        id = 0;
        name = null;
        age = 0;

        System.out.println("Student record deleted successfully!");
    }
}
