/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package banksystemproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class TransactionMenu extends Application {
    
    ArrayList<Person>list=new ArrayList<>();
    int j=0;
    StackPane p1=new StackPane();
    Scene scene = new Scene(p1, 850, 700);

    public TransactionMenu(ArrayList<Person>list,int j) {
        this.list=list;
        this.j=j;
        
    }
    
    public void makescene(Stage primaryStage)
    {
        
         System.out.println(list.get(j).UpUsername);
         FileInputStream input = null;
     try {
       input = new FileInputStream("tt.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image image = new Image (input);
       ImageView img =new ImageView(image);
       img.setFitHeight(700);
       img.setFitWidth(800);
      
       p1.getChildren().add(img);
       
       
       
       
       
         FileInputStream input1 = null;
     try {
       input1 = new FileInputStream("Depositnw.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image img1 = new Image(input1);
       ImageView view = new ImageView(img1);
       view.setX(90);
       view.setY(90);
       view.setFitHeight(150);
       view.setPreserveRatio(true);
       
       Button button = new Button();
       button.setStyle(
               "-fx-border-color: transparent;" +
      "-fx-border-width: 0;" +
      "-fx-background-radius: 0;"+
      "-fx-background-color: transparent;"
       );
       button.setLayoutX(0);
       button.setLayoutY(0);
       button.setGraphic(view);
       button.setOnAction(new EventHandler<ActionEvent>()
               {
             @Override
             public void handle(ActionEvent t) {
                 depositformnew n1=new depositformnew(list,j);
                 try {
                     n1.start(primaryStage);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(TransactionMenu.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
 
                 
              }

               });
       
       
       
       
       
       
        FileInputStream input2 = null;
     try {
       input2 = new FileInputStream("Wd.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image img2 = new Image(input2);
       ImageView view2 = new ImageView(img2);
       view2.setX(90);
       view2.setY(90);
       view2.setFitHeight(150);
       view2.setPreserveRatio(true);
       
       
       Button button2 = new Button();
       button2.setStyle(
               "-fx-border-color: transparent;" +
      "-fx-border-width: 0;" +
      "-fx-background-radius: 0;"+
      "-fx-background-color: transparent;"
       );
       button2.setLayoutX(0);
       button2.setLayoutY(0);
       button2.setGraphic(view2);
       button2.setOnAction(new EventHandler<ActionEvent>()
               {
             @Override
             public void handle(ActionEvent t) {
                 WithdrawForm n1=new WithdrawForm(list,j);
                 try {
                     n1.start(primaryStage);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(TransactionMenu.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
              }

               });
       
       
       
       
       FileInputStream input3 = null;
     try {
       input3 = new FileInputStream("balance1.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image img3 = new Image(input3);
       ImageView view3 = new ImageView(img3);
       view3.setX(90);
       view3.setY(90);
       view3.setFitHeight(150);
       view3.setPreserveRatio(true);
       
       Button button3 = new Button();
       button3.setStyle(
               "-fx-border-color: transparent;" +
      "-fx-border-width: 0;" +
      "-fx-background-radius: 0;"+
      "-fx-background-color: transparent;"
       );
       button3.setLayoutX(0);
       button3.setLayoutY(0);
       button3.setGraphic(view3);
       button3.setOnAction(new EventHandler<ActionEvent>()
               {
             @Override
             public void handle(ActionEvent t) {
                 AccoutBalance m1=new AccoutBalance(list,j);
                 try {
                     m1.start(primaryStage);
                 } catch (IOException ex) {
                     Logger.getLogger(TransactionMenu.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
                 
             }
                   
                   
               }
       
       );
       
       
       
        FileInputStream input4 = null;
     try {
       input4 = new FileInputStream("Transfernw.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image img4 = new Image(input4);
       ImageView view4 = new ImageView(img4);
       view4.setX(90);
       view4.setY(90);
       view4.setFitHeight(150);
       view4.setPreserveRatio(true);
       
       Button button4 = new Button();
       button4.setStyle(
               "-fx-border-color: transparent;" +
      "-fx-border-width: 0;" +
      "-fx-background-radius: 0;"+
      "-fx-background-color: transparent;"
       );
       button4.setLayoutX(0);
       button4.setLayoutY(0);
       button4.setGraphic(view4);
       button4.setOnAction(new EventHandler<ActionEvent>()
               {
             @Override
             public void handle(ActionEvent t) {
                 TransferForm n1=new TransferForm(list,j);
                 try {
                     n1.start(primaryStage);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(TransactionMenu.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
              }

               });
       
       
       
        FileInputStream input5 = null;
     try {
       input5 = new FileInputStream("Exchangenw.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image img5 = new Image(input5);
       ImageView view5 = new ImageView(img5);
       view5.setX(90);
       view5.setY(90);
       view5.setFitHeight(150);
       view5.setPreserveRatio(true);
       
       Button button5 = new Button();
       button5.setStyle(
               "-fx-border-color: transparent;" +
      "-fx-border-width: 0;" +
      "-fx-background-radius: 0;"+
      "-fx-background-color: transparent;"
       );
       button5.setLayoutX(0);
       button5.setLayoutY(0);
       button5.setGraphic(view5);
       button5.setOnAction(new EventHandler<ActionEvent>()
               {
             @Override
             public void handle(ActionEvent t) {
                 CurrencyExchange n1=new CurrencyExchange(list,j);
                 try {
                     n1.start(primaryStage);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(TransactionMenu.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
              }

               });
       
       
       
       
       
      
       
       
       
       
       
       HBox h1=new HBox();
       h1.getChildren().add(button);
       h1.setPrefWidth(primaryStage.getWidth());
       h1.setPrefHeight(primaryStage.getHeight());
       h1.setAlignment(Pos.CENTER);
       //h1.setMargin(button, new Insets(0,90,100,0));
       
       //HBox h2=new HBox();
       h1.getChildren().add(button2);
       h1.setPrefWidth(primaryStage.getWidth());
       h1.setPrefHeight(primaryStage.getHeight());
       h1.setAlignment(Pos.CENTER);
       //h1.setMargin(button2, new Insets(5,50,107,300));
       
       //HBox h3=new HBox();
       h1.getChildren().add(button3);
       h1.setPrefWidth(primaryStage.getWidth());
       h1.setPrefHeight(primaryStage.getHeight());
       h1.setAlignment(Pos.CENTER);
       h1.setSpacing(50);
       h1.setPadding(new Insets(0,0,30,0));
       
       HBox h2=new HBox();
       h2.getChildren().add(button4);
       h2.setPrefWidth(primaryStage.getWidth());
       h2.setPrefHeight(primaryStage.getHeight());
       h2.setAlignment(Pos.CENTER);
       
       
  
       h2.getChildren().add(button5);
       h2.setPrefWidth(primaryStage.getWidth());
       h2.setPrefHeight(primaryStage.getHeight());
       h2.setAlignment(Pos.CENTER);
       h2.setSpacing(50);
       //h2.setPadding(new Insets(300,0,90,240));
       
        Font font2 = Font.font("Aharoni", FontWeight.BOLD, 20); 
       String handle3_styles =
      "-fx-background-color: #353638  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        Button btn9 = new Button("Back");
        btn9.setFont(font2);
        btn9.setPrefSize(120,40);
        btn9.setStyle(handle3_styles);
         btn9.setOnAction(new EventHandler<ActionEvent>()
        {
        public void handle (ActionEvent e)
            {
                //primaryStage.hide();
              MainMenu mm = new MainMenu(list,j);
               
            try {
                mm.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SearchClientForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                
              //primaryStage.show();
                
            }
        });
       
       
        VBox v1=new VBox();
        v1.getChildren().addAll(h1,h2,btn9);
        v1.setPadding(new Insets(350,20,200,70));
        
      
        
        
//        HBox v2=new HBox();
//        v2.setAlignment(Pos.BOTTOM_LEFT);
//        v2.getChildren().add(btn9);
//        v2.setPadding(new Insets(600,0,0,80));
        
        
        
      
       
      
       
       
       
       
       
       
       
       
       
       p1.getChildren().add(v1);
       //p1.getChildren().add(v2);


       

     
       
       
        
        primaryStage.setTitle("IBANKING");
        primaryStage.setScene(scene);
        primaryStage.show();
         
         
     }
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void start(Stage primaryStage) {
         
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
