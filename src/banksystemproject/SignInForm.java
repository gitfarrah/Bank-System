/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package banksystemproject;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
public class SignInForm extends Application implements EventHandler<ActionEvent> {
     public static void main(String[] args) {
        launch(args);
    }
    PasswordField PasswordTextField=new PasswordField();
    HBox box=new HBox();
    TextField UserNameTextField = new TextField();
    final ContextMenu usernameValidator = new ContextMenu();
    final ContextMenu passValidator = new ContextMenu();
    TextField textfield=new TextField();
    final Text actiontarget = new Text();
    boolean checker;
  String errorStyle = String.format("-fx-border-color: RED; -fx-border-width: 2; -fx-border-radius: 3.5;");
  String successStyle = String.format("-fx-border-color: Green; -fx-border-width: 2; -fx-border-radius: 3.5;");
  Button button = new Button("LOGIN");
 
  Button SignUp=new Button("SIGN UP");

  Scene scene = new Scene(box, 600, 500);
  Stage primaryStage=new Stage();
  String menu;
  
      
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
     makeScene();
    }
    public void makeScene() throws FileNotFoundException    {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10); //horizontal gap in pixels
grid.setVgap(10); //vertical gap in pixels
grid.setPadding(new Insets(10, 10, 10, 10));
Label label1=new Label("UserName");
Font font = Font.font("Arial", FontWeight.BOLD, 12);
label1.setFont(font);
UserNameTextField.setPromptText("Username");
PasswordTextField.setPromptText("Password");
grid.add(UserNameTextField, 2, 3);
Image image2 =new Image(new FileInputStream("coin.png"));
ImageView im2=new ImageView(image2);
im2.setFitHeight(60);
im2.setFitWidth(60);
Duration dur= Duration.millis(5000);
TranslateTransition trans=new TranslateTransition(dur,im2);
trans.setByX(380);  
trans.setFromX(-270);
trans.setByY(0);
trans.setAutoReverse(true);
trans.setCycleCount(1);
trans.play();
Image image3 =new Image(new FileInputStream("facebook.png"));
ImageView im3=new ImageView(image3);
Image image4 =new Image(new FileInputStream("twitter.png"));
ImageView im4=new ImageView(image4);
Image image5 =new Image(new FileInputStream("google.png"));
ImageView im5=new ImageView(image5);
HBox imagesbox=new HBox();
imagesbox.getChildren().addAll(im3,im4,im5);
imagesbox.setSpacing(20);
VBox imagesbox1=new VBox();
VBox.setMargin(imagesbox, new Insets(5,0,0,30));
imagesbox1.getChildren().add(imagesbox);
Label label4=new Label("Sign In To IBanking");
Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,18);
label4.setFont(font7);
grid.add(imagesbox1, 2, 1);
grid.add(label4, 2, 0);
PasswordTextField.textProperty().bindBidirectional(textfield.textProperty());
textfield.prefHeight(50);
Image image1 =new Image(new FileInputStream("eye.png"));
ImageView im1=new ImageView(image1);
im1.setFitHeight(32);
im1.setFitWidth(32);
StackPane.setMargin(im1, new Insets(0,10,0,0));
StackPane.setAlignment(im1, Pos.CENTER_RIGHT);
im1.setOnMouseClicked((e)->{
textfield.toFront();
im1.toFront();
 });
StackPane root1=new StackPane(textfield,PasswordTextField,im1);
grid.add(root1, 2, 5);
      String styles =
      "-fx-background-color: #351040 ;" +
      "-fx-text-fill: #FFFFFF;" ;
     
