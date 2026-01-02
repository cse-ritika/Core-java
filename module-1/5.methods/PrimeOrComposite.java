class PrimeOrComposite{
	public static void num(int n){
		int c=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				c++;
			}
		}
		if(c==2){
			System.out.println(n+" is a Prime number.");
		}else{
			System.out.println(n+" is a Composite number.");
		}
	}
}