import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int s = n * n;
        int c = n * n * n;

        System.out.println("The square of " + n + " is: " + s);
        System.out.println("The cube of " + n + " is: " + c);

        int sqrt = -1;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                sqrt = i;
                break;
            }
        }

        if (sqrt != -1)
            System.out.println("The squareroot of " + n + " is: " + sqrt);
        else
            System.out.println("The squareroot of " + n + " is not a perfect square");

        int cbrt = -1;
        for (int i = 1; i * i * i <= n; i++) {
            if (i * i * i == n) {
                cbrt = i;
                break;
            }
        }

        if (cbrt != -1)
            System.out.println("The cuberoot of " + n + " is: " + cbrt);
        else
            System.out.println("The cuberoot of " + n + " is not a perfect cube");
    }
}
