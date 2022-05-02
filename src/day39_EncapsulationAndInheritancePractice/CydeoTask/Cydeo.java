package day39_EncapsulationAndInheritancePractice.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Tester tester =new Tester("Mary", 25, 'f', 12,"SDET",123456);
        Developer dev = new Developer("Dan", 47, 'm', 47, "dev", 234567);
        Teacher teacher = new Teacher("Muhtar", 30, 'm',007, "instructor", 234567);
        Student student =new Student("Jay",22,'f',123,"history");


        System.out.println(tester);
        System.out.println(dev);
        System.out.println(teacher);
        System.out.println(student);

        teacher.setAge(45);
        System.out.println(teacher.getAge());
        System.out.println(teacher);



        dev.work();
        dev.fixingBugs();

        student.study();
        teacher.work();
        teacher.drink();
        student.drink();
        tester.createTicket();
        tester.sleep();
    }
}
/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */