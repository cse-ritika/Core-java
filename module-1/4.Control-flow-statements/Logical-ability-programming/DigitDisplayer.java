class DigitDisplayer{
	public static void main(String[] args) {
		int n = 12345;
		int r = 0;
		for(int i = n; i!=0; i=i/10){
			r=i%10;
			System.out.println(r);
		}
	}
}