class JavaApplication {
    public static void execution() {

        Student s = new Student(1, "Rani", "rani@gmail.com", 9876543210L);
        s.displayStudentInfo();

        Project project = new Project(1, "E-commerce", "Java based Web Application");

        s.createProject(project);
        s.readProject();
        s.updateProject(1, "AirLine Reservation System", "JavaScript based Web Application");
        s.readProject();
        s.deleteProject(1);
    }
}
