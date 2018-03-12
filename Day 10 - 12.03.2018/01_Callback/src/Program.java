
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IMyAction a1=new Task1();
		AsyncManager async1=new AsyncManager(a1);
		async1.asyncLongAction(1);
		
		IMyAction a2=new Task2();
		AsyncManager async2=new AsyncManager(a2);
		async2.asyncLongAction(1);
	}

}
