class NeonNumber{
	public static void num(int a){
		int temp=a;
		int n = temp*temp;
		int sum=0;
		while(n!=0){
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		if(sum==a){
			System.out.println(a+" is neon number.");
		}else{
			System.out.println(a+" is not a neon number.");
		}
	}
}