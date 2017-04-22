package termproject;

public class RandomQuestion {
  static String[] randomQuestion = {
      "If you could magically learn one thing instantly, what would it be?",
      "What is something you always wanted to do as a kid but never got to do?", 
      "If you woke up one day completely invisible, what is the first thing you would do?",
      "What bad habit do you know have that you know you need to break?",
      "What do you like to do on a rainy day?"
  };

  public static String getRandomQuestion() {
    return randomQuestion[(int) (Math.random() * 5)];
  }
}
