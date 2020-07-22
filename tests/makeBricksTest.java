import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class makeBricksTest {

  @Test
  void makeBricks() {
    assertTrue(makeBricks.makeBricks(20, 0, 19));
    assertTrue(makeBricks.makeBricks(1, 2, 11));
    assertTrue(makeBricks.makeBricks(20, 1, 22));
    assertTrue(makeBricks.makeBricks(2, 20, 102));
    assertFalse(makeBricks.makeBricks(3, 3, 14));
    assertFalse(makeBricks.makeBricks(0, 5, 24));
    assertFalse(makeBricks.makeBricks(3, 1, 4));
    assertTrue(makeBricks.makeBricks(1, 5, 22));
  }
}