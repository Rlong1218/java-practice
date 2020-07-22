import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class makeAbbaTest {

  @Test
  void makeAbba() {
    assertEquals("abba", makeAbba.makeAbba("a", "b"));
    assertEquals("HiHelloHelloHi", makeAbba.makeAbba("Hi", "Hello"));
    assertEquals("BillyBoBoBilly", makeAbba.makeAbba("Billy", "Bo"));
    assertNotEquals("abba", makeAbba.makeAbba("a", "b"));
  }
}