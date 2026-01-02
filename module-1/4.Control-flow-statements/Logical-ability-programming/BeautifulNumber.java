class BeautifulNumber {
    public static void main(String[] args) {

        int num = 1234;  
        int temp = num;

        int evenCount = 0;
        int oddCount = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            temp = temp / 10;
        }

        if (evenCount == oddCount) {
            System.out.println(num + " is a Beautiful Number");
        } else {
            System.out.println(num + " is NOT a Beautiful Number");
        }
    }
}
