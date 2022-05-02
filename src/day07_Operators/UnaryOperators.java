package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 =+ 25;
        int num2 = -25;
        System.out.println(num1< 0);// it gives me false
        System.out.println(num2< 0 );// it gives me true


        System.out.println("--------------------------------------------------");

        int a  = 5;
        ++a; // pre increment = increases the value by one immediately
        System.out.println(a);
        --a;//pre decrement = decreases the value by one immediately
        System.out.println(a);
        System.out.println("-----------------------------------------");


        int b =100;
        System.out.println(++b);//pre- increment =  in increaseas the value by one right away

        int c =100;
        System.out.println(c++);// post increment= first it passes the current value, thn increases the value by 1
        System.out.println(c);// 101

        System.out.println("---------------------------------------------");

        int x = 200;
        System.out.println(--x);// pre decrement = decreases the value by 1 right away

        int y=200;

        System.out.println(y--);// post decrement: it has two steps before changing the value. In the 1st step, it is going
                                //to pass the current value. In the 2nd step, it is going to decrease the
                                // value by 1
        System.out.println(y);// being the 2nd step, it gives 199


        System.out.println("----------------------------");
        int z = 45;
        System.out.println(++z);// being pre increment, it increases the value by one right away z=46
        System.out.println(z++);// being post increment, in the 1st step it will pass the current value
        System.out.println(z);// being post increment, in the 2nd step the value will be increased by 1


        int q  = 30;

        System.out.println(--q);// being pre decrement, it decreses the valkue by 1 right away q=29
        System.out.println(q--);// being post decrement, 1st step will be to pass the same value
        System.out.println(q);// being post decrement, the 2nd step will decrease the value by 1









    }
}
