package day33_CustomClassStatics.day33_CustomClassStatics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

       Student student = new Student("Mary");
       Student student1 = new Student("Dana", 'F');
       Student student3 = new Student("Cristy",122);
       Student student4 = new Student("Mary",'F', 22);
       Student student5 = new Student("John",'M',27,12345);
       Student student6 =new Student("Mia",'F', 22,12345);
       Student student7 = new Student("Cindy",'F',23,95847,'A');


        System.out.println(student);


        Student []students ={student,student1,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));


    }
}
