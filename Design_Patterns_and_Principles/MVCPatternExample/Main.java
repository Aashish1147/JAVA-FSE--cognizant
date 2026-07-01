package MVCPatternExample;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.setStudentName("Aashish");
        controller.setStudentId(101);
        controller.setStudentGrade("A");

        controller.updateView();

    }

}