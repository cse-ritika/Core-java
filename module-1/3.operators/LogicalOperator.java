class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Logical AND (&&)
        System.out.println(a > 5 && b > 15);  // true && true → true

        // Logical OR (||)
        System.out.println(a > 15 || b > 15); // false || true → true

        // Logical NOT (!)
        boolean flag = false;
        System.out.println(!flag);  // !false → true
    }
}