//      Image image =new Image(new FileInputStream("new1.png"));
//      ImageView im=new ImageView(image);
//      im.setFitHeight(500);
//      im.setFitWidth(350);
      button.setStyle("-fx-border-width: 1;-fx-background-color: #351040 ;-fx-font-weight: bold; -fx-border-radius: 15; -fx-background-radius: 15px; -fx-text-fill: #FFFFFF;");
      Font font1 = Font.font("Arial", FontWeight.BOLD, 16);
      button.setFont(font1); 
      button.setPrefSize(200,40);
      button.setOnAction(this);
     HBox btnBox=new HBox(button);
     HBox.setMargin(button, new Insets(30, 0, 0, 0));
      grid.add(btnBox, 2, 6);
    final Label label = new Label("Hello,Friend !");
    label.setStyle("-fx-text-fill: White; -fx-font:  16 \"Calibre\";-fx-font-weight: bold; -fx-padding: 0 0 200 0; -fx-text-alignment: center");
    final Label label3 = new Label("""
                                   Enter your Personal Details
                                   and start your journey with us""");
  label3.setStyle("-fx-text-fill: White; -fx-font:  8 \"Arial\"; -fx-padding: 0 0 100 0; -fx-text-alignment: center");
  Rectangle rec1=new Rectangle();
  SignUp.setStyle("-fx-border-color: white;-fx-border-width: 1;-fx-background-color: #351040 ;-fx-font-weight: bold; -fx-border-radius: 15; -fx-background-radius: 15px; -fx-text-fill: #FFFFFF;");
  SignUp.setPrefSize(170, 40);
  SignUp.setOnAction(this);
    // grid.add(SignUp,2,7);
     StackPane stackPane = new StackPane();
//     stackPane.getChildren().add(im);
     grid.add(actiontarget, 2, 8);
     GridPane grid1 = new GridPane();
     grid1.setAlignment(Pos.BOTTOM_CENTER);
     grid1.add(im2, 0, 0);
     rec1.setFill(Color.rgb(53, 16, 64));
     rec1.setWidth(250);
     rec1.setHeight(500);
     stackPane.getChildren().add(rec1);
     stackPane.getChildren().add(label);
     stackPane.getChildren().add(label3);
     stackPane.getChildren().add(SignUp);
     Image image6 =new Image(new FileInputStream("bank1.png"));
