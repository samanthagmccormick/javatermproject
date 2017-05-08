package termproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Output extends Application {
  // Create an empty user object
  User user = new User();
  
  // Layout
  BorderPane borderPane = new BorderPane();
  
  // Form fields we need to access
  TextField textfieldName = new TextField();
  TextField textfieldBirthdate = new TextField();
  TextField textfieldCity = new TextField();
  TextField textfieldSingle = new TextField("(s for single / m for married)");
  TextField textfieldPartner = new TextField();
  TextField textfieldPartnerGender = new TextField("(m for male / f for female)");
  ComboBox<String> comboboxTimeToLive = new ComboBox<String>();

  // Button we need to add event handler to
  Button generateDeathButton = new Button("GENERATE RANDOM DEATH");

  // output text nodes
  Text name = new Text();
  Text dates = new Text();
  Text outputLine = new Text();

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    addForm();
    addGraphic();

    // Add the borderPane to the scene
    Scene scene = new Scene(borderPane);
    
    // use stylesheet for some CSS styling
    scene.getStylesheets().add(Output.class.getResource("./css/styles.css").toExternalForm());
    primaryStage.setScene(scene);

    primaryStage.setTitle("100 Ways to Die");
    primaryStage.setHeight(1000);
    primaryStage.setWidth(700);
    primaryStage.show();

    /*
     * Event Handlers
     */
    generateDeathButton.setOnAction(new EventHandler<T>() {
      @Override
      public void handle(T event) {

        // Submit the form fields, storing the data into the user object
        user.setName(textfieldName.getText());
        user.setBirthdate(textfieldBirthdate.getText());
        user.setCity(textfieldCity.getText());
        user.setIsSingle(textfieldSingle.getText().equals("s") ? true : false);
        user.setPartnerName(textfieldPartner.getText());
        user.setPartnerGender(textfieldPartnerGender.getText());
        user.setMonthsUntilDeath(comboboxTimeToLive.getSelectionModel().getSelectedIndex());

        // Generate random number on each click of the button
        int randomNumber = (int) (Math.random() * 10);

        // Generate random death using random number generated and other user data
        if (isFormComplete()) {
          // Print name
          name.setText(user.getName());

          // Print the date of birth - death
          dates.setText("\n" + user.getBirthdate() + " - " + user.getDeathdate());
          
          outputLine
          .setText("\nDied while " + RandomActivity.getRandomActivity() + " " + RandomDeathEvent
              .getRandomDeathEvent(randomNumber, user.getCity(), user.getPartnerName()));
        } else {
          outputLine.setText("Fill in the empty form fields!");
        }

      }
    });

  }

  private void addForm() {
    Text title =
        new Text("\n--------------------" + "\n 100 Ways to Die  " + "\n--------------------\n\n");
    title.setFont(Font.font("Verdana", 16));
    title.setFill(Color.rgb(139, 0, 0));
    
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.BASELINE_CENTER);
    pane.setVgap(8);
    pane.setHgap(20);
    Label labelName = new Label("Enter your name: ");
    pane.add(labelName, 0, 0);
    pane.add(textfieldName, 1, 0);

    Label labelBirthdate = new Label("Enter your birthdate: ");
    pane.add(labelBirthdate, 0, 1);
    pane.add(textfieldBirthdate, 1, 1);

    Label labelCity = new Label("Enter your city: ");
    pane.add(labelCity, 0, 2);
    pane.add(textfieldCity, 1, 2);

    Label labelSingle = new Label("Are you single or married?");
    pane.add(labelSingle, 0, 3);
    pane.add(textfieldSingle, 1, 3);

    Label labelPartner = new Label("Enter your partner's name: ");
    pane.add(labelPartner, 0, 4);
    pane.add(textfieldPartner, 1, 4);

    Label labelPartnerGender = new Label("Enter your partner's gender: ");
    pane.add(labelPartnerGender, 0, 5);
    pane.add(textfieldPartnerGender, 1, 5);

    Label labelTimeToLive = new Label("How much time would you like?");
    comboboxTimeToLive.getItems().addAll("I don't like surprises. Let's do it NOW.",
        "6 months would be nice", "I'll take a year", "Surprise me!");
    comboboxTimeToLive.setValue("6 months would be nice");
    comboboxTimeToLive.setStyle(".combobox");
    pane.add(labelTimeToLive, 0, 6);
    pane.add(comboboxTimeToLive, 1, 6);

    generateDeathButton.setStyle(".button");

    // Everything goes inside this vbox
    VBox vBox = new VBox();
    vBox.setAlignment(Pos.CENTER);
    vBox.getChildren().addAll(title, pane, generateDeathButton);
    
    // Set this vbox at the TOP of the screen
    borderPane.setTop(vBox);
    
    textfieldName.setOnKeyPressed(e ->

    System.out.print("Key pressed " + e.getCode() + " "));

    textfieldName.setOnKeyTyped(e ->

    System.out.println("Key typed " + e.getCode()));
  }
  
  private void addGraphic() {
    // tombstone is a background image because we are adding text on top of it
    BackgroundImage backgroundImage =
        new BackgroundImage(new Image(getClass().getResourceAsStream("./images/tombstone.png")),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(300, 375, false, false, false, false));
    
    // name
    name.setWrappingWidth(180);
    name.setFont(Font.font("Copperplate / Copperplate Gothic Light, sans-serif", 18));
    name.setTextAlignment(TextAlignment.CENTER);
    name.setFill(Color.DARKRED);
    
    // dates
    dates.setWrappingWidth(180);
    dates.setFont(Font.font("Verdana", 14));
    dates.setTextAlignment(TextAlignment.CENTER);
    dates.setFill(Color.DARKRED);

    // death output
    outputLine.setWrappingWidth(180);
    outputLine.setFont(Font.font("Verdana", 11));
    outputLine.setTextAlignment(TextAlignment.CENTER);
    outputLine.setFill(Color.DARKRED);

    // Everything goes inside this vbox
    VBox vBox = new VBox();
    vBox.setAlignment(Pos.CENTER);
    vBox.getChildren().addAll(name, dates, outputLine);
    vBox.setBackground(new Background(backgroundImage));

    // Set this vbox at the CENTER of the screen
    borderPane.setCenter(vBox);
  }
  
  private boolean isFormComplete() {
    return !textfieldName.getText().isEmpty() && !textfieldBirthdate.getText().isEmpty()
        && !textfieldCity.getText().isEmpty() && !textfieldSingle.getText().isEmpty()
        && !textfieldPartner.getText().isEmpty() && !textfieldPartnerGender.getText().isEmpty();
  }
}
