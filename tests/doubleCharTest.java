import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class doubleCharTest {

  @Test
  void doubleChar() {
    assertEquals("nnoott", doubleChar.doubleChar("not"));
    assertEquals("RRoobbeerrtt", doubleChar.doubleChar("Robert"));
    assertNotEquals("nnooott", doubleChar.doubleChar("not"));
    assertNotEquals("ooooppss", doubleChar.doubleChar("oops"));
  }
}