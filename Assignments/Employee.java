// Julio Collado

public class Employee {
	// fields
	private String name;
	private int idNumber;
	private String department;
	private String position;

	// constructors

	public Employee(String n, int id, String dp, String pos) {
		name = n;
		idNumber = id;
		department = dp;
		position = pos;
	}
	public Employee(String n, int id) {
		name = n;
		idNumber = id;
		department = "";
		position = "";
	}
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}

	// Accessors 

	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public String getDepartment() {
		return department;
	}
	public String getPosition() {
		return position;
	}

	//mutators 

	public void setName(String n) {
		name = n;
	}
	public void setIdNumber(int id) {
		idNumber = id;
	}
	public void setDepartment(String dp) {
		department = dp;
	}
	public void setPosition(String pos) {
		position = pos;
	}

}