package banksystemproject;

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import banksystemproject.Account;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
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
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Dodz
 */
public class AccoutBalance extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch(args);
    }
     GridPane grid4 = new GridPane();
      TextField AmountField =new TextField();
      Button btn5 = new Button("Confirm Amount");
      final ContextMenu ComboBoxValidator = new ContextMenu();
      Font font1 = Font.font("Arial", FontWeight.BOLD, 20);
      ArrayList<Person>list=new ArrayList<>();
      int j=0;
    
      
      public AccoutBalance(ArrayList<Person>list,int j) {
        this.list=list;
        this.j=j;
        
    }
      
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, IOException {
        
             
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
      "-fx-background-color: #008000  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        String ComboStyle=
      "-fx-text-fill: -fx-text-inner-White;"+
      "-fx-font:18 Arial;"+
      "-fx-background-color: #008000 ;";
                
        
        BorderPane borderpane = new BorderPane();
        StackPane stackpane = new StackPane();
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(10,10,10,10));
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(20,20,20,20));
        hbox.setSpacing(30);
        VBox vb = new VBox();
        Font font2 = Font.font("Aharoni", FontWeight.BOLD, 55);
        Font font9 = Font.font("Aharoni", FontWeight.BOLD, 20);
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
        Rectangle rec1 = new Rectangle (30,50,700,55);
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
        HBox box = new HBox(30);
        VBox vbox= new VBox(25);
        grid.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.CENTER);
        Color c = Color.web("#008000");
        rec1.setFill(c);
        rec1.setArcWidth(25);
        rec1.setArcHeight(25);
        //stackpane.setAlignment(Pos.TOP_LEFT);
        //stackpane.setPadding(new Insets(10,10,10,10));
        
         //box.getChildren().addAll(btn1,btn2);
        vbox.getChildren().addAll(box);
        grid.getChildren().add(vbox);
        borderpane.setTop(stackpane);
        borderpane.setCenter(grid);
        //borderpane.setBottom(btn3);
         BorderPane borderpane1 = new BorderPane();
                       // Manager manager = new Manager();
//                        Rectangle rec2 = new Rectangle (20,10,820,55);
                       
                        Image image4 =new Image(new FileInputStream("3190655.png"));
                        ImageView im4=new ImageView(image4);
                        im4.setFitHeight(200);
                        im4.setFitWidth(210);
