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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
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
public class EmpSupportForm extends Application {
    
    
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        String handle3_styles =
      "-fx-background-color: #8C5042  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        String handle4_styles =
      "-fx-background-color: #7EAED9  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        

       
        Font font2 = Font.font("Aharoni", FontWeight.BOLD, 20); 
        Font font1 = Font.font("Aharoni",15);
        BorderPane borderpane = new BorderPane();
        Rectangle rec2 = new Rectangle (20,10,1050,55);
        HBox hb = new HBox();
//        HBox userHB = new HBox();
//        userHB.setPadding(new Insets(20,0,20,10));
//        userHB.setSpacing(5);
        GridPane gridpane= new GridPane();
        borderpane.setTop(rec2);
        borderpane.setPadding(new Insets(20,0,20,20));
        //HBox hb = new HBox();
        Color c1 = Color.web("#8C5042");
        rec2.setFill(c1);
        rec2.setArcWidth(25);
        rec2.setArcHeight(25);
        VBox vb3 = new VBox();
        hb.setPadding(new Insets(20,0,20,10));
        hb.setSpacing(100);
        vb3.setPadding(new Insets(20,10,20,10));
        gridpane.setVgap(20);
        gridpane.setHgap(25);
        gridpane.setAlignment(Pos.TOP_CENTER);
        gridpane.setPadding(new Insets(20,20,20,20));
        vb3.setAlignment(Pos.TOP_LEFT);
        //hb.setAlignment(Pos.CENTER);
        Image image3 =new Image(new FileInputStream("technical-support.png"));
        ImageView im3=new ImageView(image3);
        im3.setFitHeight(180);
        im3.setFitWidth(180);
//        Image image4 =new Image(new FileInputStream("user.png"));
//        ImageView im4=new ImageView(image4);
//        im4.setFitHeight(50);
//        im4.setFitWidth(50);
        vb3.getChildren().add(im3);
        vb3.setSpacing(50);
        Button submit = new Button("Submit");
        submit.setFont(font2);
        submit.setPrefSize(170,50);
        submit.setStyle(handle3_styles);
        vb3.getChildren().add(submit);
        hb.setSpacing(40);
        borderpane.setLeft(vb3);
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
        ArrayList<String> arr = new ArrayList<>();
        TextField[] textArr = new TextField[arrList.size()];
        Label[] labelArr=new Label[arrList.size()];
        
        Color c2 = Color.web("#FFFFFF");
        int j=0;
        int k=0;
        for(int i=0;i<arrList.size();i++)
        {
          labelArr[i] = new Label();
          textArr[i]= new TextField();
         if(arrList.get(i).answer.equals("null"))   
         {
             StackPane stack = new StackPane();
         Rectangle rec1 = new Rectangle(20,0,250,150);
         rec1.setFill(c2);
         rec1.setArcWidth(25);
         rec1.setArcHeight(25);
         stack.getChildren().add(rec1);   
         labelArr[i].setText(arrList.get(i).hname);
         labelArr[i].setFont(font2);
         Label label2 = new Label();
         label2.setText(arrList.get(i).problem);
         label2.setFont(font1);
         HBox userHB = new HBox();
         Image image4 =new Image(new FileInputStream("user.png"));
         ImageView im4=new ImageView(image4);
         im4.setFitHeight(50);
         im4.setFitWidth(50);
         
         textArr[i].setPromptText("Enter your message");
         //userHB.setPadding(new Insets(20,0,20,10));
         userHB.setSpacing(5);
         userHB.getChildren().addAll(im4,labelArr[i]);
         VBox vb = new VBox();
         vb.setSpacing(25);
         vb.getChildren().addAll(userHB,label2,textArr[i]);
         stack.getChildren().add(vb);
         
         if(k%3==0)
         {
             k=0;
             j++;
             gridpane.add(stack,k,j);  
         }
       
         else
         {
             gridpane.add(stack, k, j);
         }
          k++;
         }
         else
         {
            labelArr[i].setText(arrList.get(i).hname);
            textArr[i].setText(arrList.get(i).answer);
             
         }
         
           
        }
        hb.getChildren().add(gridpane);
        submit.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent t) {
                
               for(int i=0;i<textArr.length;i++)
               {
                  if(textArr[i].getText().isEmpty())
                  {
                      textArr[i].setText("null");
                  }
                
                   
               }           
               
               for(int i=0;i<textArr.length;i++)
               {
                  if(!textArr[i].getText().equals("null"))
                  {
                     for(int j=0;j<arrList.size();j++)
                     {
                         if(arrList.get(j).hname.equals(labelArr[i].getText()))
                         {
                             arrList.get(j).answer=textArr[i].getText();
                             break;
                         }
                         
                     }
                  }
                
            }
               PrintWriter ko1 = null;
             File help1 = new File("Help.txt");
                try {
                     ko1=new PrintWriter(help1);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(EmpSupportForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
               for(int i=0;i<arrList.size();i++)
               {
                   ko1.println(arrList.get(i).hname);
                   ko1.println(arrList.get(i).problem);
                   ko1.println(arrList.get(i).answer);
                   
               }
               ko1.close();
               
               Employee_Form f1=new Employee_Form();
                try {
                    f1.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(EmpSupportForm.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            
            
            
        }
        
        });
        
        

        
        
        
    
    
    
    Button btn4 = new Button("Back");
    btn4.setFont(font2);
    btn4.setPrefSize(120,40);
    btn4.setStyle(handle3_styles);
    btn4.setOnAction(new EventHandler<ActionEvent>()
            {
            @Override
            public void handle(ActionEvent t) {
                Employee_Form x=new Employee_Form();
                try {
                    x.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(EmpSupportForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
                
                
            }
    
    
    );
    
    
    
    borderpane.setBottom(btn4);
    borderpane.setCenter(hb);
    Scene scene3 = new Scene(borderpane,1090,700);
    primaryStage.setScene(scene3);
    primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
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
