package classTypesPrviateMethods;

public class OuterInnerClasses {

	private void privateMethod() {
		System.out.println("Private method");
	}

	public class NestedClass {
		public void accessPrivateMethod() {
			privateMethod();
		}
	}

	public static void main(String[] args) {
		OuterInnerClasses outer = new OuterInnerClasses();
		OuterInnerClasses.NestedClass nestedobj = outer.new NestedClass();
		nestedobj.accessPrivateMethod();
	}

}
