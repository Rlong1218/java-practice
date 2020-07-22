//We want to make a row of bricks that is goal inches long.
// We have a number of small bricks (1 inch each) and big bricks (5 inches each).
// Return true if it is possible to make the goal by choosing from the given bricks.

public class makeBricks {

  public static boolean makeBricks(int small, int big, int goal) {
    if (small + big * 5 == goal || small >= goal || (goal / 5 <= big && goal % 5 == 0)) {
      return true;
    }
    else if (goal < big * 5) {
      return small >= goal % 5;
    }
    else return (goal - big * 5) <= small;
  }
}
