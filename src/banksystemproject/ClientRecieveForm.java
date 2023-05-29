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
import banksystemproject.help_system;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import javafx.scene.control.Label;
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
public class ClientRecieveForm extends Application {
    Text text;
    Text t1;
    Text t2;
    Text text2;
    Text text3;
    
    
    
       ArrayList<Person>list=new ArrayList<>();
      int j=0;
      public ClientRecieveForm(ArrayList<Person>list,int j) {
        this.list=list;
        this.j=j;        
      }  
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        
        
        String handle3_styles =
      "-fx-background-color: #D93644  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        String handle4_styles =
      "-fx-background-color: #F2B705  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        
       
        final ContextMenu usernameValidator = new ContextMenu();
        String errorStyle = String.format("-fx-border-color: RED; -fx-border-width: 2; -fx-border-radius: 3.5;");
        String successStyle = String.format("-fx-border-color: Green; -fx-border-width: 2; -fx-border-radius: 3.5;");
        String normalStyle = String.format("-fx-border-color: Gray; -fx-border-width: 2; -fx-border-radius: 3.5;");
        
        
        Font font2 = Font.font("Aharoni", FontWeight.BOLD, 20); 
        BorderPane borderpane = new BorderPane();
        Rectangle rec2 = new Rectangle (20,10,810,55);
        HBox hb = new HBox();
        VBox vb4 = new VBox();
        vb4.setPadding(new Insets(0,10,20,10));
        vb4.setSpacing(10);
        GridPane grid5= new GridPane();
        borderpane.setTop(rec2);
        borderpane.setPadding(new Insets(20,20,20,20));
        //HBox hb = new HBox();
        Color c1 = Color.web("#D93644");
        rec2.setFill(c1);
        rec2.setArcWidth(25);
        rec2.setArcHeight(25);
        VBox vb3 = new VBox();
        hb.setPadding(new Insets(20,10,20,0));
        hb.setSpacing(100);
        vb3.setPadding(new Insets(0,10,20,10));
        grid5.setVgap(8);
        grid5.setAlignment(Pos.TOP_CENTER);
        grid5.setPadding(new Insets(20,20,20,20));
        vb3.setAlignment(Pos.TOP_LEFT);
        hb.setAlignment(Pos.TOP_LEFT);
        Image image3 =new Image(new FileInputStream("text.png"));
        ImageView im3=new ImageView(image3);
        im3.setFitHeight(240);
        im3.setFitWidth(250);
        vb3.getChildren().add(im3);
        vb3.setSpacing(20);
        //hb.setSpacing(20);
        borderpane.setLeft(vb3);
        Button btn1 = new Button("Transaction");
        Button btn2 = new Button ("Send Messages");
        btn1.setFont(font2);
        btn1.setPrefSize(230,40);
        btn1.setStyle(handle4_styles);
        btn1.setOnAction(new EventHandler<ActionEvent>()
        {
        @Override
        public void handle (ActionEvent e)
            {
                TransactionMenu t1=new TransactionMenu(list,j);
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
                ClientSupportForm t2=new ClientSupportForm(list,j);
            try {
                t2.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ClientRecieveForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
        });
        vb3.getChildren().add(btn1);
        vb3.getChildren().add(btn2);
        Text t7 = new Text(25,25,"Your Messages");
        Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,30);
        t7.setFont(font7);
        Color c5 = Color.web("#D93232");
        t7.setFill(c5);
        hb.setSpacing(100);
        grid5.add(t7,0,10);
        File help = new File("Help.txt");
        Scanner input = new Scanner(help);
        ArrayList<help_system> arrList= new ArrayList<>();
        while(input.hasNext())
        {
            help_system halopa = new help_system();
            halopa.hname=input.next();
            halopa.problem=input.next();
            halopa.answer=input.next();
            arrList.add(halopa);
        }
//        help_system help2 ;
        int k3=0;
        for(int i=0;i<arrList.size();i++)
        {
            if(list.get(j).UpUsername.equals(arrList.get(i).hname))
            {
                k3=i;
                break;
            }
        }
        System.out.println(arrList.get(k3).answer);
        
         Color c6 = Color.web("#FFFFFF");
         StackPane stack = new StackPane();
         Rectangle rec1 = new Rectangle(0,0,370,200);
         rec1.setFill(c6);
         rec1.setArcWidth(25);
         rec1.setArcHeight(25);
         stack.getChildren().add(rec1);   
         Label label1 = new Label();
         label1.setText("The Probelm Was: "+arrList.get(k3).problem);
         label1.setFont(font2);
         Label label2 = new Label();
         label2.setText("The Answer is: "+arrList.get(k3).answer);
         label2.setFont(font2);
//         Label label1 = new Label();
//         label1.setText("    Problem was: how to make a deposit");
//         Label label2 = new Label();
//         label2.setText("    The answer is: click 5 then 3");
         HBox userHB = new HBox();
         Image image4 =new Image(new FileInputStream("businessman.png"));
         ImageView im4=new ImageView(image4);
         im4.setFitHeight(50);
         im4.setFitWidth(50);
         
         //userHB.setSpacing(5);
         //userHB.getChildren().addAll(im4);
         VBox vb = new VBox();
         vb.setPadding(new Insets(3,10,20,10));
         //vb.setAlignment(Pos.TOP_CENTER);
         vb.setSpacing(5);
         vb.getChildren().addAll(im4,label1,label2);
         
         stack.getChildren().add(vb);
         grid5.add(stack,0,15);
        
        
        
       hb.getChildren().addAll(vb3,grid5);
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
                Logger.getLogger(ClientRecieveForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                
             // primaryStage.show();
                
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

}
        

