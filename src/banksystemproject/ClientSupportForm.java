package banksystemproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import banksystemproject.ClientsActivityForm;
import banksystemproject.ClientsMenuForm;
import banksystemproject.Manager;
import banksystemproject.SearchClientForm;
import banksystemproject.ShowAllDataForm;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
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

/**
 *
 * @author Farrah Hany
 */
public class ClientSupportForm extends Application {
    
   Text text;
    Text t1;
    Text t2;
    Text text2;
    Text text3;
    Text t6=new Text("");
    ArrayList<Person>list=new ArrayList<>();
      int j=0;
      public ClientSupportForm(ArrayList<Person>list,int j) {
        this.list=list;
        this.j=j;        
      }  
      TextArea userName = new TextArea();
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        String btn_style =
      "-fx-background-color: #D92B5A ;" +
      "-fx-text-fill: #FFFFFF;" ;
        
        
        String tf_style =
      "-fx-background-color: #FFFFFF  ;"+ 
      "-fx-border-radius: 50px/25px;";
        
        String styles1 =
      "-fx-background-color: #585259  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        
        
        String handle1_styles =
      "-fx-background-color: #94E1F2  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        String handle2_styles =
      "-fx-background-color: #39BF68  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        
        String handle3_styles =
      "-fx-background-color: #005E89  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        String handle4_styles =
      "-fx-background-color: #F2B705  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        
        String handle5_styles =
      "-fx-background-color: #54528E  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        String handle52_styles =
      "-fx-background-color: #F2D027  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        String ComboStyle=
      "-fx-text-fill: -fx-text-inner-White;"+
      "-fx-font:18 Arial;"+
      "-fx-background-color: #3F5573 ;";
        final ContextMenu usernameValidator = new ContextMenu();
        String errorStyle = String.format("-fx-border-color: RED; -fx-border-width: 2; -fx-border-radius: 3.5;");
        String successStyle = String.format("-fx-border-color: Green; -fx-border-width: 2; -fx-border-radius: 3.5;");
        String normalStyle = String.format("-fx-border-color: Gray; -fx-border-width: 2; -fx-border-radius: 3.5;");
        
        
        Font font2 = Font.font("Aharoni", FontWeight.BOLD, 20); 
        BorderPane borderpane = new BorderPane();
        Rectangle rec2 = new Rectangle (20,10,810,55);
        HBox hb = new HBox();
        VBox vb4 = new VBox();
        vb4.setPadding(new Insets(20,10,20,10));
        vb4.setSpacing(10);
        GridPane grid5= new GridPane();
        borderpane.setTop(rec2);
        borderpane.setPadding(new Insets(20,20,20,20));
        //HBox hb = new HBox();
        Color c1 = Color.web("#005E89");
        rec2.setFill(c1);
        rec2.setArcWidth(25);
        rec2.setArcHeight(25);
        VBox vb3 = new VBox();
        hb.setPadding(new Insets(20,10,20,10));
        hb.setSpacing(100);
        vb3.setPadding(new Insets(20,10,20,10));
        grid5.setVgap(8);
        grid5.setAlignment(Pos.TOP_CENTER);
        grid5.setPadding(new Insets(20,20,20,20));
        vb3.setAlignment(Pos.TOP_LEFT);
        hb.setAlignment(Pos.TOP_CENTER);
        Image image3 =new Image(new FileInputStream("support.png"));
        ImageView im3=new ImageView(image3);
        im3.setFitHeight(240);
        im3.setFitWidth(250);
        vb3.getChildren().add(im3);
        vb3.setSpacing(20);
        hb.setSpacing(20);
        borderpane.setLeft(vb3);
        Button btn1 = new Button("Transaction");
        Button btn2 = new Button ("Messages");
        btn1.setFont(font2);
        btn1.setPrefSize(230,40);
        btn1.setStyle(handle4_styles);
        btn1.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle (ActionEvent e)
            {
                TransactionMenu t1=new TransactionMenu(list, j);
                t1.makescene(primaryStage);
            }
        });

        btn2.setFont(font2);
        btn2.setPrefSize(230,40);
        btn2.setStyle(handle4_styles);
        btn2.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle (ActionEvent e)
            {
               ClientRecieveForm t2=new ClientRecieveForm(list, j);
                try {
                    t2.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ClientSupportForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        vb3.getChildren().add(btn1);
        vb3.getChildren().add(btn2);
        Text t7 = new Text(25,25,"Enter Your Complain");
        Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,30);
        t7.setFont(font7);
        Color c5 = Color.web("#D93232");
        t7.setFill(c5);
        hb.setSpacing(80);
        grid5.add(t7,0,10);
        
        userName.setPromptText("Write Your Complain");
        grid5.add(userName,0,11);
        Button btn7 = new Button("Send");
        btn7.setFont(font2);
        btn7.setStyle(handle4_styles);
        btn7.setPrefSize(230,40);
        btn7.setOnAction(new EventHandler<ActionEvent>()
    {
        @Override
        public void handle (ActionEvent e)
        {
         Account A1=new Account();
         A1.setUserName(list.get(j).UpUsername);
         FileWriter file=null;
            try {
                file = new FileWriter("Help.txt",true);
            } catch (IOException ex) {
                Logger.getLogger(ClientSupportForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                PrintWriter ko1=new PrintWriter(file);
                help_system x=new help_system();
                x.hname=list.get(j).UpUsername;
                x.problem=userName.getText();
                ko1.println(x.hname);
                ko1.println(x.problem);
                ko1.println(x.answer);
                ko1.close();
                userName.setText("");
                t6.setText("Message Delivered");
                t6.setFont(font2);
                grid5.add(t6, 0, 13);
                
                
        }
   }
    );
    Button btn8 = new Button("Clear");
    btn8.setFont(font2);
    btn8.setStyle(handle4_styles);
    btn8.setPrefSize(230,40);
    btn8.setOnAction(new EventHandler<ActionEvent>()
    {
        @Override
        public void handle (ActionEvent e)
        {
            userName.clear();
            userName.setStyle(normalStyle);
        }
    }
    );
    vb4.getChildren().addAll(btn7,btn8);
    grid5.add(vb4,0,12);
    hb.getChildren().addAll(vb3,grid5);
   Button btn9 = new Button("Back");
   btn9.setFont(font2);
   btn9.setPrefSize(120,40);
   btn9.setStyle(handle3_styles);
   btn9.setOnAction(new EventHandler<ActionEvent>()
        {
        @Override
        public void handle (ActionEvent e)
            {
                
              MainMenu c1 = new MainMenu(list,j);
              
            try {
                c1.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ClientSupportForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                
              
                
            }
        });

    borderpane.setBottom(btn9);
    borderpane.setCenter(hb);
    Scene scene3 = new Scene(borderpane,850,700);
    primaryStage.setScene(scene3);
    primaryStage.show();
    }
                       
                        

    public static void main(String[] args) {
        launch(args);
    }
public String[] dataClient(String name) throws FileNotFoundException
   {
       Manager manager = new Manager();
       ArrayList<Integer> arrList2 = new ArrayList();
       arrList2=manager.dataClient(name);       
       String[]list2=new String[arrList2.size()] ;
       for(int i=0;i<arrList2.size();i++)
       {
           list2[i] = String.valueOf(arrList2.get(i));
       }
       return list2;
   }
    
    
}
