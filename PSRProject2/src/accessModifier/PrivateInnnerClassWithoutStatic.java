package accessModifier;

class PrivateInnerClassWithoutStatic {
	
	private class NestedClass {
		private void privateMethod() {
			System.out.println("This is a private method in the NestedClass.");
		}
	}

	public static void main(String[] args) {
		PrivateInnerClassWithoutStatic outer = new PrivateInnerClassWithoutStatic();

		// OuterClass.NestedClass nested = new OuterClass.NestedClass();
		PrivateInnerClassWithoutStatic.NestedClass nested = outer.new NestedClass();

		nested.privateMethod(); 
	}
}



/*
class PrivateInnerClassWithoutStatic {
	private static class NestedClass {
		private void privateMethod() {
			System.out.println("This is a private method in the NestedClass.");
		}
	}

	public static void main(String[] args) {
		PrivateInnerClassWithoutStatic outer = new PrivateInnerClassWithoutStatic();
		PrivateInnerClassWithoutStatic.NestedClass nested = new PrivateInnerClassWithoutStatic.NestedClass();
		nested.privateMethod(); 
	}
}
*/