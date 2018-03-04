
public abstract class  Person implements IPrint{
	public static int counter=0;
	private int age;
	private String fullName;

	public Person(int age, String fullName) {
		super();
		Person.setCounter();
		this.age = age;
		this.fullName = fullName;
	}
	

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Person info - Age: "+getAge()+ " FullName: "+getFullName();

	}
	
	
	public static int getCounter() {
		return counter;
	}
	
	
	private static void setCounter() {
		
		//Cannot use this in a static context
		//this.age = age;	 -->compilation ERROR
		//this.getAge();	 -->compilation ERROR
		Person.counter++;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = (age>0 && age<120)?age:0;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
