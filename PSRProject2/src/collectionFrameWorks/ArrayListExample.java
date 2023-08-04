package collectionFrameWorks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
//import java.util.List;
//import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
		Vector<Object> arr = new Vector<>();

		for (int i = 0; i < 5; i++)
			arr.add(i);
		System.out.println("after adding: " + arr);

		arr.remove(3);
		System.out.println("after removing: " + arr);

		for (int i = 0; i < arr.size(); i++)
			System.out.println("Getting element:" + arr.get(i));

		Stack<String> stack = new Stack<>();
		stack.push("PSR");
		stack.push("Hostel");
		stack.push("Education");
		
		System.out.println("capacity of stack:"+stack.capacity());
		//stack.add("Engineering");
		
		System.out.println("after adding element: "+stack.add("Engineering"));

		Iterator<String> itr = stack.iterator();

		while (itr.hasNext()) {
			System.out.println("before poping the stack:"+itr.next() + " ");
		}
		System.out.println();
		
		stack.pop();
		
		itr=stack.iterator();
		while (itr.hasNext()) {
			System.out.println("after pop the stack:"+itr.next() + " ");
		}

	}
}
