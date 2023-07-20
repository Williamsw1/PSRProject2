package staticvariable;


public class StaticVarMethod 
{
    // Static variable
    static int staticVariable = 10;

    // Instance variable
    int instanceVariable = 20;
    static int count=0;

    public static void method() {
        // Local variable
        int localVariable = 30;

        System.out.println("Static variable: " + staticVariable);
        //System.out.println("Instance variable: " +instanceVariable);
        System.out.println("Local variable: " + localVariable);
    }

    public static void main(String[] args) 
    {
    	StaticVarMethod  obj1 = new StaticVarMethod ();
    	StaticVarMethod  obj2 = new StaticVarMethod ();

        System.out.println("Before "+obj1.instanceVariable);
        StaticVarMethod.method();
        obj1.instanceVariable=200;
        System.out.println("After"+obj1.instanceVariable);
        System.out.println("-------");

        StaticVarMethod.method();

        // Modifying static variable
        staticVariable = 100;

        System.out.println("Static variable value changed.");
        StaticVarMethod.method();
        System.out.println("-------");
        StaticVarMethod.method();
        System.out.println("Static variable value is:"+StaticVarMethod .staticVariable);
        System.out.println("Static variable value is:"+StaticVarMethod .staticVariable);
        StaticVarMethod.method();
        StaticVarMethod.method();
        //System.out.println(StaticVarMethod.localVariable);
    }
}


