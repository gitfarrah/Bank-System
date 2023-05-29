package banksystemproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import banksystemproject.Account;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListCell;
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
public class CurrencyExchange extends Application {
      public static void main(String[] args) {
        launch(args);
    }
      
      public CurrencyExchange(ArrayList<Person>list,int j) {
        this.list=list;
        this.j=j;
        
    }
      ArrayList<Person>list=new ArrayList<>();
      int j=0;
 ObservableList<String> options = FXCollections.observableArrayList();
    ComboBox<String> comboBox2 = new ComboBox(options);
     ComboBox<String> comboBox3 = new ComboBox(options);
    String comboBox_text;
    String comboBox1_text;
    public int comboBox_value;
    public int comboBox1_value;
  final ContextMenu ComboBoxValidator = new ContextMenu();
    TextField To=new TextField();
    TextField From=new TextField();
     //final Text actiontarget = new Text();
    String Dollar="file:Dollar.png";
    String Europe="file:euro.png";
    String Egypt="file:egypt.png";
  String Canada="file:Canadian.png";
  String England="file:Sterling.png";
 boolean check=true;
Button b1=new Button();
double amountbox=0;
Text t12=new Text("");

 
       
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
    
        b1.setDisable(true);
        String btn_style =
      "-fx-background-color: #D92B5A ;" +
      "-fx-text-fill: #FFFFFF;" ;
        
        String tf_style =
      "-fx-background-color: #FFFFFF  ;"+ 
      "-fx-border-radius: 50px/25px;";
        
        String handle2_styles =
      "-fx-background-color: #2AF598  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        String ComboStyle=
      "-fx-text-fill: -fx-text-inner-White;"+
      "-fx-font:18 Arial;"+
      "-fx-background-color: #2AF598 ;"+
      "-fx-border-color: Black; -fx-border-width: 2; -fx-border-radius: 3.5;";
 options.addAll(Dollar,Europe,England,Egypt,Canada);
comboBox2.setButtonCell(new StatusListCell());
comboBox2.setCellFactory(c -> new StatusListCell());
comboBox2.setStyle(ComboStyle);
StackPane.setAlignment(comboBox2, Pos.CENTER_RIGHT);
StackPane sFrom=new StackPane(); 
StackPane.setAlignment(comboBox3, Pos.CENTER_RIGHT);
StackPane sTo=new StackPane();
To.setDisable(true);
sTo.getChildren().add(To);
sTo.getChildren().add((comboBox2));
sFrom.getChildren().add(From);
sFrom.getChildren().add((comboBox3));
comboBox3.setButtonCell(new StatusListCell());
comboBox3.setCellFactory(c -> new StatusListCell());
comboBox3.setStyle(ComboStyle);
    BorderPane borderpane = new BorderPane();
        StackPane stackpane = new StackPane();
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(10,10,10,10));
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(20,20,20,20));
        hbox.setSpacing(30);
        VBox vb = new VBox();
        Font font2 = Font.font("Aharoni", FontWeight.BOLD, 20);
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
        HBox box = new HBox(30);
        VBox vbox= new VBox(25);
        grid.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.CENTER);
        Color c = Color.web("#2AF598");
        rec1.setFill(c);
        rec1.setArcWidth(25);
        rec1.setArcHeight(25);
        
         //box.getChildren().addAll(btn1,btn2);
        vbox.getChildren().addAll(box);
        grid.getChildren().add(vbox);
        borderpane.setTop(stackpane);
        borderpane.setCenter(grid);
        //borderpane.setBottom(btn3);
         BorderPane borderpane1 = new BorderPane();
                       // Manager manager = new Manager();
