import java.util.LinkedList;

public class LinkListApples {
	public static void main(String [] args){

/* Methods you can use:
	add()
	remove()
	addFirst()
	addLast()
	set(int, node);
	
	
	poll() Retrieves and removes the head (first element) of this list.
	
	
		
		*/
	    LinkedList rowOfApples = new LinkedList();  
	    Apples apple1 = new Apples("Red", 20);
	    rowOfApples.add(apple1);
	    Apples apple2 = new Apples("Orange",30);
	    rowOfApples.add(apple2);
	    Apples apple3 = new Apples("Green",40);
	    rowOfApples.add(apple3);
	    Apples apple4 = new Apples("Blue",50);
	    rowOfApples.add(apple4);
	    //Prints out apples
	    for(int i=0; i<rowOfApples.size(); i++){
	    	System.out.println(i+".| "+rowOfApples.get(i));
	    }
	    
	    System.out.println()
	    Apples appleThatGoesInFirstRow = new Apples("Red", 60);
	    rowOfApples.addFirst(appleThatGoesInFirstRow);
	    //Prints out apples with first apple added to list
	    for(int i=0; i<rowOfApples.size(); i++){
	    	System.out.println(i+".| "+rowOfApples.get(i));
	    }
	    Apples applesThrownAway= (Apples) rowOfApples.poll();
	    
	    Apples appleThatGoesInLastRow = new Apples("Red", 60);
	    
	    
	    rowOfApples.addLast(appleThatGoesInLastRow);
	    //Prints out changes with the apples but now with the last
	    for(int i=0; i<rowOfApples.size(); i++){
	    	System.out.println(i+".| "+rowOfApples.get(i));
	    }
	   
	}
}
