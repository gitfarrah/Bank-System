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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
public class ManagerForm extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        final ContextMenu usernameValidator = new ContextMenu();
        String errorStyle = String.format("-fx-border-color: RED; -fx-border-width: 2; -fx-border-radius: 3.5;");
        String successStyle = String.format("-fx-border-color: Green; -fx-border-width: 2; -fx-border-radius: 3.5;");
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
                
       
        
        Image image =new Image(new FileInputStream("manager.png"));
        ImageView im=new ImageView(image);
        BorderPane borderpane = new BorderPane();
        StackPane stackpane = new StackPane();
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(10,10,10,10));
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(20,20,20,20));
        hbox.setSpacing(30);
        VBox vb = new VBox();
        ObservableList<String> options = 
                FXCollections.observableArrayList(
                        "Client",
                        "Employee"
                );
        ComboBox combobox = new ComboBox(options);
        combobox.setPromptText("Select View");
        combobox.setStyle(ComboStyle);
        //combobox.setPrefWidth(150);
       // combobox.setStyle(cb_style);
        Rectangle rec1 = new Rectangle (20,10,750,55);
        Text iBanking = new Text(30,30,"iBanking");
        Font font1=Font.font("Ariel",FontWeight.BOLD,20);
        iBanking.setFont(font1);
        iBanking.setFill(Color.WHITE);
        //stackpane.setAlignment(Pos.TOP_LEFT);
        stackpane.getChildren().add(rec1);
        hbox.getChildren().add(iBanking);
        Text Dashboard = new Text(30,30,"Dashboard");
        Font font3 = Font.font("Ariel",20);
        Dashboard.setFont(font3);
        Dashboard.setFill(Color.WHITE);
        hbox.getChildren().add(Dashboard);
        hbox.getChildren().add(combobox);
        TextField textfield1 = new TextField();
        textfield1.setStyle(tf_style);
        hbox.getChildren().add(textfield1);
        GridPane grid = new GridPane();
        stackpane.getChildren().add(hbox);
        grid.setVgap(10);
        im.setFitHeight(200);
        im.setFitWidth(200);
        HBox box = new HBox(30);
        VBox vbox= new VBox(25);
        grid.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.CENTER);
        Color c = Color.web("#3F5573");
        rec1.setFill(c);
        rec1.setArcWidth(25);
        rec1.setArcHeight(25);
        //borderpane.setTop(rec1);
        borderpane.setPadding(new Insets(20,20,20,20));
        grid.setPadding(new Insets(20,20,20,20));
        Button btn1 = new Button("View Client");
        btn1.setStyle(btn_style);
        Font font2 = Font.font("Aharoni", FontWeight.BOLD, 20);
        btn1.setFont(font2);
        btn1.setPrefSize(180,40); 
        Image image2 =new Image(new FileInputStream("client.png"));
        ImageView im2=new ImageView(image2);
        im2.setFitHeight(240);
        im2.setFitWidth(250);
        Image image3 =new Image(new FileInputStream("target.png"));
        ImageView im3=new ImageView(image3);
        im3.setFitHeight(240);
        im3.setFitWidth(250);
        Image image4 =new Image(new FileInputStream("personal.png"));
        ImageView im4=new ImageView(image4);
        im4.setFitHeight(200);
        im4.setFitWidth(210);
        Image image5 =new Image(new FileInputStream("rating.png"));
        ImageView im5=new ImageView(image5);
        im5.setFitHeight(200);
        im5.setFitWidth(210);
        Scene scene1 = new Scene(borderpane,780, 700);
        btn1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
                primaryStage.hide();
                ClientsMenuForm clientsForm = new ClientsMenuForm();
               
                try {
                    clientsForm.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ManagerForm.class.getName()).log(Level.SEVERE, null, ex);
                }

                  primaryStage.show();
               
            }
        }
        );
        Button btn2 = new Button("View Employee");
        btn2.setStyle(btn_style);
        btn2.setFont(font2);
        btn2.setPrefSize(180,40); 
        btn2.setOnAction(new EventHandler<ActionEvent>()
                {
                    public void handle (ActionEvent e)
                    {
                        primaryStage.hide();
                        EmployeeMenuForm empMenu = new EmployeeMenuForm();
                        try {
                            empMenu.start(primaryStage);
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(ManagerForm.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        primaryStage.show();
                          
                    }
                }
                );
        Button btn3 = new Button("Exit");
        btn3.setStyle(styles);
        btn3.setFont(font2);
        btn3.setPrefSize(120,40);
        btn3.setOnAction(new EventHandler<ActionEvent>()
                {
                    public void handle (ActionEvent e)
                    {
                        primaryStage.hide();   
                    }
                }
                );
        box.getChildren().addAll(btn1,btn2);
        vbox.getChildren().addAll(im,box);
        grid.getChildren().add(vbox);
        borderpane.setTop(stackpane);
        borderpane.setCenter(grid);
        borderpane.setBottom(btn3);
        
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Manager");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
