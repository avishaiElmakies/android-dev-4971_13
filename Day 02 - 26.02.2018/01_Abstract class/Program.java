
public class Program {

	public static void main(String[] args) {

		Food[] foodArr=new Food[3];
		foodArr[0]=new Pizza();
		foodArr[1]=new PersonalPizza();
		foodArr[2]=new Chips();
		
		for(Food food:foodArr){
			String foodType="";
			//because we can access the "cookFood" function with the base pointer
			//the "Pizza" overrides the "Food"'s "cookFood" function 
			food.cookFood(20);
			
			//The method slicePizza(int) is undefined for the type Food
			//food1.slicePizza(8);  ->compilation error
			
			

			if(food instanceof Food){
				
				foodType+=" Food";
			}
			
			if(food instanceof Pizza){
				
				//because we can not access the "cookFood" function with the base pointer
				//the "Pizza" does not override the "Food"'s "cookFood" function 
				((Pizza)food).slicePizza(8);
				foodType+=" Pizza";
				
			}
			
			if(food instanceof PersonalPizza){
				((Pizza)food).slicePizza(3);
				foodType+=" PersonalPizza";
				
			}
			

			if(food instanceof Chips){
				
				foodType+=" Chips";
			}
			
			System.out.println("foodType: "+foodType);
			System.out.println("______________________________________");
		}
		
	}

}