//                     
                        HBox hb = new HBox();
                        VBox vb3 = new VBox();
                        hb.setPadding(new Insets(20,10,20,10));
                        hb.setSpacing(100);
                        vb3.setPadding(new Insets(20,10,20,10));
                        grid4.setVgap(10);
                        grid4.setAlignment(Pos.TOP_CENTER);
                        grid4.setPadding(new Insets(20,20,20,20));
                        vb3.setAlignment(Pos.TOP_LEFT);
                        hb.setAlignment(Pos.TOP_CENTER);
                       // vb3.getChildren().add(im4);
                        vb3.setSpacing(20);
                        hb.setSpacing(20);
                        borderpane.setLeft(vb3);
                        Button btn6 = new Button("Deposit");
                         btn6.setOnAction(new EventHandler<ActionEvent>() {
                      @Override
                       public void handle(ActionEvent t) {
                           
                          depositformnew l1=new depositformnew(list,j);
                          try {
                              l1.start(primaryStage);
                          } catch (FileNotFoundException ex) {
                              Logger.getLogger(depositformnew.class.getName()).log(Level.SEVERE, null, ex);
                          }
                           
                           
                           
                       }
                         });
                         
                        Button btn1 = new Button("Withdraw");
                        btn1.setOnAction(new EventHandler<ActionEvent>() {
                      @Override
                       public void handle(ActionEvent t) {
                           
                        WithdrawForm l1=new WithdrawForm(list,j);
                          try {
                              l1.start(primaryStage);
                          } catch (FileNotFoundException ex) {
                              Logger.getLogger(depositformnew.class.getName()).log(Level.SEVERE, null, ex);
                          }
                           
                       }
                         });

                          Button btn2 = new Button ("Currency Exchange");
                          btn2.setOnAction(new EventHandler<ActionEvent>() {
                          @Override
                          public void handle(ActionEvent t) {
                          CurrencyExchange l1=new CurrencyExchange(list,j);
                          try {
                              l1.start(primaryStage);
                          } catch (FileNotFoundException ex) {
                              Logger.getLogger(depositformnew.class.getName()).log(Level.SEVERE, null, ex);
                          }
                       }
                         });
                        
                        
                        
                        
                        Button btn3 = new Button ("Transfer");
                         btn3.setOnAction(new EventHandler<ActionEvent>() {
                      @Override
                       public void handle(ActionEvent t) {
                          TransferForm l1=new TransferForm(list,j);
                          try {
                              l1.start(primaryStage);
                          } catch (FileNotFoundException ex) {
                              Logger.getLogger(depositformnew.class.getName()).log(Level.SEVERE, null, ex);
                          }
                           
                       }
                         });
                        
                        
                        
                        
                        Button btn4 =new Button ("Back");
                        btn4.setOnAction(new EventHandler<ActionEvent>() {
                      @Override
                       public void handle(ActionEvent t) {
                          TransactionMenu l1=new TransactionMenu(list,j);
                          l1.makescene(primaryStage);
                       }
                         });

                        
                        
       
                        btn1.setPrefSize(230,10);
                        btn1.setStyle(handle2_styles);
                        btn2.setPrefSize(230,10);
                        btn2.setStyle(handle2_styles);
                        btn3.setPrefSize(230,10);
                        btn3.setStyle(handle2_styles);
                        btn4.setPrefSize(230,10);
                        btn4.setStyle(handle2_styles);
                        btn6.setPrefSize(230,10);
                        btn6.setStyle(handle2_styles);

                        
                        btn1.setFont(font9);
                        btn2.setFont(font9);
                        btn3.setFont(font9);
                        btn4.setFont(font9);
                        btn6.setFont(font9);


                        
                        
                        vb3.getChildren().add(im4);
                        vb3.getChildren().add(btn6);
                        vb3.getChildren().add(btn1);
                        vb3.getChildren().add(btn2);
                        vb3.getChildren().add(btn3);
                        vb3.getChildren().add(btn4);

                       
                        Text t1 = new Text(30,30,"Your Balance is ");
                        Font font7=Font.font("Ariel",FontWeight.BOLD,40);
                        t1.setFont(font7);
                        Color c3 = Color.web("#000000");
                        t1.setFill(c3);
                        hb.setSpacing(80);
                        Account A1 =new Account();
                        A1.setUserName(list.get(j).UpUsername);
                        A1.checkBalance(list.get(j).UpUsername);
                        
                        
                        Label l1=new Label("   "+A1.getBalance()+"$");
                        l1.setFont(font2);
                        VBox vv=new VBox();
                        vv.getChildren().add(t1);
                        vv.getChildren().add(l1);
                        vv.setPadding(new Insets(200,10,0,35));
                      
                        GridPane cash=new GridPane();
                        Image image2 =new Image(new FileInputStream("aaaa.png"));
                        ImageView im2=new ImageView(image2); 
                        im2.setFitHeight(60);
                        im2.setFitWidth(60);
                        cash.setAlignment(Pos.BOTTOM_RIGHT);
                        cash.add(im2, 0, 0);
                        cash.setPadding(new Insets(0,20,10,0));
                        RotateTransition rotate = new RotateTransition();    
                        rotate.setAxis(Rotate.Y_AXIS);    
                        rotate.setByAngle(360);  
                        rotate.setCycleCount(1000);  
                        rotate.setDuration(Duration.millis(1500));  
                        rotate.setAutoReverse(true);  
                        rotate.setNode(im2);     
                        rotate.play(); 
                        HBox bottom=new HBox();
                        bottom.getChildren().add(btn4);
                        bottom.getChildren().add(cash);
                        bottom.setSpacing(500);
                        borderpane.setBottom(bottom);
                        
                        
//                        borderpane.setBottom(cash);
//
//                        vv.getChildren().add(cash);
                          hb.getChildren().addAll(vb3,vv);
                          borderpane.setCenter(hb);
//                 

                        
        
        Scene scene1 = new Scene(borderpane,720, 670);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Test");
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
