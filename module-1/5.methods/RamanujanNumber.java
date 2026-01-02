class RamanujanNumber {

    public static void num(int n) {

        int temp = n;
        int sum = 0;

        // Step 1: Sum of digits
        while (temp != 0) {
            int r = temp % 10;
            sum += r;
            temp = temp / 10;
        }

        int originalSum = sum;  

        // Step 2: Reverse of sum
        int rev = 0;
        while (sum != 0) {
            int s = sum % 10;
            rev = rev * 10 + s;
            sum = sum / 10;
        }

        // Step 3: Check Ramanujan condition
        if (originalSum * rev == n) {
            System.out.println(n + " is a Ramanujan Number.");
        } else {
            System.out.println(n + " is NOT a Ramanujan Number.");
        }
    }
}
