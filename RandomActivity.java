package termproject;

public class RandomActivity {
  static String[] randomActivityList = {
      "getting a stuck candy bar from a vending machine",
      "competing in a donut eating competition", 
      "taking a selfie",
      "waiting in the drive-thru line at Sonic",
      "taking out the trash",
      "talking on the phone with her friend",
      "sitting in traffic on highway 36",
      "getting a hot stone massage",
      "making a cheeseburger",
      "grocery shopping at Safeway"
  };

  public static String getRandomActivity() {
    return randomActivityList[(int) (Math.random() * 10)];
  }
}
