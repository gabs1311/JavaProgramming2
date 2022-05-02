package Week03;

public class UnaryReview {
    public static void main(String[] args) {

        int a =20;
        System.out.println("a++="+a++);//20
        System.out.println("a="+a);//21


        int x =12;
        if (++x>12){// pre-increment
            System.out.println("x in the IF statementpattrt:  "+ x);}else {
            System.out.println("x value in the X statement"+x);};


        if (x++>12){// post increment operator
            System.out.println("x in the IF statementpattrt:  "+ x);}else {
            System.out.println("x value in the X statement"+x);};

    }
}
