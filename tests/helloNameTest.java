import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class helloNameTest {

  @Test
  void helloName() {
    assertEquals("Hello Bob!", helloName.helloName("Bob"));
    assertEquals("Hello Jim!", helloName.helloName("Jim"));
    assertEquals("Hello Rakthor!", helloName.helloName("Rakthor"));
    assertEquals("Hello Bob!", helloName.helloName("Robert"));
  }
}