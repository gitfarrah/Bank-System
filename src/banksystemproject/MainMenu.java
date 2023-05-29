package banksystemproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
 * @author Dell
 */
public class MainMenu extends Application {
    
    ListView mListView = new ListView();
    ListView mListView2 = new ListView();
    ArrayList<Person> list=new ArrayList<>();
    int j=0;
     Font font2 = Font.font("Aharoni", FontWeight.BOLD, 20);
     StackPane p1=new StackPane();
     Scene scene = new Scene(p1, 850, 700);
    BorderPane borderpane2=new BorderPane();
      Scene scene2 = new Scene(borderpane2,850, 700);

    public MainMenu(ArrayList<Person> list,int j) {
        this.list=list;
        this.j=j;
        
        
    }
    public MainMenu() {
   
    }
    

    
  @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
       
        System.out.println(list.get(j).UpUsername);
         FileInputStream input = null;
     try {
       input = new FileInputStream("mm.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image image = new Image (input);
       ImageView img =new ImageView(image);
       img.setFitHeight(700);
       img.setFitWidth(800);
      
       p1.getChildren().add(img);
       
       
       
       
       
         FileInputStream input10 = null;
     try {
       input10 = new FileInputStream("Tra.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image img1 = new Image(input10);
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
       button.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent t) {
                 
                 TransactionMenu menu1=new TransactionMenu(list,j);
                 menu1.makescene(primaryStage);
                 
                 
             }
       });
       
       
       
       
       
       
       FileInputStream input2 = null;
     try {
       input2 = new FileInputStream("Sh.png");
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
      "-fx-background-color: #89cff0  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        String ComboStyle=
      "-fx-text-fill: -fx-text-inner-White;"+
      "-fx-font:18 Arial;"+
      "-fx-background-color: #89cff0 ;";
                
                 try {
                     populatedData();
                 } catch (IOException ex) {
                     Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                 }
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
        HBox box = new HBox(30);
        VBox vbox= new VBox(25);
        grid.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.CENTER);
        Color c = Color.web("#89cff0");
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
                        Image image4=null;
                 try {
                     image4 = new Image(new FileInputStream("3076404.png"));
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                 }
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
                        Button btn1 = new Button("Show Transations");
                        
                        
                        
                        
                        btn1.setOnAction(new EventHandler<ActionEvent>()
                      {
                      @Override
                      public void handle(ActionEvent t) {
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
      "-fx-background-color: #89cff0  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        String ComboStyle=
      "-fx-text-fill: -fx-text-inner-White;"+
      "-fx-font:18 Arial;"+
      "-fx-background-color: #89cff0 ;";
                
                          try {
                              TransactionData();
                          } catch (FileNotFoundException ex) {
                              Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                          }
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
        Rectangle rec1 = new Rectangle (20,10,820,55);
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
        Color c = Color.web("#89cff0");
        rec1.setFill(c);
        rec1.setArcWidth(25);
        rec1.setArcHeight(25);
        
         //box.getChildren().addAll(btn1,btn2);
        vbox.getChildren().addAll(box);
        grid.getChildren().add(vbox);
        borderpane2.setTop(stackpane);
        borderpane2.setCenter(grid);
        //borderpane.setBottom(btn3);
         
                       // Manager manager = new Manager();
//                        Rectangle rec2 = new Rectangle (20,10,820,55);
                        GridPane grid4 = new GridPane();
                        Image image4 = null;
                          try {
                              image4 = new Image(new FileInputStream("3076404.png"));
                          } catch (FileNotFoundException ex) {
                              Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                          }
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
                        borderpane2.setLeft(vb3);
                        Button btn1 = new Button("Back");
                        btn1.setOnAction(new EventHandler<ActionEvent>()
                        {
                              @Override
                              public void handle(ActionEvent t) {
                                  mListView.getItems().clear();
                                  mListView2.getItems().clear();
                                  primaryStage.setScene(scene);
                                  primaryStage.show();
                              }
                          
                          
                          
                      });
//                        Button btn2 = new Button ("Currency Exchange");
//                        Button btn3 = new Button ("Transfer");

                        
                        
                       // btn1.setFont(font2);
                        btn1.setPrefSize(230,40);
                        btn1.setStyle(handle2_styles);
                        //btn2.setFont(font2);
//                        btn2.setPrefSize(230,40);
//                        btn2.setStyle(handle2_styles);
//                        btn3.setPrefSize(230,40);
//                        btn3.setStyle(handle2_styles);
                        
                        btn1.setFont(font2);
//                        btn2.setFont(font2);
//                        btn3.setFont(font2);


                        
                        
                        vb3.getChildren().add(im4);
                        vb3.getChildren().add(btn1);
//                        vb3.getChildren().add(btn2);
//                        vb3.getChildren().add(btn3);

                       
                        Text t1 = new Text(30,30,"    Transactions    ");
                        Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,40);
                        t1.setFont(font7);
                        Color c3 = Color.web("#F24162");
                        t1.setFill(c3);
                        hb.setSpacing(80);
                        
                        Button btn5 = new Button("Confirm Amount");
                        btn5.setStyle(handle2_styles);  
                        btn5.setFont(font2);
                        TextField tt=new TextField();
                        tt.setStyle(tf_style);
                        
                        
                        
                        grid4.add(t1,0,1);
        
                        mListView2.setStyle(tf_style);
                        grid4.add(mListView2, 0, 2);
//                        grid4.add(tt,0,2);
//                        grid4.add(btn5,0,3);
                        
                        hb.getChildren().addAll(vb3,grid4);
                        borderpane2.setCenter(hb);
                        //scroll.setContent(borderpane);

                        
        
       
        primaryStage.setScene(scene2);
        primaryStage.setTitle("Test");
        primaryStage.show();
                          
                          
                          
                          
                          
                          
                          
                          
                      }
                   
               }
                        );
                        
