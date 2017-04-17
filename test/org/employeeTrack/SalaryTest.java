package org.employeeTrack;

import static org.junit.Assert.assertEquals;

import org.com1027.formative.ab00631.Salary;
import org.junit.Test;

public class SalaryTest {

  @Test
  public void testAccessorsMutators() {
    Salary salary = new Salary();

    assertEquals(0, salary.getSalary(), 0);
    salary.setSalary(10000);
    assertEquals(10000, salary.getSalary(), 0);
  }

  @Test
  public void testCalculateTaxBasic() {
    Salary salary = new Salary();

    salary.setSalary(16475);
    assertEquals(1407.0, salary.calculateTax(), 0);
    
    }


  @Test
  public void testCalculateTaxHigher() {
    Salary salary = new Salary();

    salary.setSalary(53875);
    assertEquals(6402+4970, salary.calculateTax(), 0);
  }


  @Test
  public void testCalculateTaxNone() {
    Salary salary = new Salary();

    salary.setSalary(1000);
    assertEquals(0, salary.calculateTax(), 0);
  }
}