package staticvariable;


public class StaticVar1 {
    // Static variable
    static int staticVariable = 10;

    // Instance variable
    int instanceVariable = 20;

    public void method() {
        // Local variable
        int localVariable = 30;

        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Local variable: " + localVariable);
    }

    public static void main(String[] args) {
    	StaticVar1 obj1 = new StaticVar1();
    	StaticVar1 obj2 = new StaticVar1();

        obj1.method();
        System.out.println("-------");

        obj2.method();

        // Modifying static variable
        staticVariable = 100;

        System.out.println("Static variable value changed.");
        obj1.method();
        System.out.println("-------");
        obj2.method();
    }
}

