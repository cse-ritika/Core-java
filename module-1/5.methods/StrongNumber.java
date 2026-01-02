class StrongNumber {

    public static void num(int n) {
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int r = temp % 10;
            sum = sum + factorial(r);
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println(n + " is a Strong Number");
        } else {
            System.out.println(n + " is NOT a Strong Number");
        }
    }

    // factorial method
    static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
