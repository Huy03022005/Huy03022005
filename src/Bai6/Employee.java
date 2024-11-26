package Bai6;

public class Employee extends Person {
	protected String employeeName;
	protected String dateHired;
	public Employee(String name, int age, char gender, String employeeName, String dateHired) {
		super(name, age, gender);
		this.employeeName = employeeName;
		this.dateHired = dateHired;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	@Override
	public String toString() {
		return super.toString()+"employeeName=" + employeeName + ", dateHired=" + dateHired + "]";
	}
	

}
