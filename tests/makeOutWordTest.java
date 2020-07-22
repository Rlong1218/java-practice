import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class makeOutWordTest {

  @Test
  void makeOutWord() {
    assertEquals("balowng" , makeOutWord.makeOutWord("bang", "low"));
    assertEquals("trlongip" , makeOutWord.makeOutWord("trip", "long"));
    assertEquals("tamidnk" , makeOutWord.makeOutWord("tank", "mid"));
    assertNotEquals("balowng" , makeOutWord.makeOutWord("bang", "low"));

  }
}