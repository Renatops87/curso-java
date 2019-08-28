package entities;

public class Employees {
	private Integer id;
	private String name;
	private Double salary;
	
	
	
	public Employees() {
	}

	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void increaseSalary(Double percentage) {
		this.salary += salary * (percentage / 100);
	}
	
	public String toString() {
		return this.getId()
			+ ", "
			+ this.getName()
			+ ", "
			+ this.getSalary();
	}
}
