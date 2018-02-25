package Basics;

public abstract class Person {

	public static int counter=0;
	private int age;
	private String fullName;
	Address a;
	public Person(int age, String fullName, Address a) {
		super();
		person.setCounter();
		this.age = age;
		this.fullName = fullName;
		this.a = a;
	}
	
	
	public String sayHello() {
		return "Hello from person";
	}
	
	
	public static int getCounter() {
		return counter;
	}
	
	
	private static void setCounter() {
		
		//Cannot use this in a static context
		//this.age = age;	 -->compilation ERROR
		//this.getAge();	 -->compilation ERROR
		person.counter++;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
}
