package Basics;

public class Manager extends person {


		private String companyName;
		public Manager(int age, String fullName, address a, String companyName) {
			super(age, fullName, a);
			this.companyName = companyName;
		}
		
		
		public String sayHello() {
			return "Hello from Manager";
		}

		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		
	}

