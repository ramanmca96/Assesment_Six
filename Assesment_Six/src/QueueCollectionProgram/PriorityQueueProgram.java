package QueueCollectionProgram;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueProgram {

	public static void main(String[] args) {
		
		PriorityQueue<String> Obj =new PriorityQueue<String>();
		
		Obj.offer("Raman");
		Obj.offer("Rishi");
		Obj.offer("Sparrow");
		Obj.offer("Richard");
		
		
		System.out.println(Obj);
		
		String element = Obj.element();
		for (String string : Obj) {
			System.out.println(string);
		}
		
		String peek = Obj.peek();
		System.out.println("Peek Method Return Value:" +" " +peek);
		
		System.out.println("After Removal:");
		 Obj.poll();
		 Obj.remove();
		
		 Iterator<String> iterator = Obj.iterator();
		 while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		
	}
	
}
