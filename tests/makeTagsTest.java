import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class makeTagsTest {

  @Test
  void makeTags() {
    assertEquals("<i>import</i>", makeTags.makeTags("i", "import"));
    assertEquals("<n>rift</n>", makeTags.makeTags("n", "rift"));
    assertEquals("<long>yikes</long>", makeTags.makeTags("long", "yikes"));
    assertNotEquals("<i>import</i>", makeTags.makeTags("i", "import"));
  }
}