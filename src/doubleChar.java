//Given a string, return a string where for every char in the original, there are two chars.

public class doubleChar {
  public static String doubleChar(String str) {
    String doubled = "";
    for (int i = 0; i < str.length() ; i++) {
      doubled = doubled + str.charAt(i) + str.charAt(i);
    }
    return doubled;
  }
}
