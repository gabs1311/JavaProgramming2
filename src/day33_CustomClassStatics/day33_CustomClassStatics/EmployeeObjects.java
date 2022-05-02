package day33_CustomClassStatics.day33_CustomClassStatics;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmed";


        Employee employee2 = new Employee();

        employee2.name = "Gina";

        Employee employee3 = new Employee();
        employee3.name = "Mary";

        Employee employee4 = new Employee();
        employee4.name= "Davis";


        System.out.println(employee1.name);
        System.out.println(employee2.name);
        System.out.println(employee3.name);
        System.out.println(employee4.name);
    }
}
