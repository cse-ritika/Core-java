class AutobiographicalNumber {
    public static void main(String[] args) {

        int n = 2020;
        int temp = n;  
        int count = 0;
        int sum = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = n;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }

        if (count == sum) {
            System.out.println("The number " + n + " satisfies the condition.");
        } else {
            System.out.println("The number " + n + " does not satisfy the condition.");
        }
    }
}
