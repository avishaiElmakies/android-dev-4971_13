package Basics;

import java.util.ArrayList;

public class program {

	
	
	public static void main(String[] args) {
		//primitive types are in the stack
		//primitive are value type
	
		  int v1 = 12; 
		  int v2 = v1; 
		  v2=13;
		  System.out.println("v1 int Value = "+ v1); 
		  System.out.println("v2 int Value = "+ v2); 
		  
		  
		//object types are in the heap
		//they have a pointer in the stack
		//object are ref type
		  
		  ArrayList<String> myList1;  //pointer in stack
		  myList1= new ArrayList<String>(); //object in heap - pointer refers to it
		  //Adding objects to Array List at default index 
		  
		  myList1.add("Apple"); 

		  
		  ArrayList<String> myList2 = myList1; 
		  myList2.add("WaterMelon");
		  
		  for(int i=0;i<myList1.size();i++){
			  System.out.println("myList1 Value = "+ myList1.get(i));
		  }
		  
		  for(int i=0;i<myList2.size();i++){
			  System.out.println("myList2 Value = "+ myList2.get(i));
		  }

	}

}
