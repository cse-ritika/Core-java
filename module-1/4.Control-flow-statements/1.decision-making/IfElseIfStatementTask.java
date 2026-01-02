class IfElseIfStatementTask{
	public static void main(String[] args) {
		char signal = 'b';
		if((signal == 'R') || (signal == 'r')){
			System.out.println("Please stop! Have some patience!");
		}
		else if((signal == 'Y') || (signal == 'y')){
			System.out.println("Please get set ready! Have some excitement!");
		}
		else if((signal == 'G') || (signal == 'g')){
			System.out.println("Please get lost! Have some ethics!");
		}
		else{
			System.out.println("Do whatever you want!");
		}
	}
}