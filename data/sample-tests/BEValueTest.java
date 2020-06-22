import com.turn.ttorrent.bcodec.BEValue;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

import static org.testng.Assert.assertEquals;

public class BEValueTest {

  static BEValue beValue;

  @Test
  public void testIntValue() {
    beValue = new BEValue(1);
    assertEquals(1, beValue.getValue(), "value should be 1");
  }

  @Test
  public void testBigIntValue() {
    beValue = new BEValue(BigInteger.valueOf(671088640));
    assertEquals(BigInteger.valueOf(671088640), beValue.getValue(), "value should be BigInteger 671088640");
  }

  @Test
  public void testLongValue() {
    beValue = new BEValue(0L);
    assertEquals(0L, beValue.getValue(), "value should be 0L");
  }

  @Test
  public void testByteArrayValue() {
    try {
      beValue = new BEValue("MTI3LjAuMS4x", "Base64");
      assertEquals("MTI3LjAuMS4x", beValue.getValue(), "value should be MTI3LjAuMS4x");
    } catch (UnsupportedEncodingException e) {
      e.getLocalizedMessage();
    }
  }
}
