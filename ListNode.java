

public class ListNode{
	private String data;
	private ListNode link;
//Default Constructor
	public ListNode(){
		link = null;
		data = null;
	}
//Constructor
	public ListNode(String newData, ListNode linkValue){
		data = newData;
		link = linkValue;
	}
//Sets the data
	public void setData(String newData){
		data = newData;
	}
//Retrieves the data
	public String getData(){								
		return data;
	}
//Sets the link as the node.
	public void setLink(ListNode newLink){	
		link = newLink;
	}
//Returns the link/'node' related to this node
	public ListNode getLink(){
		return link;
	}
}