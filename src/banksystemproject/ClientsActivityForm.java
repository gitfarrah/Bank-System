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
public class ClientsActivityForm extends Application {
   ListView mListView = new ListView(); 
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
        Font font2 = Font.font("Aharoni", FontWeight.BOLD, 20);
       Font font11 = Font.font("Aharoni", FontWeight.BOLD, 16);
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Image image5 =new Image(new FileInputStream("rating.png"));
        ImageView im5=new ImageView(image5);
        im5.setFitHeight(200);
        im5.setFitWidth(210);
        BorderPane borderpane = new BorderPane();
        Manager manager = new Manager();
        Rectangle rec2 = new Rectangle (20,10,810,55);
        GridPane grid4 = new GridPane();
        Color c1 = Color.web("#F2D027");
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
        vb3.getChildren().add(im5);
        vb3.setSpacing(25);
        hb.setSpacing(20);
        borderpane.setLeft(vb3);
        
        Button btn1 = new Button("Show All Data");
        Button btn2 = new Button ("Search Specific Client");
        btn1.setFont(font2);
        btn1.setPrefSize(230,40);
        btn1.setStyle(handle5_styles);
        btn2.setFont(font2);
        btn2.setPrefSize(230,40);
        btn2.setStyle(handle5_styles);
        Button btn5 = new Button("Back");
        btn5.setFont(font2);
        btn5.setStyle(handle5_styles);
        btn5.setPrefSize(120,40);
        btn1.setOnAction(new EventHandler<ActionEvent>()
        {
        public void handle (ActionEvent e)
            {
                primaryStage.hide();
                ShowAllDataForm showAll = new ShowAllDataForm();
              
            try {
                showAll.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ClientsActivityForm.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(ClientsActivityForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                primaryStage.show();
                
            }
        });
        
        borderpane.setBottom(btn5);
        vb3.getChildren().add(btn1);
        vb3.getChildren().add(btn2);
        vb3.getChildren().add(btn5);
        Text t1 = new Text(30,30,"Clients Activity");
        Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,40);
        t1.setFont(font7);
        Color c3 = Color.web("F23D5E");
        t1.setFill(c3);
        hb.setSpacing(80);
        grid4.add(t1,0,1);
        btn5.setOnAction(new EventHandler<ActionEvent>()
        {
        public void handle (ActionEvent e)
            {
              primaryStage.hide();
              ClientsMenuForm clientsForm = new ClientsMenuForm();
               
            try {
                clientsForm.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ClientsActivityForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                
              primaryStage.show();
                
            }
        });
        final VBox vbox5 = new VBox();

       
         clientsBest();
        //hb.getChildren().addAll(vb3,grid4);
        //borderpane.setCenter(hb);
        vbox5.setPadding(new Insets(0,20,40,20));
        vbox5.setSpacing(5);
        vbox5.setAlignment(Pos.TOP_CENTER);
        mListView.setMaxHeight(400);
        vbox5.getChildren().addAll(grid4,mListView);
        hb.getChildren().addAll(vb3,vbox5);
        borderpane.setCenter(hb);
        Scene scene7 = new Scene(new Group());
        primaryStage.setWidth(850);
        primaryStage.setHeight(700);
        Group group =((Group)scene7.getRoot());
        group.getChildren().addAll(borderpane);
        //group.setLayoutX(100);
        primaryStage.setScene(scene7);
        primaryStage.show();
        
        
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    public void clientsBest() throws FileNotFoundException
   {
        Manager manager = new Manager();
        ArrayList<Double> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list=manager.showStat();
        int x=0;
        for(int i=0;i<list.size();i++)
        {
            double total= list.get(i);
            String s = String.valueOf(total);
            list2.add(s);
            i++;
            double best = list.get(i);
            String b = String.valueOf(best);
            list2.add(b);
            i++;
            double tranCounter = list.get(i);
            String tran = String.valueOf(tranCounter);
            list2.add(tran);
            i++;
            double depCounter = list.get(i);
            String dep = String.valueOf(depCounter);
            list2.add(dep);
            i++;
            double withCounter = list.get(i);
            String with = String.valueOf(withCounter);
            list2.add(with);
            i++;
            double golden = list.get(i);
            String gold = String.valueOf(golden);
            list2.add(gold);
            i++;
            double maxTranCounter = list.get(i);
            String maxTran = String.valueOf(maxTranCounter);
            list2.add(maxTran);
            i++;
            double maxDepCounter = list.get(i);
            String maxDep = String.valueOf(maxDepCounter);
            list2.add(maxDep);
            i++;
            double maxWithdrawnum = list.get(i);
            String maxWith = String.valueOf(maxWithdrawnum);
            list2.add(maxWith);
            i++; 
        }
       
        
        
       for(int i=0;i<list2.size();i++)
       {
           Label l1=new Label();
           l1.setText("Total Balance: "+list2.get(i));
           l1.setFont(font11);
           mListView.getItems().add(l1);
           i++;
           
           Label l2=new Label();
           l2.setText("Clients with above 5000: "+list2.get(i));
           l2.setFont(font11);
           mListView.getItems().add(l2);
           i++;
           
           Label l3=new Label();
           l3.setText("Number Of Transactions: "+ list2.get(i));
           l3.setFont(font11);
           mListView.getItems().add(l3);
           i++;
           
           Label l4=new Label();
           l4.setText("Number Of Deposits: "+list2.get(i));
           l4.setFont(font11);
           mListView.getItems().add(l4);
           i++;
           
           Label l5=new Label();
           l5.setText("Number Of Withdrwas: "+list2.get(i));
           l5.setFont(font11);
           mListView.getItems().add(l5);
           i++;
           
           
           mListView.getItems().add("                  ----------------------------------------------------        ");
           
           Label l6=new Label();
           l6.setText("Our Golden Client Has Balance : "+list2.get(i));
           l6.setFont(font11);
           mListView.getItems().add(l6);
           i++;
           
           Label l7=new Label();
           l7.setText("Our Golden Client Made : "+list2.get(i)+ " Transactions");
           l7.setFont(font11);
           mListView.getItems().add(l7);
           i++;
           
           Label l8=new Label();
           l8.setText("Our Golden Client Made : "+list2.get(i)+ " Deposits");
           l8.setFont(font11);
           mListView.getItems().add(l8);
           i++;
           
           Label l9=new Label();
           l9.setText("Our Golden Client Made : "+list2.get(i)+ " Withdraws");
           l9.setFont(font11);
           mListView.getItems().add(l9);
           i++;
           
   
       }
       
        }    
        
    
}
