class BitwiseOperator{
	public static void main(String[] args) {
        int a = 5;   // 0101
        int b = 3;   // 0011

        // Bitwise AND (&)
        System.out.println(a & b);   // 0001 → 1

        // Bitwise OR (|)
        System.out.println(a | b);   // 0111 → 7

        // Bitwise XOR (^)
        System.out.println(a ^ b);   // 0110 → 6

    }
}