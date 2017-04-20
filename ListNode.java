package example_2;

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
	public void setLink(ListNode newLink){	//
		link = newLink;
	}
	public ListNode getLink(){
		return link;
	}
}