/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */


import banksystemproject.Account;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import static javafx.scene.text.Font.font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListCell;
import javafx.scene.control.MenuItem;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;


/**
 *
 * @author Youssef
 */
public class DepositForm extends Application implements EventHandler<ActionEvent> {
      public static void main(String[] args) {
        launch(args);
    } 
      
      HBox box=new HBox();
      GridPane All=new GridPane();
      final ContextMenu ComboBoxValidator = new ContextMenu();
      TextField AmountField=new TextField();
      String Borders = String.format("-fx-border-color: Black; -fx-border-width: 2; -fx-border-radius: 3.5;");
       String styles =
      "-fx-background-color: #00A619;" +
      "-fx-text-fill: #FFFFFF;"
    + "-fx-font: 18 Arial;";
    Font font = Font.font("Arial", FontWeight.BOLD, 12);
    Font font1 = Font.font("Arial", FontWeight.BOLD, 20);
    @Override
public void start(Stage primaryStage) throws FileNotFoundException {
GridPane coin=new GridPane();
coin.setAlignment(Pos.BOTTOM_RIGHT);
Image image2 =new Image(new FileInputStream("roCoin.png"));
ImageView im2=new ImageView(image2);
im2.setFitHeight(60);
im2.setFitWidth(60);
coin.add(im2, 0, 0);
RotateTransition rotate = new RotateTransition();    
rotate.setAxis(Rotate.X_AXIS);    
rotate.setByAngle(360);  
rotate.setCycleCount(500);  
rotate.setDuration(Duration.millis(1000));  
rotate.setAutoReverse(true);  
rotate.setNode(im2);     
rotate.play();  
All.setAlignment(Pos.CENTER);
All.setHgap(10); //horizontal gap in pixels
All.setVgap(10); //vertical gap in pixels
All.setPadding(new Insets(10, 10, 10, 10));
Label Amount=new Label("Amount");
Amount.setFont(font);
AmountField.setStyle(Borders);
All.add(Amount, 2, 2);
All.add(AmountField, 2, 3);
Button Deposit=new Button("Deposit");
Deposit.setOnAction(this);
Deposit.setStyle(styles);
Deposit.setPrefSize(200,2);
All.add(Deposit, 2, 4);
box.getChildren().add(coin);
box.getChildren().add(All);
 Scene scene = new Scene(box, 400, 270);
 primaryStage.setScene(scene);
 primaryStage.show();
    }


    @Override
    public void handle(ActionEvent t) {
     
     Account A1=new Account();
     double amount=0;
          try {
              String Samount= AmountField.getText();
      amount=Double.parseDouble(Samount);
              A1.Deposit(amount);
          } catch (IOException ex) {
              Logger.getLogger(DepositForm.class.getName()).log(Level.SEVERE, null, ex);
          }
          catch(NumberFormatException e1)
             {
                    ComboBoxValidator.getItems().clear();
                    ComboBoxValidator.getItems().add(
                    new MenuItem("Please Enter Numbers Only"));
                    ComboBoxValidator.show(AmountField, Side.RIGHT, 10, 0);
             }
          VBox box=new VBox();
          Label label=new Label("""
                                Deposit Processing
                                $"""
                                +amount);
          label.setFont(font1);
          label.setPadding(new Insets(0,0,0,10));
           ImageView imageView = new ImageView(new Image("file:right.png"));
           imageView.setFitHeight(50);
           imageView.setFitWidth(50);
           StackPane image=new StackPane();
           StackPane.setAlignment(imageView, Pos.CENTER);
           image.setPadding(new Insets(10,0,10,10));
           image.getChildren().add(imageView);
           image.getChildren().add(label);
           box.getChildren().addAll(image,label);
            All.add(box, 2, 1);
            
          }   
}
