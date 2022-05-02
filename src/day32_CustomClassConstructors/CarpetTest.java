package day32_CustomClassConstructors;

public class CarpetTest {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(12,23,324,true);
        Carpet carpet2 = new Carpet(2,4,8,false);
        System.out.println(carpet);
        System.out.println(carpet2);
    }
}
