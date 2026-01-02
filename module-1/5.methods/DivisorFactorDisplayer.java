class DivisorFactorDisplayer{
	public static void factor(int n){
		if(n>0){
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
			sum=sum+i;
		}
	}
	if(sum<n){
		System.out.println(n+" is deficient number.");
	}
	if(sum==n){
		System.out.println(n+" is perfect number.");
	}
	if(sum>n){
		System.out.println(n+" is abundant number.");
	}
	}else{
		System.out.println("Invalid number!");
	}
	}
}