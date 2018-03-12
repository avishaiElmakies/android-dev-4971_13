
public class AsyncManager {

	
	private IMyAction myActionPointer;
	
	
	public AsyncManager(IMyAction obj){		
		myActionPointer=obj;
	}
	
	
	
	public void asyncLongAction(int num){
		
		myActionPointer.startFunc();
		
		
		
		//---------------------------long operation - will take a while to execute
		while(num<=5){
			num++;
		}
		//----------------------------
		
	
		
		myActionPointer.endFunc(num);
	}
	
}
