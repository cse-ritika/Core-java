class SpecialNumber{
	public static void num(int n){
		int temp=n;
		int sum=0;
		int prod=1;
		while(temp!=0){
			int r = temp%10;
			sum=sum+r;
			prod = prod*r;
			temp = temp/10;
		}
		  if (sum + prod == n) {
            System.out.println(n + " is a Special Number");
        } else {
            System.out.println(n + " is NOT a Special Number");
        }
	}
}