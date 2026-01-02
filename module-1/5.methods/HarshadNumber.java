class HarshadNumber {

    public static void num(int a) {
        int n = a;
        int sum = 0;

 
        while (n != 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }


        if (a % sum == 0) {
            System.out.println(a + " is a Harshad Number");
        } else {
            System.out.println(a + " is NOT a Harshad Number");
        }
    }
}