ImageView im6=new ImageView(image6);
im6.setFitHeight(65);
im6.setFitWidth(45);
 StackPane.setAlignment(im6, Pos.TOP_LEFT);
      stackPane.getChildren().add(im6);
      box.getChildren().add(stackPane);
      box.getChildren().add(grid);
      box.getChildren().add(grid1);
      box.setStyle( "-fx-background-color: #FFFFFF;");
      box.setSpacing(20);
      usernameValidator.setAutoHide(false);
      passValidator.setAutoHide(false);
      primaryStage.setScene(scene);
      primaryStage.show(); 
    }
    @Override
    public void handle(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            
             actiontarget.setText("");
       Person p1=new Person();
       checker= p1.check(UserNameTextField.getText(),PasswordTextField.getText());
       if(checker==false)
       {
        UserNameTextField.setStyle(errorStyle);
        PasswordTextField.setStyle(errorStyle);
        textfield.setStyle(errorStyle);
        actiontarget.setFill(Color.RED);
        actiontarget.setText("Password & username not exists");
        usernameValidator.getItems().clear();
        usernameValidator.getItems().add(
                    new MenuItem("Please check your username"));
                    usernameValidator.show(UserNameTextField, Side.RIGHT, 10, 0);
                    passValidator.getItems().clear();
                    passValidator.getItems().add(
                    new MenuItem("Please check your Password"));
                    passValidator.show(textfield, Side.RIGHT, 10, 0);
       }
       else 
            {
    Scanner in = null;
     ArrayList<Person>list=new ArrayList<>();
                   UserNameTextField.setStyle(successStyle);
                   PasswordTextField.setStyle(successStyle);
                   textfield.setStyle(successStyle);
                   actiontarget.setFill(Color.GREEN);
                   actiontarget.setText("Welcome");
                   File file =new File("DATA.txt");
                   
                 try {
                     in = new Scanner(file);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
                 }
         
             
               while(in.hasNext())
             {
                Person x=new Person();
                 x.Fname=in.next();
                 x.Lname=in.next();
                 x.Address=in.next();
                 x.Phone=in.next();
                 x.UpPassword=in.next();
                 x.UpconPassword=in.next();
                 x.ACType=in.next();
                 x.Age=in.nextInt();
                 x.Gender=in.next();
                 x.Role=in.next();
                 x.UpUsername=in.next(); 
                 list.add(x);
                 
             }
          int j=0;
          for(int i=0;i<list.size();i++)
          {
              if(list.get(i).UpUsername.equals(UserNameTextField.getText()))
              {
                  j=i;
                  break;
              }
          }
                   
                   
                   
                   BankSystemProject obj=new BankSystemProject();
                 try {
                     menu=obj.getmainmenu(UserNameTextField.getText());
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
                 }
                   if(menu.equals("Cl"))
                   {
                       MainMenu x=new MainMenu(list,j);
                 try {
                     x.start(primaryStage);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
                 }     
                   }
                   else if(menu.equals("Em"))
                   {
                       Employee_Form n1=new Employee_Form();
        try {
            n1.start(primaryStage);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
        }
                       
                       
                       
                   }
                   else
                   {
                      ManagerForm n1=new ManagerForm();
        try {
            n1.start(primaryStage);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
        }
                       
                       
                   }
                   
                   
               }
        UserNameTextField.focusedProperty().addListener(
                new ChangeListener<Boolean>() {
                    @Override
                    public void changed(
                            ObservableValue<? extends Boolean> arg0,
                            Boolean oldPropertyValue, Boolean newPropertyValue) {
                        if (newPropertyValue) {
                            // Clearing message if any
                            actiontarget.setText("");
                            // Hiding the error message
                            usernameValidator.hide();
                            actiontarget.setText("");
                            passValidator.hide();
                        }
                    }
                });

        PasswordTextField.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> arg0,
                    Boolean oldPropertyValue, Boolean newPropertyValue) {
                if (newPropertyValue) {
                    // Clearing message if any
                    actiontarget.setText("");
                    // Hiding the error message
                     passValidator.hide();
                      actiontarget.setText("");
                      usernameValidator.hide();
                }
            }
        });
        }
        else if(e.getSource()==SignUp)
        {
            
            SignUpForm x=new SignUpForm();
            try {
                x.makeScene(primaryStage);
            } catch (IOException ex) {
                Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            
            
            
            
            
        }
    }
}


























