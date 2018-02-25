/*
				|	static	function	|	non-static
_________________________________________________________________________________________
static property			|	yes			|	yes
_________________________________________________________________________________________
static function			|	yes			|	yes
_________________________________________________________________________________________
non-static property		|	no			|	yes
_________________________________________________________________________________________
non-static function 		|	no			|	yes
_________________________________________________________________________________________
 */
		


package Basics;

public class Program {

	
	public  void test1() {
		test2();
		System.out.println(test3);
		System.out.println(test4);
	}
	
	public static void test2() {
		
		//Cannot make a static reference to the non-static method test1() from the type program
		//test1();   -->compilation ERROR
		
		//Cannot make a static reference to the non-static field test3
		//System.out.println(test3);   -->compilation ERROR
		System.out.println(test4);
	}
	
	public static int test4=4;
	
	public  int test3=3;
	
	public static void main(String[] args) {
	
		Address a;
		Person[] personArr=new Person[5];
		
		String nameSrc,schoolSrc;
		
		
		System.out.println(Person.getCounter());
		a=new Address(13,"telaviv","israel");		
		nameSrc="Aviv";
		schoolSrc="john bryce";
	
		personArr[0]=new Student(18,nameSrc,a,80,schoolSrc);	
		personArr[1]=new Student(22,"Elio",a,90,schoolSrc);
		personArr[2]=new Manager(22,"Elio",a,"Google");
		//personArr[2]=new person(22,"Elio",a);  --> compilation error (can not create an object from abstract class)
		personArr[4]=new Manager(22,"Elio",a,"Microsoft");
		
		a.setCity("Haifa");
		nameSrc="Dor";
		
	for(Person p :personArr){
	//The method getGrade() is undefined for the type person
	//System.out.println(p.getGrade()); -->compilation ERROR
	

		try{
			//checking if p1 in the stack points to a student object in heap
			if(p instanceof Student){
				System.out.println(((Student)p).getGrade());
			}

			System.out.println(p.sayHello()); 

		}
		catch(Exception ex){
			System.out.println("element is null"); 
		}
	System.out.println("-------------------------------------"); 
}
		
	
}

}
