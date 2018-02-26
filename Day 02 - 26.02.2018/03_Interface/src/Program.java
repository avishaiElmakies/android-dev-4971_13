
import java.util.ArrayList;
public class Program {

	public static void main(String[] args) {

		
		final int numOfCashiers=2;
		final int numOfFoods=2;
		FoodStore store=new FoodStore(numOfCashiers,numOfFoods);
		
		
		for(int i=0; i<numOfFoods; i++){
			
			Food tempFood;
			switch(i%3){
				case 0: tempFood=new Chips(); break;
				case 1: tempFood=new Pizza(); break;
				default: tempFood=new PersonalPizza(); break;
			}
			store.addFood(tempFood);
		}
		
		store.addCashier(new Cashier(18,"Bella",8));
		store.addCashier(new Cashier(20,"Amit",15));
		store.addCashier(new Cashier(22,"Dor",24));
		
		
		 ArrayList<IPrint> printArr=new  ArrayList<IPrint>();
		 
		 
		 Cashier[] tempCashierList=store.getCashierArray();
		 for(Cashier c:tempCashierList )
		 { 
			 printArr.add(c);
		 }
	
		 
		 
		 Food[] tempFoodList=store.getFoodArray();
		 for(Food f:tempFoodList )
		 { 
			 printArr.add(f);
		 }
		 
		 printArr.add(store);
		 
		 
		 for(IPrint i:printArr){
			System.out.println(i.print());
			
			if(i instanceof Food){
				System.out.println("I am Food");
			}
			System.out.println("__________________________");
		 }
		
	}

}
