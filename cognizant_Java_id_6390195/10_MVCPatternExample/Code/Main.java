package Code;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("S101", "Anshul", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView(); 

        controller.setStudentName("Divyanshu");
        controller.setStudentGrade("B+");

        controller.updateView(); 
    }
}
