import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student newStudent = new Student("Cory", 7618, 1, 4.0);
        Teacher newTeacher = new Teacher("Gary", "Oak", "Battles", 25);

        System.out.println("**********\nNew Student\n**********\nName: " + newStudent.getName() + "\nID: " + newStudent.getStudentId() + "\nCredits: " + newStudent.getNumberOfCredits() + "\nGPA: " + newStudent.getGpa() + "\n**********");
        System.out.println("New Teacher\n**********\n" + newTeacher.getFirstName() + " " + newTeacher.getLastName() + "\nSubject: " + newTeacher.getSubject() + "\nYears Teaching: " + newTeacher.getYearsTeaching());
    }
}
