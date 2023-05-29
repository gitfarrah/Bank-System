package banksystemproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import banksystemproject.Account;
import banksystemproject.Manager;

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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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
public class ShowAllDataForm extends Application {
    ListView mListView = new ListView();
    Font font11 = Font.font("Aharoni", FontWeight.BOLD, 16);
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
    BorderPane borderpane = new BorderPane();
    Manager manager = new Manager();
    Rectangle rec2 = new Rectangle (20,10,810,55);
    GridPane grid4 = new GridPane();
    Color c1 = Color.web("#39BF68");
    rec2.setFill(c1);
    rec2.setArcWidth(25);
    rec2.setArcHeight(25);
    borderpane.setTop(rec2);
    borderpane.setPadding(new Insets(20,20,20,20));
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
    Image image4 =new Image(new FileInputStream("personal.png"));
    ImageView im4=new ImageView(image4);
    im4.setFitHeight(200);
    im4.setFitWidth(210);
    vb3.getChildren().add(im4);
    vb3.setSpacing(20);
    hb.setSpacing(20);
    borderpane.setLeft(vb3);
    Button btn1 = new Button("Clients Activity");
    Button btn2 = new Button ("Search Specific Client");
    btn1.setFont(font2);
    btn1.setPrefSize(230,40);
    btn1.setStyle(handle2_styles);
    btn1.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle (ActionEvent e)
            {
                primaryStage.hide();
                ClientsActivityForm activity = new ClientsActivityForm();
                try {
                    activity.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ShowAllDataForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                primaryStage.show();
                 
            }
            }
            );
    btn2.setFont(font2);
    btn2.setPrefSize(230,40);
    btn2.setStyle(handle2_styles);
    Button btn5 = new Button("Back");
    btn5.setFont(font2);
    btn5.setStyle(handle2_styles);
    btn5.setPrefSize(120,40);
    btn5.setOnAction(new EventHandler<ActionEvent>()
        {
        public void handle (ActionEvent e)
            {
              primaryStage.hide();
              ClientsMenuForm clientsForm = new ClientsMenuForm();
               
            try {
                clientsForm.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ShowAllDataForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                
              primaryStage.show();
                
            }
        });
    btn2.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle (ActionEvent e)
            {
                primaryStage.hide();
                SearchClientForm searchClient = new SearchClientForm();
            try {
                searchClient.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ShowAllDataForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                primaryStage.show();
            }
            }
            );
    vb3.getChildren().add(btn1);
    vb3.getChildren().add(btn2);
    vb3.getChildren().add(btn5);
    Text t1 = new Text(30,30,"All Clients Data");
    Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,40);
    t1.setFont(font7);
    Color c3 = Color.web("#F24162");
    t1.setFill(c3);
    hb.setSpacing(80);
    grid4.add(t1,0,1);

    //grid4.add(btn5,0,2);
    final VBox vbox5 = new VBox();

    
        //grid4.add(t1,6,1);
        populatedData();
    
    //hb.getChildren().addAll(vb3,grid4);
    //borderpane.setCenter(hb);
    vbox5.setPadding(new Insets(20,20,20,20));
    vbox5.setSpacing(5);
    vbox5.setAlignment(Pos.TOP_CENTER);
    vbox5.getChildren().addAll(grid4,mListView);
    hb.getChildren().addAll(vb3,vbox5);
    borderpane.setCenter(hb);

    //borderpane.setBottom(btn5);
    


    Scene scene6 = new Scene(new Group());
    primaryStage.setWidth(850);
    primaryStage.setHeight(700);
    Group group =((Group)scene6.getRoot());
    group.getChildren().addAll(borderpane);
    //group.setLayoutX(100);
    primaryStage.setScene(scene6);
    primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void populatedData() throws FileNotFoundException
   {
        Manager manager = new Manager();
        ArrayList<Account> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list=manager.ShowAll();
        int listSize = list.size();
        int x=0;
        for(int i=0;i<list.size();i++)
        {
            int AccNo= list.get(i).AccountNumber;
            String s = String.valueOf(AccNo);
            list2.add(s);
            String us =list.get(i).UserName;
            list2.add(us);
            double balance = list.get(i).Balance;
            String b = String.valueOf(balance);
            list2.add(b); 
        }
       
     
       for(int i=0;i<list2.size();i++)
       {
           Label l1=new Label();
           l1.setText("Account Number: "+list2.get(i));
           l1.setFont(font11);
           mListView.getItems().add(l1);
           i++;
           
           Label l2=new Label();
           l2.setText("UserName: "+list2.get(i));
           l2.setFont(font11);
           mListView.getItems().add(l2);
           i++;
           
           Label l3=new Label();
           l3.setText("Balance: "+ list2.get(i));
           l3.setFont(font11);
           mListView.getItems().add(l3);
           //i++;
           mListView.getItems().add("");
            
           
       }
       
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
