
	import java.util.*;
	public class LinkedListDemo {

	   public static void main(String args[]) {
// create a linked list
//ll stands for LinkedList
	      LinkedList<String> ll = new LinkedList();
	      
	      
// add elements to the linked list (from the top of it.)
	      ll.add("B");	
	      ll.add("B"); 
//Notice how I can have duplicate "nodes" in the list.
	      ll.add("D");
	      ll.add("E");
	      ll.add("C");
	      System.out.println("Original contents of ll: " + ll+"\n\n\n\n\n");
	      ll.addLast("Z");
	      ll.addFirst("A");
	      ll.add(1, "A2");
//What does it look like now?
	      System.out.println("Original contents of ll(After adding in Z last, A first, and A2 to index 1): " + ll+"\n\n\n\n\n");

	      // finds and removes elements from the linked list
	      ll.remove("F");
	      // removes element 2
	      ll.remove(2);
//what does it look like now?
	      //Prints out elements after the previous two elements are removed.
	      System.out.println("Contents of ll after deletion: " + ll);
	      
	      // remove first and last elements
	      ll.removeFirst();
	      ll.removeLast();
	      System.out.println("ll after deleting first and last: " + ll);

	      // get and set a value
	      Object val = ll.get(2);
	      ll.set(2, (String) val + " Changed");
	      System.out.println("ll after change: " + ll);
	      
	      // These is a demonstration for how linked list work but how do they work is the question we will be exploring.
	   }
	}