package org.employeeTrack;

import static org.junit.Assert.assertEquals;

import org.com1027.formative.ab00631.CompanyPosition;
import org.junit.Test;


public class CompanyPositionTest {

  @Test
  public void testAccessorsMutators() {
    CompanyPosition companyPosition = new CompanyPosition();

    companyPosition.setPositionName("Senior Lecturer");
    assertEquals("Senior Lecturer", companyPosition.getPositionName());
  }
}
