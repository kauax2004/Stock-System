package company;

public class Employee {
	private String name;
	private int id;
	private String jobPosition;
	
	public Employee(String name, int id, String jobPosition) {
		super();
		this.name = name;
		this.id = id;
		this.jobPosition = jobPosition;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	
	public String getName() {
		return name;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", jobPosition=" + jobPosition + "]";
	}
	
	
}