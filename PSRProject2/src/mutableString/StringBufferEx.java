package mutableString;

public class StringBufferEx {
	public static void main(String[] args) 
	{
		StringBuffer buff = new StringBuffer("java");
		System.out.println("StringBuffer class:"+buff);
		buff.append("java programming ");
		buff.append(30);
		buff.append(70);
		//insert
		//buff.insert(4,"Python");
		//buff.setCharAt(7,'w');
		int length=buff.length();
		
		System.out.println("StringBuffer class:"+length);
		
		char ch =buff.charAt(0);
		buff.setLength(50);
		
		buff.capacity();
		buff.equals(buff);
		buff.deleteCharAt(8);
		
		
		System.out.println("StringBuffer class:"+buff.toString());
		
		String[] str= {"hello","java","programming"};
		System.out.println("Going to print string array"+str);
		
		Animal ani = new Animal();
		
		ani.display();

	}
}