//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javafx.animation.TranslateTransition;
//import javafx.application.Application;
//import static javafx.application.Application.launch;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.geometry.Side;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.ContextMenu;
//import javafx.scene.control.Label;
//import javafx.scene.control.MenuItem;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//public class SignInForm extends Application implements EventHandler<ActionEvent> {
//     public static void main(String[] args) {
//        launch(args);
//    }
//    PasswordField PasswordTextField=new PasswordField();
//    HBox box=new HBox();
//    TextField UserNameTextField = new TextField();
//    final ContextMenu usernameValidator = new ContextMenu();
//    final ContextMenu passValidator = new ContextMenu();
//    TextField textfield=new TextField();
//    final Text actiontarget = new Text();
//    boolean checker;
//  String errorStyle = String.format("-fx-border-color: RED; -fx-border-width: 2; -fx-border-radius: 3.5;");
//  String successStyle = String.format("-fx-border-color: Green; -fx-border-width: 2; -fx-border-radius: 3.5;");
//  Button button = new Button("Login");
//  Button SignUp=new Button("SignUp");
//  Scene scene = new Scene(box, 500, 500);
//  Stage primaryStage=new Stage();
//  String menu;
//    @Override
//    public void start(Stage primaryStage) throws FileNotFoundException {
//     makeScene();
//    }
//    public void makeScene() throws FileNotFoundException
//    {
//        
//        GridPane grid = new GridPane();
//        grid.setAlignment(Pos.CENTER);
//        grid.setHgap(10); //horizontal gap in pixels
//grid.setVgap(10); //vertical gap in pixels
//grid.setPadding(new Insets(10, 10, 10, 10));
//Label label1=new Label("UserName");
//Font font = Font.font("Arial", FontWeight.BOLD, 12);
//label1.setFont(font);
//grid.add(label1, 2, 2);
//grid.add(UserNameTextField, 2, 3);
//Label label2=new Label("Password");
//label2.setFont(font);
//grid.add(label2, 2, 4);
//
//Image image2 =new Image(new FileInputStream("coin.png"));
//ImageView im2=new ImageView(image2);
//im2.setFitHeight(60);
//im2.setFitWidth(60);
//Duration dur= Duration.millis(5000);
//TranslateTransition trans=new TranslateTransition(dur,im2);
//trans.setByX(350);  
//trans.setFromX(-270);
//trans.setByY(0);
//trans.setAutoReverse(true);
//trans.setCycleCount(1);
////trans.setDelay(Duration.millis(1000));
//trans.play();
//
//
//PasswordTextField.textProperty().bindBidirectional(textfield.textProperty());
//textfield.prefHeight(50);
//Image image1 =new Image(new FileInputStream("eye.png"));
//ImageView im1=new ImageView(image1);
//im1.setFitHeight(32);
//im1.setFitWidth(32);
//StackPane.setMargin(im1, new Insets(0,10,0,0));
//StackPane.setAlignment(im1, Pos.CENTER_RIGHT);
//im1.setOnMouseClicked((e)->{
//textfield.toFront();
//im1.toFront();
// });
//StackPane root1=new StackPane(textfield,PasswordTextField,im1);
//grid.add(root1, 2, 5);
//      String styles =
//      "-fx-background-color: #000000 ;" +
//      "-fx-text-fill: #FFFFFF;" ;
//      Image image =new Image(new FileInputStream("Signin.png"));
//      ImageView im=new ImageView(image);
//      im.setFitHeight(170);
//      im.setFitWidth(150);
//      button.setStyle(styles);
//      Font font1 = Font.font("Arial", FontWeight.BOLD, 16);
//      button.setFont(font1);
//      button.setPrefSize(300,2);
//      button.setOnAction(this);
//      grid.add(button, 2, 6);
//      SignUp.setStyle(
//      "-fx-border-color: transparent;" +
//      "-fx-border-width: 0;" +
//      "-fx-background-radius: 0;"+
//      "-fx-background-color: transparent;"+
//      "-fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;"+
//      "-fx-font-size: 1em;"  +
//      "-fx-text-fill: #828282;"
//      );
//      SignUp.setOnAction(this);
//     grid.add(SignUp,2,7);
//     Rectangle rec1=new Rectangle();
//     StackPane stackPane = new StackPane();
//     stackPane.getChildren().add(rec1);
//     stackPane.getChildren().add(im);
//     grid.add(actiontarget, 2, 8);
//     GridPane grid1 = new GridPane();
//     grid1.setAlignment(Pos.BOTTOM_CENTER);
//     grid1.add(im2, 0, 0);
//      rec1.setFill(Color.rgb(0, 0, 0));
//      rec1.setWidth(150);
//      rec1.setHeight(500);
//      box.getChildren().add(stackPane);
//      box.getChildren().add(grid);
//      box.getChildren().add(grid1);
//      usernameValidator.setAutoHide(false);
//      passValidator.setAutoHide(false);
//      primaryStage.setScene(scene);
//      primaryStage.show(); 
//    }
//    @Override
//    public void handle(ActionEvent e)
//    {
//        if(e.getSource()==button)
//        {
//             actiontarget.setText("");
//       Person p1=new Person();
//       checker= p1.check(UserNameTextField.getText(),PasswordTextField.getText());
//       if(checker==false)
//       {
//        UserNameTextField.setStyle(errorStyle);
//        PasswordTextField.setStyle(errorStyle);
//        textfield.setStyle(errorStyle);
//        actiontarget.setFill(Color.RED);
//        actiontarget.setText("Password & username not exists");
//        usernameValidator.getItems().clear();
//        usernameValidator.getItems().add(
//                    new MenuItem("Please check your username"));
//                    usernameValidator.show(UserNameTextField, Side.RIGHT, 10, 0);
//                    passValidator.getItems().clear();
//                    passValidator.getItems().add(
//                    new MenuItem("Please check your Password"));
//                    passValidator.show(textfield, Side.RIGHT, 10, 0);
//       }
//       else 
//               {
//                   Scanner in = null;
//                   ArrayList<Person>list=new ArrayList<>();
//                   UserNameTextField.setStyle(successStyle);
//                   PasswordTextField.setStyle(successStyle);
//                   textfield.setStyle(successStyle);
//                   actiontarget.setFill(Color.GREEN);
//                   actiontarget.setText("Welcome");
//                   File file =new File("DATA.txt");
//                   
//                 try {
//                     in = new Scanner(file);
//                 } catch (FileNotFoundException ex) {
//                     Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
//                 }
//         
//             
//               while(in.hasNext())
//             {
//                Person x=new Person();
//                 x.Fname=in.next();
//                 x.Lname=in.next();
//                 x.Address=in.next();
//                 x.Phone=in.next();
//                 x.UpPassword=in.next();
//                 x.UpconPassword=in.next();
//                 x.ACType=in.next();
//                 x.Age=in.nextInt();
//                 x.Gender=in.next();
//                 x.Role=in.next();
//                 x.UpUsername=in.next(); 
//                 list.add(x);
//                 
//             }
//          int j=0;
//          for(int i=0;i<list.size();i++)
//          {
//              if(list.get(i).UpUsername.equals(UserNameTextField.getText()))
//              {
//                  j=i;
//                  break;
//              }
//          }
//                   
//                   
//                   
//                   BankSystemProject obj=new BankSystemProject();
//                 try {
//                     menu=obj.getmainmenu(UserNameTextField.getText());
//                 } catch (FileNotFoundException ex) {
//                     Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
//                 }
//                   if(menu.equals("Cl"))
//                   {
//                       MainMenu x=new MainMenu(list,j);
//                 try {
//                     x.start(primaryStage);
//                 } catch (FileNotFoundException ex) {
//                     Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
//                 }
//                   }
//                   else if(menu.equals("Em"))
//                   {
//                       Employee_Form f1=new Employee_Form();
//                       try {
//                           f1.start(primaryStage);
//                       } catch (FileNotFoundException ex) {
//                           Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
//                       }
//                       
//                   }
//                   else
//                   {
//                       ManagerForm m1=new ManagerForm();
//                       try {
//                           m1.start(primaryStage);
//                       } catch (FileNotFoundException ex) {
//                           Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
//                       }
//                   }
//                   
//                   
//               }
//        UserNameTextField.focusedProperty().addListener(
//                new ChangeListener<Boolean>() {
//                    @Override
//                    public void changed(
//                            ObservableValue<? extends Boolean> arg0,
//                            Boolean oldPropertyValue, Boolean newPropertyValue) {
//                        if (newPropertyValue) {
//                            // Clearing message if any
//                            actiontarget.setText("");
//                            // Hiding the error message
//                            usernameValidator.hide();
//                            actiontarget.setText("");
//                            passValidator.hide();
//                        }
//                    }
//                });
//
//        PasswordTextField.focusedProperty().addListener(new ChangeListener<Boolean>() {
//            @Override
//            public void changed(ObservableValue<? extends Boolean> arg0,
//                    Boolean oldPropertyValue, Boolean newPropertyValue) {
//                if (newPropertyValue) {
//                    // Clearing message if any
//                    actiontarget.setText("");
//                    // Hiding the error message
//                     passValidator.hide();
//                      actiontarget.setText("");
//                      usernameValidator.hide();
//                }
//            }
//        });
//        }
//        else if(e.getSource()==SignUp)
//        {
//            
//            SignUpForm x=new SignUpForm();
//            try {
//                x.makeScene(primaryStage);
//            } catch (IOException ex) {
//                Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
//            }    
//        }
//    }
//}