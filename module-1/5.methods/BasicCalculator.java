class BasicCalculator {

    public static void calc(int i, int j, int choice) {

        switch (choice) {

            case 1:
                System.out.println("1. Addition");
                System.out.println("Result = " + (i + j));
                break;

            case 2:
                System.out.println("2. Subtraction");
                System.out.println("Result = " + (i - j));
                break;

            case 3:
                System.out.println("3. Multiplication");
                System.out.println("Result = " + (i * j));
                break;

            case 4:
                System.out.println("Division");
                if (j != 0) {
                    int quotient = i / j;
                    int remainder = i % j;
                    System.out.println("Quotient = " + quotient);
                    System.out.println("Remainder = " + remainder);
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            case 5:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid choice! Please try again!");
        }
    }
}
