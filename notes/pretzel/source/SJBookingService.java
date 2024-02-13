package se.kth.dee.pretzel;

public class SJBookingService {
  private static final double DISCOUNT = 0.1;

  public double getDiscountedFare(double baseFare) {
    return baseFare - (baseFare * DISCOUNT);
  }

  public double getTotalFare(SJTag tag,
                             int discountedQuantity,
                             int regularQuantity) {
    return (discountedQuantity * getDiscountedFare(tag.getBaseFare()))
            + regularQuantity * tag.getBaseFare();
  }
}
