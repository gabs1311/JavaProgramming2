package day30_CustomClassIntro.day30_CustomClassIntro;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Ana",'F', 24, 1234, 'A');

        Student student2 = new Student();
       student2. setInfo("Ina", 'F', 27, 475956, 'B');


        Student student3 = new Student();
        student3. setInfo("John", 'M', 21, 47567486, 'F');

        Student student4 = new Student();
        student4. setInfo("Ian", 'M', 24, 48458956, 'B');

        Student student5 = new Student();
        student5. setInfo("Inaz", 'F', 23, 698275956, 'A');

        Student[] students = { student1, student2, student3, student4, student5};
        for (Student student: students){
            System.out.println(student);
        }

        System.out.println("-------------------------------------");
        // how many are eligible for early birds

        ArrayList<Student>earlyBirds = new ArrayList<>();// gradeA
        ArrayList<Student>angryBirds = new ArrayList<>();
        for (Student student:students){
            if (student.grade=='A'){
               earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
            System.out.println(earlyBirds);
            System.out.println(angryBirds);
        }

    }
}
