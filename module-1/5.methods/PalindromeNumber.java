class PalindromeNumber{
	public static void num(int n){

	int temp=n;
	int digit=0;

	while(temp!=0){
		int r=temp%10;
		digit = digit*10+r;
		temp=temp/10;
	}
	if(n==digit){
		System.out.println(n+" is a Palindrome Number.");
	}else{
		System.out.println(n+" is not a Palindrome Number.");
	}		
	}
}