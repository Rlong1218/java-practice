import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cigarPartyTest {

  @Test
  void cigarParty() {
    assertTrue(cigarParty.cigarParty(50, false));
    assertFalse(cigarParty.cigarParty(30, false));
    assertTrue(cigarParty.cigarParty(70, true));
    assertFalse(cigarParty.cigarParty(100, false));
    assertFalse(cigarParty.cigarParty(100, true));
  }
}