class NumberVerifuerSystem {
	public static void main(String[] args) {
	
	int n =0;
	if((n<0) && (n%2==0)){
		System.out.println(n+" is Negative and Even number.");
	}
	if((n<0) && (n%2!=0)){
		System.out.println(n+" is Negative and Odd number.");
	}
	if((n==0) && (n%2==0) && (n/2==0)){
		System.out.println(n+" is a Neutral.");
	}
	if((n>0) && (n%2==0)){
		System.out.println(n+" is Positive and Even number.");
	}
	if((n>0) && (n%2!=0)){
		System.out.println(n+" is Positive and Even number.");
	}
}
}