import java.util.Scanner;

class MultiplicationTableOfForwardOrBackwardSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting point : ");
        int s = sc.nextInt();

        System.out.print("Enter the ending point : ");
        int e = sc.nextInt();

        if (s < e) {
            System.out.println("\nForward Series:");
            for (int i = s; i <= e; i++) {
                System.out.print(i + " ");
            }

            System.out.println("\n\nForward Multiplication Tables:");
            for (int i = s; i <= e; i++) {
                System.out.println("\nTable of " + i);
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        } 
        else if (s > e) {
            System.out.println("\nBackward Series:");
            for (int i = s; i >= e; i--) {
                System.out.print(i + " ");
            }

            System.out.println("\n\nBackward Multiplication Tables:");
            for (int i = s; i >= e; i--) {
                System.out.println("\nTable of " + i);
                for (int j = 10; j >= 1; j--) {   
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        } 
        else {
            System.out.println("\nSingle Number: " + s);
            System.out.println("\nBackward Multiplication Table of " + s);
            for (int j = 10; j >= 1; j--) {
                System.out.println(s + " x " + j + " = " + (s * j));
            }
        }
    }
}
