class PalindromePrimeOrComposite {

    public static void num(int n) {
        int temp = n;
        int rev = 0;

        while (temp != 0) {
            int r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }

        if (rev == n) {
            System.out.println(n + " is a Palindrome");

            if (isPrime(n)) {
                System.out.println(n + " is Prime");
            } else {
                System.out.println(n + " is Composite");
            }
        } else {
            System.out.println(n + " is NOT a Palindrome");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
