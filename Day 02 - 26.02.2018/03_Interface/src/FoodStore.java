

public class FoodStore implements IPrint{
	private Food[] foodArray;
	private Cashier[] CashierArray;
	int cashierCounter=0;
	int foodCounter=0;

	

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "FoodStore info - cashierCounter: "+cashierCounter+ " foodCounter: "+foodCounter;

	}
	public FoodStore(int numOfCashiers, int numOfFood) {
	foodArray=new Food[numOfFood];
	CashierArray=new Cashier[numOfCashiers];
	}
	
	public void addCashier(Cashier c) {
		
		if(cashierCounter<CashierArray.length){
			CashierArray[cashierCounter]=c;
			cashierCounter++;
		}		
		
	}
	
	
	public void addFood(Food f) {
		
		if(foodCounter<foodArray.length){
			foodArray[foodCounter]=f;
			foodCounter++;
		}		
		
	}
	
	public Cashier[] getCashierArray() {
		return CashierArray;
	}
	
	public Food[] getFoodArray() {
		return foodArray;
	}
	
	public Cashier getCashierByIndex(int index) {
		return (index>=0&&index<cashierCounter)? CashierArray[index]:null;
	}
	
	public  Food getFoodByIndex(int index) {
		return (index>=0&&index<foodCounter)? foodArray[index]:null;
	}
	
}
