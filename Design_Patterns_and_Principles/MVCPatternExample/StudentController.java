package MVCPatternExample;

class StudentController {

    private Student model;
    private StudentView view;

    StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    void setStudentName(String name) {
        model.setName(name);
    }

    void setStudentId(int id) {
        model.setId(id);
    }

    void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    void updateView() {
        view.displayStudentDetails(
                model.getName(),
                model.getId(),
                model.getGrade());
    }

}