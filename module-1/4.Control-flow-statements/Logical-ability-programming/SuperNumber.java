class SuperNumber {
    public static void main(String[] args) {

        int num = 123321;  
        int temp = num;

        int evenSum = 0;
        int oddSum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit % 2 == 0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }

            temp = temp / 10;
        }

        if (evenSum == oddSum) {
            System.out.println(num + " is a Super Number");
        } else {
            System.out.println(num + " is NOT a Super Number");
        }
    }
}
