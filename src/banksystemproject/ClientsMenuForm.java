package banksystemproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class ClientsMenuForm extends Application {
    
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
        Font font2 = Font.font("Aharoni", FontWeight.BOLD, 20);    
        BorderPane borderpane5 = new BorderPane();
        Scene scene2 = new Scene(borderpane5,850,700);
        Rectangle rec2 = new Rectangle (20,10,810,55);
        HBox hbox = new HBox();
        VBox vbox = new VBox();
        hbox.setPadding(new Insets(20,10,20,10));
        hbox.setSpacing(100);
        vbox.setPadding(new Insets(20,20,20,20));
        vbox.setSpacing(30);
        vbox.setAlignment(Pos.CENTER);
        hbox.setAlignment(Pos.CENTER);
        borderpane5.setTop(rec2);
        borderpane5.setPadding(new Insets(20,20,20,20));
        Color c1 = Color.web("#585259");
        rec2.setFill(c1);
        rec2.setArcWidth(25);
        rec2.setArcHeight(25);
        borderpane5.setPadding(new Insets(20,20,20,20));
        //borderpane.setRight(im2);
        TextField text1= new TextField();
        Button btn1 = new Button("Clients Activity");
        btn1.setFont(font2);
        btn1.setPrefSize(250,50);
        btn1.setStyle(handle1_styles);
        btn1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle (ActionEvent e)
            {
                primaryStage.hide();
                ClientsActivityForm showActivity = new ClientsActivityForm();
                try {
                    showActivity.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ClientsMenuForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                primaryStage.show();
                
                
            }
            });
        Button btn2 = new Button("Show All Clients DATA");
        btn2.setFont(font2);
        btn2.setPrefSize(250,50);
        btn2.setStyle(handle1_styles);
        btn2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle (ActionEvent e)
            {
                primaryStage.hide();
                ShowAllDataForm showAll = new ShowAllDataForm();
                try {
                    showAll.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ClientsMenuForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                primaryStage.show();
                
            }
            });
        Button btn3 = new Button("Search Specific Client");
        btn3.setFont(font2);
        btn3.setPrefSize(250,50);
        btn3.setStyle(handle1_styles);
        btn3.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle (ActionEvent e)
            {
                primaryStage.hide();
                SearchClientForm searchClient = new SearchClientForm();
                try {
                    searchClient.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ClientsMenuForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                primaryStage.show();
                
            }
            });
        vbox.getChildren().addAll(btn1,btn2,btn3);
        hbox.getChildren().add(vbox);
        Image image2 =new Image(new FileInputStream("client.png"));
        ImageView im2=new ImageView(image2);
        im2.setFitHeight(240);
        im2.setFitWidth(250);
        hbox.getChildren().add(im2);
        //borderpane.setCenter(hbox);
        Button btn4 = new Button("Back");
        btn4.setFont(font2);
        btn4.setPrefSize(120,40);
        btn4.setStyle(styles1);
        btn4.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent t) {
            primaryStage.hide();    
            ManagerForm managerForm = new ManagerForm();
            try {
                managerForm.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SearchClientForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            primaryStage.show();
                
                
            }
            
            
            
        }
        );
        borderpane5.setBottom(btn4);
        VBox vb = new VBox();
        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(20,20,20,20));
        vb.setSpacing(30);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setAlignment(Pos.TOP_CENTER);
        Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,40);
        Text t1 = new Text(30,30,"Welcome, Select A Field");
        t1.setFont(font7);
        Color c2 = Color.web("#F29E6D");
        t1.setFill(c2);
        grid.add(t1,2,2);
        vb.getChildren().addAll(grid,hbox);
        borderpane5.setCenter(vb);

        primaryStage.setScene(scene2);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
