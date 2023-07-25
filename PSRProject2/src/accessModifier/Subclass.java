package accessModifier;

class OuterClass {
    private void display()
    {
        System.out.println("This is private method");
    }
    protected class NestedClass {
        protected void protectedMethod() {
           display();
        }
    }

    // public static void main(String[] args) {
    //     OuterClass outer = new OuterClass();
    //     OuterClass.NestedClass nested =outer.new NestedClass();
    //     nested.protectedMethod(); // This will work since protectedMethod is accessible in the subclass.
    // }
}

class Subclass extends OuterClass {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        Subclass.NestedClass nested = subclass.new NestedClass();
        nested.protectedMethod(); // This will work as well since protectedMethod is inherited and accessible.
    }
}
