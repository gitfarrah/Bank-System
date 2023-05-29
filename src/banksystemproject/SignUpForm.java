package banksystemproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */


import com.sun.tools.javac.Main;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Arrays.fill;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.fill;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView;  

/**
 *
 * @author Dell
 */
public class SignUpForm extends Application implements EventHandler<ActionEvent>{
    
    
    
    
    public static void main(String[] args) {
        launch(args);
    }

    
    Rectangle rec1=new Rectangle();
    GridPane root=new GridPane();
    Label l1=new Label("First Name:");
    TextField First=new TextField();
    Label l2=new Label("Last Name:");
    TextField Last=new TextField();
    Label l3=new Label("Address:");
    TextField Address=new TextField();
    Label l4=new Label("Phone:");
    TextField Phone=new TextField();
    Label l5=new Label("Password:");
    PasswordField pass=new PasswordField();
    Label l6=new Label("Confirm Password:");
    PasswordField Cpass=new PasswordField();
    Label l7=new Label("Account Type:");
    ToggleGroup group = new ToggleGroup(); 
    HBox h1=new HBox();
    RadioButton rb1 = new RadioButton("Saving"); 
    RadioButton rb2 = new RadioButton("Transaction");
    Label l8=new Label("Age: ");
    TextField Age=new TextField();
    Label l9=new Label("Gender: ");
    ToggleGroup group1 = new ToggleGroup(); 
    HBox h2=new HBox();
    RadioButton rb4 = new RadioButton("Male"); 
    RadioButton rb5 = new RadioButton("Female");
    Label l10=new Label("Role: ");
    VBox vb = new VBox();
    ObservableList<String> options = FXCollections.observableArrayList("Client","Employee","Admin");
    ComboBox comboBox = new ComboBox(options);
    Button signup=new Button("SignUp");
    Person x=new Person();
    String errorStyle = String.format("-fx-border-color: RED; -fx-border-width: 2; -fx-border-radius: 3.5;");
    final ContextMenu PhoneValidator = new ContextMenu();
    final ContextMenu passValidator = new ContextMenu();
    final ContextMenu ConfirmValidator = new ContextMenu();
    final ContextMenu AgeValidator = new ContextMenu();
    Button button = new Button("SignUp"); 
    HBox all=new HBox();
    Scene s1=new Scene(all,500,500);
    Stage primaryStage1 =new Stage();
      
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        //makeScene();
    }

    
    @Override
    public void handle(ActionEvent t) {
        
        try {
            handleSave();
        } catch (IOException ex) {
            Logger.getLogger(SignUpForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void makeScene(Stage primaryStage) throws FileNotFoundException, IOException
    {
        //Stage primaryStage=new Stage();
        rec1.setFill(Color.WHITE);
        rec1.setScaleX(10);
        rec1.setScaleY(10);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(12,12,12,12));
        root.setHgap(7);
        root.setVgap(7);
        root.add(rec1, 0, 11);
        Font font = Font.font("Arial", FontWeight.BOLD, 12);
        First.setPromptText("First Name");
        l1.setFont(font);
        root.add(l1,0,0);
        root.add(First,1,0);
        Last.setPromptText("Last Name");
        l2.setFont(font);
        root.add(l2,0,1);
        root.add(Last,1,1);
        Address.setPromptText("Address");
        l3.setFont(font);
        root.add(l3,0,2);
        root.add(Address,1,2);
        Phone.setPromptText("Phone");
        l4.setFont(font);
        root.add(l4,0,3);
        root.add(Phone,1,3);
        pass.setPromptText("Password");
        l5.setFont(font);
        root.add(l5,0,4);
        root.add(pass,1,4);
        Cpass.setPromptText("Confirm Password");
        l6.setFont(font);
        root.add(l6,0,5);
        root.add(Cpass,1,5);
        l7.setFont(font);
        root.add(l7,0,6);
        rb1.setToggleGroup(group); 
        rb1.setSelected(true);
        rb2.setToggleGroup(group);
        h1.getChildren().add(rb1);
        h1.getChildren().add(rb2);
        root.add(h1, 1, 6);
        Age.setPromptText("Age");
        l8.setFont(font);
       root.add(l8,0,7);
       root.add(Age,1,7);
        l9.setFont(font);
       root.add(l9,0,8);
        rb4.setToggleGroup(group1); 
        //rb4.setSelected(true);
        rb5.setToggleGroup(group1);
        h2.getChildren().add(rb4);
        h2.getChildren().add(rb5);
        root.add(h2, 1, 8);
        l10.setFont(font);
        root.add(l10,0,9);
        vb.getChildren().add(comboBox);
        root.add(vb, 1,9);
        String styles =
        "-fx-background-color: #351040 ;" +
        "-fx-text-fill: #FFFFFF;" ;
        button.setStyle(styles);
        Font font1 = Font.font("Arial", FontWeight.BOLD, 16);
        button.setFont(font1);
        button.setPrefSize(270,2);
        root.add(button,1,10);
        button.setOnAction(this);
        Image image =new Image(new FileInputStream("bank1.png"));
        ImageView im=new ImageView(image);
        im.setFitHeight(170);
        im.setFitWidth(150);
        Rectangle rec1=new Rectangle();
        rec1.setFill(Color.rgb(53, 16, 64));
        rec1.setWidth(150);
        rec1.setHeight(500);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(rec1);
        stackPane.getChildren().add(im);
        all.getChildren().add(stackPane);
        all.getChildren().add(root);
        //changeScene(s1,"SignUp");
        primaryStage.setScene(s1);
        primaryStage.setTitle("SignUp");
        primaryStage.show();
        primaryStage1=primaryStage;
        
        
        
    }
    
    private boolean isInputValid() {
        
        
         boolean pcheck=true;
                 passValidator.getItems().clear();
                //check=true;
                x.setFname(First.getText());
                x.setLname(Last.getText());
                x.setAddress(Address.getText());
                String Phone1=Phone.getText();
                if(Phone1.length()!=11||Phone.getText()==null)
                {
                    
                    Phone.setStyle(errorStyle);
                    PhoneValidator.getItems().clear();
                    PhoneValidator.getItems().add( new MenuItem("Check your Phone number 11 char"));
                    PhoneValidator.show(Phone, Side.RIGHT, 10, 0);
                    pcheck=false;
                   
                }
                else
                {
                    pcheck=true;
                    x.setPhone(Phone1);
                    Phone.setStyle(null);
                    PhoneValidator.hide();
                }
                String password=pass.getText();
                boolean ccheck=true;
                boolean error1=true;
                boolean error2=true;
                boolean error3=true;
                if(password.length()>=8)
                {
                   error1=false;  
                }
                 for(int i=0;i<password.length();i++)
                 {
                     if(password.charAt(i)>=65&&password.charAt(i)<=90)
                     {
                         error2=false;
                         break;
                     }
                 }
                  for(int i=0;i<password.length();i++)
                 {
                    if(password.charAt(i)>=48&&password.charAt(i)<=57)
                   {
                    error3=false;
                    break;
                   }
                 }
                  
                  if(error1)
                  {
                    
                      passValidator.getItems().add(new MenuItem("Enter more than 8 Char"));
                  }
                  if(error2)
                  {
                      
                      passValidator.getItems().add(new MenuItem("Enter at least one CAPITAL char"));
                  }
                  if(error3)
                  {
                      
                      passValidator.getItems().add(new MenuItem("Enter at least one Number"));
                  }
                  if(error1||error2||error3||pass.getText()==null)
                  {
                      ccheck=false;
                      pass.setStyle(errorStyle);
                      passValidator.show(pass,Side.RIGHT, 10, 0);
                  }
                  else
                  {
                      ccheck=true;
                      x.setUpPassword(password);
                      pass.setStyle(null);
                      passValidator.hide();
                  }

                boolean chcheck=true;
                String cpassword= Cpass.getText();
                ConfirmValidator.getItems().clear();
                if(cpassword.equals(password))
                {
                    chcheck=true;
                    ConfirmValidator.hide();
                    Cpass.setStyle(null);
                    x.setUpconPassword(password);

                }
                else if(Cpass.getText()==null)
                {
                    Cpass.setStyle(errorStyle);
                    ConfirmValidator.getItems().add( new MenuItem("ConfirmPassword not matching"));
                }
                else
                {
                    Cpass.setStyle(errorStyle);
                    ConfirmValidator.getItems().add( new MenuItem("ConfirmPassword not matching"));
                    ConfirmValidator.show(Cpass, Side.BOTTOM, 10, 0);
                    chcheck=false;
                }
                
                if(rb1.isSelected())
                {
                    x.setACType("Saving");
                }
                else
                {
                    x.setACType("Transaction");
                }
                
                int age=Integer.parseInt(Age.getText());
                boolean acheck=true;
                AgeValidator.getItems().clear();
                if(age>18)
                {
                    x.setAge(age);
                    Age.setStyle(null);
                    AgeValidator.hide();
                    acheck=true;
                    
                    
                }
                else if(Age.getText()==null)
                {
                    Age.setStyle(errorStyle);
                    AgeValidator.getItems().add( new MenuItem("Invalide Age"));
                }
                else
                {
                    Age.setStyle(errorStyle);
                    AgeValidator.getItems().add( new MenuItem("Invalide Age"));
                    AgeValidator.show(Age, Side.RIGHT, 10, 0);
                    acheck=false; 
                    
                }
                
                
                if(rb4.isSelected())
                {
                    x.setGender("Male");
                }
                else
                {
                    x.setGender("Female");
                }
                 x.setRole((String)comboBox.getValue());
                 
                 
                 if(pcheck&&ccheck&&chcheck&&acheck)
                 {
                     return true;
                     
                 }
                 return false;
        
          
    }
 
      public void handleSave() throws IOException {
     if(isInputValid()){
      Scanner in = null;
      ArrayList<Person> list=new ArrayList<>();
      
      File file =new File("DATA.txt");
      x.setUpUsername();
      x.setarray();
      x.SetFile();     
      x.setfile1(file);
      Account n1=new Account();
      n1.setUserName(x.UpUsername);
      if(x.UpUsername.startsWith("Cl"))
      {
      n1.setBalance(0);
      Employee em=new Employee();
      n1.setAccountNumber(em.Generate());
      n1.setlistwithap(n1);
      }
      
      String menu=null;
      
                   
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
              if(list.get(i).UpUsername.equals(x.UpUsername))
              {
                  j=i;
                  break;
              }
          }
      
      
      
      
      
      BankSystemProject obj=new BankSystemProject();
                 try {
                     menu=obj.getmainmenu(x.UpUsername);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
                 }
                   if(menu.equals("Cl"))
                   {
                       MainMenu x=new MainMenu(list,j);
                 try {
                     x.start(primaryStage1);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
                 }
                   }
                   else if(menu.equals("Em"))
                   {
                       Employee_Form f1=new Employee_Form();
                       f1.start(primaryStage1);
                       
                   }
                   else
                   {
                      ManagerForm m1=new ManagerForm();
                       try {
                           m1.start(primaryStage1);
                       } catch (FileNotFoundException ex) {
                           Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   }
      
      
      
      
      
      
      
     
      
      
      
     }
     else
     {
         System.out.println("Invalide");
         
     }


}
      
      
//      public void handleSave(Stage primaryStage) throws IOException {
//     if(isInputValid()){
//      File file =new File("DATA.txt");
//      x.setUpUsername();
//      x.setarray();
//      x.SetFile();     
//      x.setfile1(file); 
//      MainMenu y=new MainMenu();
//      y.makeScene(primaryStage);
//      
//      
//      
//      
//     }
//     else
//     {
//         System.out.println("Invalide");
//         
//     }


//}
//      
      
      
      
      
      
//      void changeScene()
//      {
//          primaryStage1.setScene(s1);
//          primaryStage1.setTitle("SignUp");
//          primaryStage1.show();
//          
//          
//      }
      
      
      
}
