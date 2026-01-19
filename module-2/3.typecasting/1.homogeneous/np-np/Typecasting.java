class Typecasting{
	public static void upcastingDowncasting(){
		Employees e;

		e=new SoftwareDeveloper();
		e.entry();
		e.login();
		e.shortBreak();
		e.meeting();
		e.longbreak();
		e.logout();
		e.exit();

		//specific container
		SoftwareDeveloper sd=(SoftwareDeveloper)e;
		sd.employeeInfo();
		sd.task();

		System.out.println();

		e = new SoftwareTester();

		e.entry();
		e.login();
		e.shortBreak();
		e.meeting();
		e.longbreak();
		e.logout();
		e.exit();

		SoftwareTester st=(SoftwareTester)e;
		st.employeeInfo();
		st.task();
	}
}