                        Button btn2 = new Button ("Back");
                        btn2.setOnAction(new EventHandler<ActionEvent>()
                        
                        {
                      @Override
                      public void handle(ActionEvent t) {
                          mListView.getItems().clear();
                          primaryStage.setScene(scene);
                          primaryStage.show();
 
                      }
                        
                        
                        
                        });
                      
//                        Button btn3 = new Button ("Transfer");

                        
                        
                        btn1.setFont(font2);
                        btn1.setPrefSize(230,40);
                        btn1.setStyle(handle2_styles);
                        btn2.setFont(font2);
                        btn2.setPrefSize(230,40);
                        btn2.setStyle(handle2_styles);
//                        btn3.setPrefSize(230,40);
//                        btn3.setStyle(handle2_styles);
                        
                        btn1.setFont(font2);
                        btn2.setFont(font2);
//                        btn3.setFont(font2);


                        
                        
                        vb3.getChildren().add(im4);
                        vb3.getChildren().add(btn1);
                        vb3.getChildren().add(btn2);
//                        vb3.getChildren().add(btn3);

                       
                        Text t1 = new Text(30,30,"      Your Data     ");
                        Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,40);
                        t1.setFont(font7);
                        Color c3 = Color.web("#F24162");
                        t1.setFill(c3);
                        hb.setSpacing(80);
                        
                        Button btn5 = new Button("Confirm Amount");
                        btn5.setStyle(handle2_styles);  
                        btn5.setFont(font2);
                        TextField tt=new TextField();
                        tt.setStyle(tf_style);
                        
                        
                        
                        grid4.add(t1,0,1);
                        mListView.setStyle(tf_style);
                        grid4.add(mListView, 0, 2);
//                        grid4.add(tt,0,2);
//                        grid4.add(btn5,0,3);
                        
                        hb.getChildren().addAll(vb3,grid4);
                        borderpane.setCenter(hb);
                        //scroll.setContent(borderpane);

                        
        
        Scene scene1 = new Scene(borderpane,780, 700);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Test");
        primaryStage.show();
                
                  
        

                 
                        
       }  
       });





       
       
       FileInputStream input3 = null;
     try {
       input3 = new FileInputStream("Delete.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image img3 = new Image(input3);
       ImageView view3 = new ImageView(img3);
       view3.setX(90);
       view3.setY(90);
       view3.setFitHeight(170);
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
                       
                          try {
                            Employee e3=new Employee();
                              e3.Erase(list, j);
                              System.out.println("deleteeeed");
                              primaryStage.hide();
                              Exit(0);
                          } catch (FileNotFoundException ex) {
                              Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                          }
 
                      }

             private void Exit(int i) {
                 
             }

                        });
       
       
       
       
       
       
        FileInputStream input4 = null;
     try {
       input4 = new FileInputStream("Sp.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image img4 = new Image(input4);
       ImageView view4 = new ImageView(img4);
       view4.setX(90);
       view4.setY(90);
       view4.setFitHeight(170);
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
                       
                          try {
                           ClientSupportForm m1=new ClientSupportForm(list,j);
                           m1.start(primaryStage);
                              
                          } catch (FileNotFoundException ex) {
                              Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                          }
 
                      }

            

                        });
       
       
       
       
        FileInputStream input5 = null;
     try {
       input5 = new FileInputStream("Ms.png");
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
                       
                          try {
                           ClientRecieveForm m1=new ClientRecieveForm(list,j);
                           m1.start(primaryStage);
                              
                          } catch (FileNotFoundException ex) {
                              Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                          }
 
                      }

            

                        });
       
       
