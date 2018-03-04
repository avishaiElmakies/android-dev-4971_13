
public abstract class Food {

	
	
	public Food(){
		System.out.println("in Food constructor");
	}
	//declare a function without body
	//must be implemented in all sub classes
	public abstract void cookFood(int minutes);
}
