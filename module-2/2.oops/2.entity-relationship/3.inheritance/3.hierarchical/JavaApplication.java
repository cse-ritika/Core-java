class JavaApplication{
	public static void execution(){
		Oracle o=new Oracle();
		o.url="www.oracle.com";
		o.username="Raja";
		o.password="Raja@143";
		o.displayOracleDBInfo();
		o.connection();
		o.crudOperation();
		o.disconnection();

		MySQL m=new MySQL();
		m.url="www.mysql.com";
		m.username="Rani";
		m.password="Rani@143";
		m.displayMySQLDBInfo();
		m.connection();
		m.crudOperation();
		m.disconnection();
	}
}