//       Text t1=new Text(list.get(j).UpUsername);
//       t1.setFont(font2);
//       Text t2=new Text(list.get(j).Role);
//       t2.setFont(font2);
//       Text t3=new Text(list.get(j).ACType);
//       t3.setFont(font2);
//       Text t4=new Text(list.get(j).Gender);
//       t4.setFont(font2);
//       VBox v12= new VBox();
//       v12.getChildren().addAll(t1,t2,t3,t4);
       
       
       FileInputStream input6 = null;
     try {
       input6 = new FileInputStream("Exitt.png");
        } 
     catch (FileNotFoundException e){
        e.printStackTrace();}
       Image img6 = new Image(input6);
       ImageView view6 = new ImageView(img6);
       view6.setX(90);
       view6.setY(90);
       view6.setFitHeight(150);
       view6.setPreserveRatio(true);
       
       Button button6 = new Button();
       button6.setStyle(
               "-fx-border-color: transparent;" +
      "-fx-border-width: 0;" +
      "-fx-background-radius: 0;"+
      "-fx-background-color: transparent;"
       );
       button6.setLayoutX(0);
       button6.setLayoutY(0);
       button6.setGraphic(view6);
       
       
       
       
       

       
       
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
       
        VBox v1=new VBox();
        v1.getChildren().addAll(h1,h2);
        v1.setPadding(new Insets(350,20,200,50));
       
       //v12.setPadding(new Insets(215,200,100,65));
       
       
       
       
       
       
       
       
       p1.getChildren().add(v1);
     //  p1.getChildren().add(v12);
//       p1.getChildren().add(h2);
//       p1.getChildren().add(h3);
//       p1.getChildren().add(h4);
//       p1.getChildren().add(h5);
//       p1.getChildren().add(h6);

       

     
       
       
        
        primaryStage.setTitle("IBANKING");
        primaryStage.setScene(scene);
        primaryStage.show();
     
        
    
}
    
    
    
    public void TransactionData() throws FileNotFoundException
    {
        File file=new File(list.get(j).UpUsername+".txt");
        Scanner ko=new Scanner(file);
        while(ko.hasNext())
        {
            Label l1=new Label();
            l1.setText(ko.nextLine());
            //l1.setFont(font2);
            mListView2.getItems().add(l1);

        }
        
        
        
        
        
    }
    
    
    
     public void populatedData() throws IOException
     {
                Account new1=new Account();
                ArrayList<Account>L=new1.ReadfromFile();
                int k=0;
                for(int i=0;i<L.size();i++)
                {
                    if(list.get(j).UpUsername.equals(L.get(i).getUserName()))
                    {
                        k=i;
                        break;
                    }
                }
         Label l1=new Label();
         l1.setText("First Name: "+list.get(j).Fname);
         l1.setFont(font2);
         Label l2=new Label();
         l2.setText("Last Name: "+list.get(j).Lname);
         l2.setFont(font2);
         Label l3=new Label();
         l3.setText("UserName: "+list.get(j).UpconPassword);
         l3.setFont(font2);
         Label l4=new Label();
         l4.setText("Age: "+list.get(j).Age);
         l4.setFont(font2);
         Label l5=new Label();
         l5.setText("Phone: "+list.get(j).Phone);
         l5.setFont(font2);
         Label l6=new Label();
         l6.setText("Gender: "+list.get(j).Gender);
         l6.setFont(font2);
         Label l7=new Label();
         l7.setText("Role: "+list.get(j).Role);
         l7.setFont(font2);
         Label l8=new Label();
         l8.setText("Account Type: "+list.get(j).ACType);
         l8.setFont(font2);
         Label l9=new Label();
         l9.setText("AccountNumber: "+L.get(k).getAccountNumber());
         l9.setFont(font2);
         
         
         
        
         
         mListView.getItems().add(l1);
         mListView.getItems().add(l2);
         mListView.getItems().add(l3);
         mListView.getItems().add(l4);
         mListView.getItems().add(l5);
         mListView.getItems().add(l6);
         mListView.getItems().add(l7);
         mListView.getItems().add(l8);
         mListView.getItems().add(l9);
        
         

         
     }
    
    
    public static void main(String[] args) {
        launch(args);
    }

    
}
