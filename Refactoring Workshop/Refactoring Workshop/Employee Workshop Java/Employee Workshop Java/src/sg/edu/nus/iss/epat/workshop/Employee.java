package sg.edu.nus.iss.epat.workshop;

public abstract class Employee {
	private String name;
	private float salary;
	
	public Employee (String name, float salary){
		this.name = name;
		this.salary = salary;
	}
	
	public float getBaseSalary() { return salary; }
	public String getName() { return name;}
	public float computeDeductions() { return salary*0.2f;}
	
	// 2nd method to pull component back to parent instead of asking from parent 
	public abstract float variableComponent();
	
	// + variableComponent behind to pull the variable from child 
	public float computeSalary() {
	return getBaseSalary() - computeDeductions() + variableComponent();
	} 
}

