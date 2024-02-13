package se.kth.dee.pretzel;

public class SJTag {
  private String source;
  private String destination;
  private boolean isDirect;
  private int numberOfStops;
  private float baseFare;

  public SJTag(String source, String destination, int numberOfStops, float baseFare) {
    this.source = source;
    this.destination = destination;
    this.numberOfStops = numberOfStops;
    if (numberOfStops == 0)
      isDirect = true;
    this.baseFare = baseFare;
  }

  public boolean isDirect() {
    return isDirect;
  }

  public float getBaseFare() {
    return baseFare;
  }
}
