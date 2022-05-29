package day41_Exceptions;

import day29_ArrayList_Collections.day39_EncapsulationAndInheritancePractice.CydeoTask.Employee;

public class MultiCatchClass {

    public static void main(String[] args) {
        Employee employee = null;

        try {
            System.out.println(employee.getSalary());// this is Noul Pointer Exception
        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch(RuntimeException e){
            System.out.println("Forth catch block");
            e.printStackTrace();
        }


        System.out.println("============================");


        try {
            System.out.println("Java".charAt(-1));
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }
}
