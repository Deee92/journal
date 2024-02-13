package se.kth.dee.pretzel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SJBookingServiceTest {

  @Test
  public void testGetDiscountedFare() {
    SJBookingService sjBS = new SJBookingService();
    double discountedFare = sjBS.getDiscountedFare(99);
    assertEquals(89.1, discountedFare, 0.0);
  }

  @Test
  public void testGetTotalFare() {
    // receiving object
    SJBookingService sjBS = new SJBookingService();
    // parameters
    SJTag uToS = new SJTag("Uppsala", "Stockholm", 0, 108);
    int discountedQuantity = 1;
    int regularQuantity = 1;
    // call to focal method
    double totalFare = sjBS.getTotalFare(uToS, discountedQuantity, regularQuantity);
    // oracle
    assertEquals(205.2, totalFare, 0.0);
  }


  /**
   * In production
   * * a booking included 1 discounted and 4 regular tickets
   * * a booking included 2 discounted and 5 regular tickets
   * We combine these into a parameterized test
   *
   * @param discounted
   * @param regular
   */
  @ParameterizedTest
  @CsvSource({"1,4", "2,5"})
  public void testParameterizing(int discounted, int regular) {
    System.out.println(String.format(
            "Calculating fare for %s discounted and %s regular tickets",
            discounted, regular));
    SJTag tag = new SJTag("Umea", "Orebro", 6, 320);
    SJBookingService sjBS = new SJBookingService();
    double totalFare = sjBS.getTotalFare(tag, discounted, regular);
    System.out.println("Total fare: " + totalFare);
    // weak oracle
    assertTrue(totalFare > 320);
  }
}