//                        Rectangle rec2 = new Rectangle (20,10,820,55);
                        GridPane grid4 = new GridPane();
                        Image image4 =new Image(new FileInputStream("world.png"));
                        ImageView im4=new ImageView(image4);
                        im4.setFitHeight(170);
                        im4.setFitWidth(180);
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
                        Button btn1 = new Button("Deposit");
                         btn1.setOnAction(new EventHandler<ActionEvent>() {
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
                        
                        
                        Button btn2 = new Button ("Withdraw");
                         btn2.setOnAction(new EventHandler<ActionEvent>() {
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

                        
                        
                       // btn1.setFont(font2);
                        btn1.setPrefSize(230,40);
                        btn1.setStyle(handle2_styles);
                        //btn2.setFont(font2);
                        btn2.setPrefSize(230,40);
                        btn2.setStyle(handle2_styles);
                        btn3.setPrefSize(230,40);
                        btn3.setStyle(handle2_styles);
                         Button btn9 = new Button("Back");
                       btn9.setFont(font2);
                       btn9.setPrefSize(120,40);
                       btn9.setPadding(new Insets(0,10,0,10));
                       btn9.setStyle(handle2_styles);
                     btn9.setOnAction(new EventHandler<ActionEvent>() {
                      @Override
                       public void handle(ActionEvent t) {
                          TransactionMenu l1=new TransactionMenu(list,j);
                          l1.makescene(primaryStage);
                       }
                         });
                        btn1.setFont(font2);
                        btn2.setFont(font2);
                        btn3.setFont(font2);


                        
                        
                        vb3.getChildren().add(im4);
                        vb3.getChildren().add(btn1);
                        vb3.getChildren().add(btn2);
                        vb3.getChildren().add(btn3);

                       
                        Text t1 = new Text(30,30,"Currency Exchange");
                        Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,40);
                        t1.setFont(font7);
                        Color c3 = Color.web("#F24162");
                        t1.setFill(c3);
                        hb.setSpacing(80);
                        
                        
                        
                        Button btn5 = new Button("Exchange");
                        btn5.setStyle(handle2_styles);  
                        btn5.setFont(font2);
                       
                        b1.setStyle(handle2_styles);  
                        b1.setFont(font2);
                        b1.setText("Deposit this Amount");
                        HBox h1=new HBox();
                        h1.setPadding(new Insets(10,10,10,10));
                        h1.setSpacing(20);
                        h1.getChildren().addAll(btn5,b1);
                        
                        
                        
                        
   
                        btn5.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                           public void handle(ActionEvent t) {
                              comboBox_text=(String)comboBox2.getValue();
          if(comboBox_text.equals(Dollar))
          {
              comboBox_value = 1;   
          }
          else if (comboBox_text.equals(Europe))
          {
             comboBox_value = 2; 
          }
          else if (comboBox_text.equals(Egypt))
          {
             comboBox_value = 4;
 
          }
          else if (comboBox_text.equals(Canada))
          {
              comboBox_value = 5;
              
          }
          else if(comboBox_text.equals(England))
          {
              comboBox_value = 3;
          }     
         comboBox1_text=(String)comboBox3.getValue();
           if(comboBox1_text.equals(Dollar))
          {
              comboBox1_value = 1;   
          }
          else if (comboBox1_text.equals(Europe))
          {
             comboBox1_value = 2; 
          }
          else if (comboBox1_text.equals(Egypt))
          {
             comboBox1_value = 4;
             
             
          }
          else if (comboBox1_text.equals(Canada))
          {
              comboBox1_value = 5;
              
          }
          else if(comboBox1_text.equals(England))
          {
              comboBox1_value = 3;
              
          }
      
      if(comboBox1_value!=comboBox_value)
      {
                try {
              Account A1=new Account();
         
             String textamount=From.getText();
             amountbox=Double.parseDouble(textamount);
             String setTo=String.valueOf(A1.convert(amountbox, comboBox1_value, comboBox_value));
             if(comboBox_value==4)
             {
                 b1.setDisable(false);
                 b1.setOnAction(new EventHandler<ActionEvent>()
                 
                 {
                     @Override
                     public void handle(ActionEvent t) {
                         
                         t12.setText("Deposited");
                         t12.setFont(font2);
                         t12.setFill(c3);
                         double d = Double.parseDouble(setTo);
                              A1.setUserName(list.get(j).UpUsername);
                         try {
                             A1.checkBalance(list.get(j).UpUsername);
                         } catch (IOException ex) {
                             Logger.getLogger(CurrencyExchange.class.getName()).log(Level.SEVERE, null, ex);
                         }
                         try {
                             A1.Deposit(d);
                         } catch (IOException ex) {
                             Logger.getLogger(CurrencyExchange.class.getName()).log(Level.SEVERE, null, ex);
                         }
                         try {
                             A1.setlistwithoutap(list.get(j).UpUsername);
                         } catch (IOException ex) {
                             Logger.getLogger(CurrencyExchange.class.getName()).log(Level.SEVERE, null, ex);
                         }
                         
                          File file=new File(list.get(j).UpUsername+".txt");
                          FileWriter ko1 = null;
                         try {
                             ko1 = new FileWriter(file,true);
                         } catch (IOException ex) {
                             Logger.getLogger(CurrencyExchange.class.getName()).log(Level.SEVERE, null, ex);
                         }
                          PrintWriter ko3=new PrintWriter(ko1);
                          if(comboBox1_value==1)
                          {
                             ko3.println("The Previos Transaction Was Done By Echanging "+amountbox+" Dollars to "+(int)d+" Egyptian pounds");
                             ko3.close(); 
                              
                          }
                        else if(comboBox1_value==2)
                        {
                            ko3.println("The Previos Transaction Was Done By Echanging "+amountbox+" Euros to "+(int)d+" Egyptian pounds");
                            ko3.close();   
                              
                              
                        }
                        else if(comboBox1_value==3)
                        {
                            ko3.println("The Previos Transaction Was Done By Echanging "+amountbox+" Sterling to "+(int)d+" Egyptian pounds");
                            ko3.close();  
                            
                        }
                          else if(comboBox1_value==5)
                        {
                            ko3.println("The Previos Transaction Was Done By Echanging "+amountbox+" Canadian Dollars to "+(int)d+" Egyptian pounds");
                            ko3.close();  
                            
                        }
                          
                          
                         
                     }
                    
                     
                    
                     
                     
                     
                     
                     
                     
                 }
                 );
                 
             }
              To.setText(setTo);
          }   catch (IOException ex) {
              Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
          }
              catch(NumberFormatException e)
                      {
                     ComboBoxValidator.getItems().clear();
                    ComboBoxValidator.getItems().add(
                    new MenuItem("Please Enter Numbers Only"));
                    ComboBoxValidator.show(From, Side.RIGHT, 10, 0);
                      }
          }   
      else{
          
           ComboBoxValidator.getItems().clear();
                    ComboBoxValidator.getItems().add(
                    new MenuItem("Please check your Currency"));
                    ComboBoxValidator.show(From, Side.RIGHT, 10, 0);
      } 
                               
                               
                               
                           }
                        });
                        
                        
                        
                        
                       
                        
                       
                        System.out.println(comboBox1_value);
                        TextField tt=new TextField();
                        tt.setStyle(tf_style);
                        Text t3=new Text("Enter amount");
                        t3.setStyle(tf_style);
                        t3.setFont(font2);
             
                        grid4.add(t1,0,1);
                        grid4.add(t3,0,2);
                        grid4.add(sFrom,0,3);
                        grid4.add(sTo,0,4);
                      //grid4.add(t3,0,4);
                       // grid4.add(tt,0,5);
                        grid4.add(h1,0,6);
                        grid4.add(t12,0,7);
                        
                        
                        hb.getChildren().addAll(vb3,grid4);
                        borderpane.setCenter(hb);
                        GridPane cash=new GridPane();
                        Image image2 =new Image(new FileInputStream("exchanges.png"));
                        ImageView im2=new ImageView(image2); 
                        im2.setFitHeight(60);
                        im2.setFitWidth(60);
                        cash.setAlignment(Pos.BOTTOM_RIGHT);
                        cash.add(im2, 0, 0);
                        RotateTransition rotate = new RotateTransition();    
                        rotate.setAxis(Rotate.Z_AXIS);    
                        rotate.setByAngle(360);  
                        rotate.setCycleCount(1000);  
                        rotate.setDuration(Duration.millis(1500));  
                        rotate.setAutoReverse(true);  
                        rotate.setNode(im2);     
                        rotate.play(); 
                        

                    HBox bottom=new HBox();
                    bottom.getChildren().add(btn9);
                    bottom.getChildren().add(cash);
                    bottom.setSpacing(570);
                    borderpane.setBottom(bottom);

        Scene scene1 = new Scene(borderpane,765, 615);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Test");
        primaryStage.show();
    
    }
  
   
  
    public class StatusListCell extends ListCell<String> {
    @Override
    protected void updateItem(String item, boolean empty){
        super.updateItem(item, empty);
        setGraphic(null);
        if(item!=null){
            ImageView imageView = new ImageView(new Image(item));            
            imageView.setFitWidth(20);
            imageView.setFitHeight(20);
            setGraphic(imageView);
        }
    }
}
    
}
