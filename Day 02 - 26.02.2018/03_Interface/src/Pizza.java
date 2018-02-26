
public  class Pizza extends Food {

	@Override
	public void cookFood(int minutes) {
		// TODO Auto-generated method stub
		System.out.println("cookFood in pizza");
	}
	

	public void slicePizza(int numOfSlices) {
		System.out.println("slicePizza in pizza");
		
	}


	@Override
	public void start() {
		System.out.println("Pizza start - implementing IAction");
		
	}


	@Override
	public void stop() {
		System.out.println("Pizza stop - implementing IAction");
		
	}


	@Override
	public String print() {
		return "Pizza info - Calories: "+super.getCalories()+ " Price: "+getPrice();
	}
}
