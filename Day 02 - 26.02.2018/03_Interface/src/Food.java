
public abstract class Food implements IAction, IPrint{

	//declare a function without body
	//must be implemented in all sub classes
	public abstract void cookFood(int minutes);
	
	private int price;
	private int calories;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = (price>10 && price<100)?price:10;
	}
	
	
	
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = (calories>0 && calories<1000)?calories:0;
	}
}
