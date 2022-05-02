package day34_StaticContinueGarbageCollectionAccesModifier;

public class Constructor_vs_StaticBlock {
    static{// will be 1st executed
        System.out.println("Static block");
    }
    public Constructor_vs_StaticBlock(){// will not get executed because it depends on
        // an object, and I have not created one
        System.out.println("constructor");

    }

    public static void main(String[] args) {// gets executed because Java executes
        // top to bottom
        System.out.println("Main method");
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();

    }
}
