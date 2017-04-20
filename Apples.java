

public class Apples {
	private String color;
	private int weight;
	
	public Apples(){
		this.color = "black";
		this.weight = 30;
	}
	public Apples(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString(){
		return "The color of the apple is: "+color+" and the weight is: "+weight+" ounces";
	}
}
