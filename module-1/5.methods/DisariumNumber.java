class DisariumNumber{
	public static void num(int n){
		int temp=n;
		int c=0;
		int sum=0;
		while(temp!=0){
			c++;
			temp=temp/10;
		}
		temp=n;
		while(temp>0){
			int r=temp%10;
			sum=sum+(int)Math.pow(r,c);
			temp=temp/10;
			c--;
		}
		if(sum==n){
			System.out.println(n+" is a Disarium Number.");
		}else{
			System.out.println(n+" is not a Disarium Number.");
		}
	}
}