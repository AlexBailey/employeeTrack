package org.employeeTrack;


public class Salary {

	private double Salary;
	private double PersonalAllowance = 9440;
	private double TaxableSalary;
	private double taxtwenty;
	private double taxforty;

	public Salary() {
		super();
		this.Salary = 0.00;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		if (salary >= 0) {
			Salary = salary;
		}
	}

	public double calculateTax() {

		if (this.Salary <= this.PersonalAllowance) {
			return 0.0;
		}
		if (this.Salary >= this.PersonalAllowance) {
			this.TaxableSalary = this.Salary;
			this.TaxableSalary = this.TaxableSalary - this.PersonalAllowance;
		}
		if (this.TaxableSalary > 32010) {
			this.taxtwenty = 6402;
		} else if (this.TaxableSalary < 32010) {
			this.taxtwenty = this.TaxableSalary * 0.2;
		}
		if (this.TaxableSalary > 32010) {
			this.TaxableSalary = this.TaxableSalary - 32010;
			this.taxforty = this.TaxableSalary * 0.4;
		}
		return this.taxtwenty + this.taxforty;
	}
}
