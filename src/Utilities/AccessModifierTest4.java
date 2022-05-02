package Utilities;

import day40_ProtectedAccesModifier_FinalKeyword.ProtectedAccessModifier;

public class AccessModifierTest4 extends ProtectedAccessModifier {
    public static void main(String[] args) {


     //   System.out.println(AccessModifierTest4.name1);//default is not visible outside the package
        System.out.println(AccessModifierTest4.name2);// protected is visible outside teh package in
                                                    // subclass only


      //  AccessModifierTest4.method1();// if it not visible out side the package, it cannot be inherited
        AccessModifierTest4.method2();
    }
}
