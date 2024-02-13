package se.kth.dee.pretzel;

public class SJApp {
  public static void main(String[] args) {
    SJBookingService sjBookingService = new SJBookingService();

    SJTag tagToWork = new SJTag("Uppsala", "Stockholm", 3, 80);
    double toWork = sjBookingService.getTotalFare(tagToWork, 1, 0);
    System.out.println("You will Swish " + toWork);


    SJTag tagHome = new SJTag("Stockholm", "Uppsala", 4, 110);
    double toHome = sjBookingService.getTotalFare(tagHome, 1, 1);
    System.out.println("You will Swish " + toHome);
  }
}
