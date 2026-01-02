class ConditionalOperation{
	public static void main(String[] args) {
		int i =10;
		System.out.println("Content of i : "+i);

		int j =50;
		System.out.println("Content of j : "+j);

		boolean c = i>j;
		System.out.println("Content of c : "+c);

		int r = c ? (i+j) : (i*j);
		//indirect Utilization
		System.out.println("Content of r is : "+r);

		//direct Utilization
		System.out.println(c ? 'J' : "Java");
	}
}