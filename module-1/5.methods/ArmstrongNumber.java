class ArmstrongNumber {
    public static void num(int n) {
        int temp = n, count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int sum = 0;
        temp = n;

        while (temp != 0) {
            int r = temp % 10;
            sum += (int)Math.pow(r, count);
            temp /= 10;
        }

        if (sum == n)
            System.out.println(n + " is an Armstrong Number");
        else
            System.out.println(n + " is NOT an Armstrong Number");
    }
}
