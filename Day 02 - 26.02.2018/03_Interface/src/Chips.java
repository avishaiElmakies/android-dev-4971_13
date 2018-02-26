
public class Chips extends Food{

	@Override
	public void cookFood(int minutes) {
		System.out.println("cookFood in Chips");
		
	}


	@Override
	public void start() {
		System.out.println("Chips start - implementing IAction");
		
	}


	@Override
	public void stop() {
		System.out.println("Chips stop - implementing IAction");
		
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Chips info - Calories: "+super.getCalories()+ " Price: "+getPrice();

	}

}
