public class StringLinkedListDemo{
	public static void main(String[] args){
	StringLinkedList list = new StringLinkedList();
	//Adds links
	list.addANodeToStart("One");
	list.addANodeToStart("Two");
	list.addANodeToStart("Three");
	//Print out the amount of entries
	System.out.println("List has " + list.length() +" entries."+"\nhere is the list nodes: ");
	
	// This will show the list
	list.showList();
	
	//Checks if the node in the list.
		if (list.onList("Three"))
		System.out.println("Three is on list.");
		else
		System.out.println("Three is NOT on list.");
	
	//Does this delete things from the end or beginning?
	list.deleteHeadNode();
	
	//Checks if the node is the list.
		if (list.onList("Three"))
		System.out.println("Three is on list.");
		else
		System.out.println("Three is NOT on list.");
	//deletes nodes.
	list.deleteHeadNode();
	list.deleteHeadNode();
	System.out.println("Start of list: (If nothing appears there is nothing in the list)");
	list.showList();
	System.out.println("End of list(Did something show up?)");
	}
}
