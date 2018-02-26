
public class Cashier extends Person implements IAction{

	private int shiftHours;
	
	public Cashier(int age, String fullName, int shiftHours) {
		super(age, fullName);
		this.shiftHours=shiftHours;
	}
	
	public int getShiftHours() {
		return shiftHours;
	}
	public void setShiftHours(int shiftHours) {
		
		//validation that shiftHours is max 12 hours
		this.shiftHours = (shiftHours>12)?12 :shiftHours;
	}

	@Override
	public void start() {
		System.out.println("Cashier start - implementing IAction");
		
	}

	@Override
	public void stop() {
		System.out.println("Cashier stop - implementing IAction");
		
	}


}
