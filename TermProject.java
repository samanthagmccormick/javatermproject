package termproject;

import java.util.Scanner;

public class TermProject {

  public static void main(String[] args) {
    // Initialize key scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to");
    System.out.println("---------------------");
    System.out.println("   400 Ways to Die   ");
    System.out.println("---------------------");
    
    System.out.println("\nLet’s play!");
    
    System.out.println("\nFirst, I need to know some things.\n");
    
    System.out.println("\nEnter your name: ");
    String name = input.next();
    System.out.println("Enter your birthdate: ");
    String birthdate = input.next();
    System.out.println("Enter your city: ");
    String city = input.next();
    
    System.out.println("\nAre you single or married? (Enter 's' for single or 'm' for married: ");
    
    System.out.println("\nEnter your partner's name: ");
    String partnerName = input.next();
    System.out.println("Enter " + partnerName + "'s gender (Enter 'f' for female or 'm' for male: ");
    String partnerGender = input.next();
      
    System.out.println("\nHow much time would you like to live? (Select an option):");
    System.out.println("[1] I don't like surprises. Let's do it NOW.");
    System.out.println("[2] 6 months would be nice");
    System.out.println("[3] I'll take a year");
    System.out.println("[4] Surprise me!");
    int timeUntilDeath = input.nextInt();
    
    System.out.println(RandomQuestion.getRandomQuestion());
    
    // BUTTON: Generate Death with event handler
    // Clicking ‘Generate Death’ generates a random number between 1 and 20.

    



    
    
    
    
    
    
    // Clicking ‘Generate Death’ generates a random number between 1 and 20.
    // We pick a random activity from a randomActivity[20] list using the random number (ex) getting a candy bar from a vending machine)
    // We pick    a death event from a deathEventList[20] 
    // We pair the two into a sentence (there are 20*20=400 combinations / ways to die)
    // We pick a date in the future based on the [time to live] answer.
    // If user is married, we show an illustration of a male or female stick figure holding flowers and kneeling in front of a gravestone with the user’s name, birth/death dates, and a random poem with the answer to the randomly generated question inserted.
    // Above the photo, we show a news article with the headline of the death event and date
    
    
    
  }

}
