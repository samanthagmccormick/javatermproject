package termproject;

public class RandomActivity {
  static String[] randomActivityList = {
      "getting a stuck candy bar from a vending machine",
      "competing in a donut eating competition", 
      "taking a selfie",
      "waiting in the drive-thru line at Sonic",
      "taking out the garbage",
      // TODO:
      "taking out the garbage",
      "taking out the garbage",
      "taking out the garbage",
      "taking out the garbage",
      "taking out the garbage",
  };

  public static String getRandomActivity() {
    return randomActivityList[(int) (Math.random() * 5)];
  }
}
