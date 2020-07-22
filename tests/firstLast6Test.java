import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class firstLast6Test {

  @Test
  void firstLast6() {
    assertTrue(firstLast6.firstLast6(new int[]{1, 0, 4, 6}));
    assertTrue(firstLast6.firstLast6(new int[]{6, 0}));
    assertFalse(firstLast6.firstLast6(new int[]{1, 0, 4}));
    assertFalse(firstLast6.firstLast6(new int[]{6, 0, 4}));
  }
}