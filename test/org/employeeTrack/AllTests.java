package org.employeeTrack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ EmployeeTest.class, CompanyPositionTest.class, SalaryTest.class })
public class AllTests {
}
