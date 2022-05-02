package day34_StaticContinueGarbageCollectionAccesModifier;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){
        this.studentName = studentName;
        schoolName = "Cydeo school";

    }

}
class CydeoStudentObject{
    public static final CydeoStudentObject STUDENT_1 = new CydeoStudentObject();

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jenny");
        CydeoStudent student2 = new CydeoStudent("Kim");
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }
}