class IncrementOperator{
	public static void main(String[] args) {
		int i = 10;
		System.out.println("The content of i : "+i);
		int j = 20;
		System.out.println("The content of j : "+j);

		int inc = ++i - j++ + i++ - ++j;
		System.out.println("Content of increment is : "+inc);

		System.out.println();

		System.out.println("Content of i is : "+i);
		System.out.println("Content of j is : "+j);
	}
}