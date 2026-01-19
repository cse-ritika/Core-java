class JavaApplication{
	public static void execution(){
		Facebook f=new Facebook();
		f.open();
		f.signUp();
		f.signIn();
		f.signOut();
		f.close();

		Instagram i=new Instagram();
		i.open();
		i.signUp();
		i.signIn();
		i.signOut();
		i.close();








		// Textbook t=new Textbook();
		// t.read();

		// Notebook n=new Notebook();
		// n.write();



		// Concrete c=new Concrete();
		// c.nsm1();
		// c.nsm2();



		// System.out.println(SuperInterface.c);
		// SuperInterface.sm();

		// System.out.println();

		// System.out.println(SubConcreteClass.c);

		// SubConcreteClass sb=new SubConcreteClass();
		// sb.nsm();
	}
}