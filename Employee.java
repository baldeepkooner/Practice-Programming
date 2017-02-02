/**
 * A class that maintains information on an employee
 * @author baldeepkooner
 * @version 01/31/16
 */
public class Employee {
	
	private int id; //stores employee ID
	private String name; //stores employee name
	private int age;  //stores employee age
	private String title; //stores employee job title
	private double salary; //stores employee salary 
	private String phoneNumber; //stores employee phone number 
	
	public Employee(int id, String name, int age, String title, double salary, String phoneNumber){
		this.id = id; 
		this.name = name; 
		this.age = age; 
		this.title = title; 
		this.salary = salary; 
		this.phoneNumber = phoneNumber; 
	}
	
	public Employee(int id, String name, int age){
		this.id = id; 
		this.name = name; 
		this.age = age; 
	}
	
	public Employee(Employee employee){
		id = employee.id; 
		name = employee.name; 
		age = employee.age;
		title = employee.title; 
		salary = employee.salary;  
		phoneNumber = employee.phoneNumber; 
	}
	
	public void setId(int id){
		this.id = id; 
	}
	
	public void setName(String name){
		this.name = name; 
	}
	
	public void setTitle(String title){
		this.title = title; 
	}
	
	public void setAge(int age){
		this.age = age; 
	}
	
	public void setSalary(double amountToIncrease){
		this.salary = amountToIncrease; 
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber; 
	}
	
	public int getId(){
		return id; 
	}
	
	public String getName(){
		return name; 
	}
	
	public String getTitle(){
		return title; 
	}
	
	public int getAge(){
		return age; 
	}
	
	public double getSalary(){
		return salary; 
	}
	
	public String getPhoneNumber(){
		return phoneNumber; 
	}
	
	public double increaseSalary(int percentageOfIncrease){
		double percentmultiplier = percentageOfIncrease / 100.0; 
		double amountToIncrease = (percentmultiplier * salary) + salary;
		setSalary(amountToIncrease);
		return salary; 
	}
	
	public double increaseSalary(int percentageOfIncrease, String newTitle){
		double percentmultiplier = percentageOfIncrease / 100.0; 
		double amountToIncrease = (percentmultiplier * salary) + salary;
		setSalary(amountToIncrease);
		setTitle(newTitle); 
		return salary;
	}
	
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false; 
		
		Employee employee = (Employee) obj;
		
		return ((id == employee.id) && (name == employee.name) && (title == employee.title) && (age == employee.age) && (salary == employee.salary) && (phoneNumber == employee.phoneNumber));
	}
	 
	public String toString(){
		return ("ID: " + id + ", Age: " + age + ", Name: " + name + ", Title: " + title + ", Phone Number: " + phoneNumber); 
	}
	
	public static int employeeCounter; 
	
	public static void increaseEmployeeCounter(){
		employeeCounter += 1; 
	}
	
	public static int getEmployeeCounter(){
		return employeeCounter; 
	}
	
}