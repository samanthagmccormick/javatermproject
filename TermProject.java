package termproject;

import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class TermProject {

  public static void main(String[] args) {
    // Initialize key scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to");
    System.out.println("---------------------");
    System.out.println("   100 Ways to Die   ");
    System.out.println("---------------------");
    
    System.out.println("\nLet’s play!");
    
    System.out.println("\nFirst, I need to know some things.");
    
    // Create an empty user object
    User user = new User();
    
    System.out.print("\nEnter your name: ");
    user.setName(input.next());
    System.out.print("Enter your birthdate: ");
    user.setBirthdate(input.next());
    System.out.print("Enter your city: ");
    user.setCity(input.next());
    
    System.out.print("\nAre you single or married? (Enter 's' for single or 'm' for married): ");
    // TODO move to class?
    boolean isSingle = input.next().toLowerCase().equals("s") ? true : false;
    user.setIsSingle(isSingle);
    
    System.out.print("\nEnter your partner's name: ");
    user.setPartnerName(input.next());
    System.out.print("Enter " + partnerName + "'s gender (Enter 'f' for female or 'm' for male): ");
    user.setPartnerGender(input.next());
      
    System.out.println("\nHow much time would you like to live?");
    System.out.println("[1] I don't like surprises. Let's do it NOW.");
    System.out.println("[2] 6 months would be nice");
    System.out.println("[3] I'll take a year");
    System.out.println("[4] Surprise me!");
    System.out.print("\nEnter an option 1-4 then hit 'Enter': ");
    user.setTimeUntilDeath(input.nextInt());
    
//    // TODO move to a separate browser file after reading chapter.
//    // Clicking ‘Generate Death’ generates a random number between 1 and 20.
//    Button generateDeathButton = new Button("Generate My Death");
//    generateDeathButton.setOnAction(new EventHandler<ActionEvent>() {
//      @Override public void handle(ActionEvent e) {
//        System.out.println((int) Math.random() * 21);
//      }
//    });
    
    // Generate random number (button TODO)
    int randomNumber = (int) Math.random() * 11;
    // random activity
    System.out.println("\n" + "Died while " + RandomActivity.getRandomActivity() + " " + RandomDeathEvent.getRandomDeathEvent(randomNumber, user.getCity(), user.getPartnerName()));
    
    // get death date from User class
    



    
    
    
    
    
    
    // We pick a random activity from a randomActivity[20] list using the random number (ex) getting a candy bar from a vending machine)
    // We pick    a death event from a deathEventList[20] 
    // We pair the two into a sentence (there are 20*20=400 combinations / ways to die)
    // We pick a date in the future based on the [time to live] answer.
    // If user is married, we show an illustration of a male or female stick figure holding flowers and kneeling in front of a gravestone with the user’s name, birth/death dates, and a random poem with the answer to the randomly generated question inserted.
    // Above the photo, we show a news article with the headline of the death event and date
    
    
    
  }

}
