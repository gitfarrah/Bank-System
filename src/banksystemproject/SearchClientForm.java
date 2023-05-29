package banksystemproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
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
public class SearchClientForm extends Application {
    Text text=new Text("");
    Text t1=new Text("");
    Text t2=new Text("");
    Text text2=new Text("");
    Text text3=new Text("");
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        String styles =
        "-fx-background-color: #3F5573  ;"+
      "-fx-text-fill: #FFFFFF;" ;
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
      "-fx-background-color: #8C5042  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        String handle4_styles =
      "-fx-background-color: #7EAED9  ;"+
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
        Font font1 = Font.font("Aharoni", FontWeight.BOLD, 15);
        BorderPane borderpane = new BorderPane();
        Rectangle rec2 = new Rectangle (20,10,810,55);
        HBox hb = new HBox();
        HBox hb4 = new HBox();
        hb4.setPadding(new Insets(20,10,20,10));
        hb4.setSpacing(10);
        GridPane grid5= new GridPane();
        borderpane.setTop(rec2);
        borderpane.setPadding(new Insets(20,20,20,20));
        //HBox hb = new HBox();
        Color c1 = Color.web("#8C5042");
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
        Image image3 =new Image(new FileInputStream("target.png"));
        ImageView im3=new ImageView(image3);
        im3.setFitHeight(240);
        im3.setFitWidth(250);
        vb3.getChildren().add(im3);
        vb3.setSpacing(20);
        hb.setSpacing(20);
        borderpane.setLeft(vb3);
        Button btn1 = new Button("Clients Activity");
        Button btn2 = new Button ("Show All Data");
        btn1.setFont(font2);
        btn1.setPrefSize(230,40);
        btn1.setStyle(handle4_styles);
        btn1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle (ActionEvent e)
            {
                primaryStage.hide();
                ClientsActivityForm showActivity = new ClientsActivityForm();
                try {
                    showActivity.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SearchClientForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                primaryStage.show();
            }
        });

        btn2.setFont(font2);
        btn2.setPrefSize(230,40);
        btn2.setStyle(handle4_styles);
        btn2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle (ActionEvent e)
            {
                primaryStage.hide();
                ShowAllDataForm showAll = new ShowAllDataForm();
                try {
                    showAll.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SearchClientForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                primaryStage.show();
            }
        });
        vb3.getChildren().add(btn1);
        vb3.getChildren().add(btn2);
        Text t7 = new Text(25,25,"Search For A Client");
        Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,30);
        t7.setFont(font7);
        Color c5 = Color.web("#7EAED9");
        t7.setFill(c5);
        hb.setSpacing(80);
        grid5.add(t7,0,9);
        TextField userName = new TextField();
        userName.setPromptText("Enter Username");
        grid5.add(userName,0,11);
        Button btn7 = new Button("Search");
        btn7.setFont(font2);
        btn7.setStyle(handle4_styles);
        btn7.setOnAction(new EventHandler<ActionEvent>()
    {
        public void handle (ActionEvent e)
        {
            Manager manager2 = new Manager();
            String name = userName.getText();
            
            try {
                if(manager2.showspc(name))
                {
                    userName.setStyle(successStyle);
                    t2 =new Text("");
                    t1.setText("available username");
                    t1.setFont(font2);
                    t1.setFill(Color.GREEN);
                    //grid5.add(t1,0,10);
                    int x=13;
                    String[]list2 = null;
                    try {
                        list2 = dataClient(name);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(SearchClientForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for(int i=0;i<1;i++)
                    {
                        text.setText("This Client is Active");
                        text.setFont(font1);
                        
                        x++;
                        text2.setText("This Client made " + list2[0] + " transactions");
                        text2.setFont(font1);
                        
                        x++;
                        text3.setText("From these "+list2[0]+" transactions "+list2[1]+" deposits and "+ list2[2]+" withdraws");
                        text3.setFont(font1);
                        
                        x++;
                        
                    }

                }
                else{
                    userName.setStyle(errorStyle);
                    t1.setText("Try Again");
                    t1.setFill(Color.RED);
                    t2.setText("");
            text.setText("");
            text2.setText("");
            text3.setText("");
                    
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SearchClientForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            } 

        
    }
    );
        grid5.add(text,0,13);
        grid5.add(text2,0,14);
        grid5.add(text3,0,15);
        grid5.add(t1,0,10);
    Button btn8 = new Button("Clear");
    btn8.setFont(font2);
    btn8.setStyle(handle4_styles);
    btn8.setOnAction(new EventHandler<ActionEvent>()
    {
        public void handle (ActionEvent e)
        {
            userName.clear();
            userName.setStyle(null);
            t1.setText("");
            t2.setText("");
            text.setText("");
            text2.setText("");
            text3.setText("");

        }
    }
    );
    hb4.getChildren().addAll(btn7,btn8);
    grid5.add(hb4,0,12);
    hb.getChildren().addAll(vb3,grid5);
   Button btn9 = new Button("Back");
   btn9.setFont(font2);
   btn9.setPrefSize(120,40);
   btn9.setStyle(handle3_styles);
   btn9.setOnAction(new EventHandler<ActionEvent>()
        {
        public void handle (ActionEvent e)
            {
                primaryStage.hide();
              ClientsMenuForm clientsForm = new ClientsMenuForm();
               
            try {
                clientsForm.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SearchClientForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                
              primaryStage.show();
                
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

