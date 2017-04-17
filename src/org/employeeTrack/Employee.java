package org.employeeTrack;


public class Employee {

	private int id;
	private String forename;
	private String surname;
	private Salary salary;
	private CompanyPosition position;

	public Employee(int id, String forename, String surname, Salary salary,
			CompanyPosition position) {
		super();

		if (Character.isUpperCase(forename.charAt(0))) {
		}

		if (Character.isUpperCase(surname.charAt(0))) {
		}
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	}

	public double getSalary() {
		return salary.getSalary();
	}

	public CompanyPosition getPosition() {
		return position;
	}

	public boolean eligibleForBonus() {
		if (salary.getSalary() >= 40000) {
			return true;
		}
		else if (salary.getSalary() < 40000) {
			return false;
		}
		else {
			return false;
		}
	}

	public String eligiblePrint() {
		if (eligibleForBonus()) {
			return "";
		}
		return " not";
	}

	@Override
	public String toString() {
		return surname + ", " + forename + " (" + id + "): "
				+ position.getPositionName() + " at £" + salary.getSalary()
				+ " (£" + salary.calculateTax() + " tax) and is"
				+ eligiblePrint() + " eligible for bonus.";
	}

	public String getPositionName() {
		return position.getPositionName();
	}

}
