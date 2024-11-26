package Bai6;

public class ParTimeEployee extends Employee{
	private int hoursPerWeek;

	public ParTimeEployee(String name, int age, char gender, String employeeName, String dateHired, int hoursPerWeek) {
		super(name, age, gender, employeeName, dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return super.toString()+"hoursPerWeek=" + hoursPerWeek + "]";
	}
	

}
