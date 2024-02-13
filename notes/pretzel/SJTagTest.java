package se.kth.dee.pretzel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SJTagTest {
  @Test
  public void testThatTrainWithZeroStopsIsDirect() {
    SJTag uToS = new SJTag("Uppsala", "Stockholm", 0, 110);
    boolean isDirect = uToS.isDirect();
    assertEquals(true, isDirect);
  }

  @Test
  public void testThatTrainWithThreeStopsIsNotDirect() {
    SJTag uToS = new SJTag("Uppsala", "Stockholm", 3, 99);
    boolean isDirect = uToS.isDirect();
    assertEquals(false, isDirect);
  }

  @Test
  public void testThatTrainWithTenStopsIsNotDirect() {
    SJTag uToS = new SJTag("Stockholm", "Uppsala", 10, 172);
    boolean isDirect = uToS.isDirect();
    assertEquals(false, isDirect);
  }

  /**
   * The value of stops was 4 in production, so we generate this parameterized test for `isDirect`
   *
   * @param stops
   */
  @ParameterizedTest
  @ValueSource(ints = {3, 10, 4})
  public void testThatTrainWithAtLeastOneStopIsNotDirect(int stops) {
    SJTag uToS = new SJTag("Uppsala", "Stockholm", stops, 172);
    boolean isDirect = uToS.isDirect();
    assertEquals(false, isDirect);
  }
}
