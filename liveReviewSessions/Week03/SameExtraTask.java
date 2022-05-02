package Week03;

public class SameExtraTask {
    public static void main(String[] args) {

        int b= 2;
        boolean res = ++b==2 ||--b==2 && --b==2;

              //          3       2         1// it is false because of the turn operator
        System.out.println(res);
    }
}
