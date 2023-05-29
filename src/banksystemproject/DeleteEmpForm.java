package banksystemproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
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
import java.io.Serializable;

/**
 *
 * @author Farrah Hany
 */
public class DeleteEmpForm extends Application implements Serializable {
    Text text=new Text("");
    Text t1=new Text("");
    Text t2;
    Text text2=new Text("");
    Text text3=new Text("");
    Text text4=new Text("");
    boolean check=true;
     ArrayList<Person>list12=new ArrayList<>();
     int h=0;
     TextField userName = new TextField();
     Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,30);
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        
        
        String handle3_styles =
      "-fx-background-color: #F23838  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        String handle4_styles =
      "-fx-background-color: #77868C  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        
        
      
        final ContextMenu usernameValidator = new ContextMenu();
        String errorStyle = String.format("-fx-border-color: RED; -fx-border-width: 2; -fx-border-radius: 3.5;");
        String successStyle = String.format("-fx-border-color: Green; -fx-border-width: 2; -fx-border-radius: 3.5;");
        String normalStyle = String.format("-fx-border-color: Gray; -fx-border-width: 2; -fx-border-radius: 3.5;");
        
        
        Font font2 = Font.font("Aharoni", FontWeight.BOLD, 20); 
        BorderPane borderpane = new BorderPane();
        Rectangle rec2 = new Rectangle (20,10,870,55);
        HBox hb = new HBox();
        HBox hb4 = new HBox();
        hb4.setPadding(new Insets(20,10,20,20));
        hb4.setSpacing(10);
        GridPane grid5= new GridPane();
        borderpane.setTop(rec2);
        borderpane.setPadding(new Insets(20,20,20,5));
        //HBox hb = new HBox();
        Color c1 = Color.web("#F23838");
        rec2.setFill(c1);
        rec2.setArcWidth(25);
        rec2.setArcHeight(25);
        VBox vb3 = new VBox();
        hb.setPadding(new Insets(20,10,20,0));
        hb.setSpacing(100);
        vb3.setPadding(new Insets(20,10,20,10));
        grid5.setVgap(8);
        grid5.setAlignment(Pos.TOP_CENTER);
        grid5.setPadding(new Insets(20,20,20,20));
        vb3.setAlignment(Pos.TOP_LEFT);
        hb.setAlignment(Pos.TOP_CENTER);
        Image image3 =new Image(new FileInputStream("Images/delete1.png"));
        ImageView im3=new ImageView(image3);
        im3.setFitHeight(240);
        im3.setFitWidth(250);
        vb3.getChildren().add(im3);
        vb3.setSpacing(20);
        hb.setSpacing(20);
        borderpane.setLeft(vb3);
        Button btn1 = new Button("Show All Data");
        btn1.setOnAction(new EventHandler<ActionEvent>()
                     
        {

            public void handle (ActionEvent e)
            {
                primaryStage.hide();
                EmpAllDataForm showAll = new EmpAllDataForm();
                try {
                    showAll.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DeleteEmpForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                primaryStage.show();
            }
            
        }
                   
        
        );
        
        
        
        Button btn2 = new Button ("Search Employee");
        btn2.setOnAction(new EventHandler<ActionEvent>()
                     
        {

            public void handle (ActionEvent e)
            {
               primaryStage.hide();
                EmpSearchForm show = new EmpSearchForm();
                try {
                    show.start(primaryStage);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DeleteEmpForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                primaryStage.show();
            }
            
        }
                   
        
        );
        
        
        
        
        Button btn3=new Button("Delete");
        btn1.setFont(font2);
        btn1.setPrefSize(230,40);
        btn1.setStyle(handle4_styles);
        btn3.setFont(font2);
        btn3.setPrefSize(230,40);
        btn3.setStyle(handle4_styles);
        btn3.setDisable(check);
        
        btn3.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle (ActionEvent e)
            {
                
               
                ArrayList<String>userlist=new ArrayList<>();
                ArrayList<String>Passlist=new ArrayList<>();
                File file5=new File("EmployeeUsername.txt");
                Scanner inp1 = null;
                try {
                    inp1 = new Scanner(file5);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DeleteEmpForm.class.getName()).log(Level.SEVERE, null, ex);
                }
         while(inp1.hasNext())
         {
             userlist.add(inp1.next());
         }
         
         int f=-1;
         for(int i=0;i<userlist.size();i++)
         {
             if(userlist.get(i).equals(list12.get(h).UpUsername))
             {
                 f=i;
                 break;
             }
              
             
         }
        
         userlist.remove(f);
         //File file6=new File("ClientUsername.txt");
         PrintWriter ko6 = null;
                try {
                    ko6 = new PrintWriter(file5);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DeleteEmpForm.class.getName()).log(Level.SEVERE, null, ex);
                }
         for(int i=0;i<userlist.size();i++)
         {
             ko6.println(userlist.get(i));
         }
         ko6.close();
         
         File file7=new File("EmployeePassword.txt");
         Scanner inp7 = null;
                try {
                    inp7 = new Scanner(file7);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DeleteEmpForm.class.getName()).log(Level.SEVERE, null, ex);
                }
         while(inp7.hasNext())
         {
             Passlist.add(inp7.nextLine());
         }
//         for(int i=0;i<Passlist.size();i++)
//         {
//             System.out.println(Passlist.get(i));
//             
//         }
         
         
         Passlist.remove(f);
         
         File file8=new File("EmployeePassword.txt");
         PrintWriter ko8 = null;
                try {
                    ko8 = new PrintWriter(file8);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DeleteEmpForm.class.getName()).log(Level.SEVERE, null, ex);
                }
         for(int i=0;i<Passlist.size();i++)
         {
             ko8.println(Passlist.get(i));
         }
         ko8.close();
                
                
                
                list12.remove(h);
               File file=new File("DATA.txt");
                try {
                    PrintWriter ko1=new PrintWriter(file);
                    
                    for(int i=0;i<list12.size();i++)
               {
                   ko1.println(list12.get(i).Fname);
                   ko1.println(list12.get(i).Lname);
                   ko1.println(list12.get(i).Address);
                   ko1.println(list12.get(i).Phone);
                   ko1.println(list12.get(i).UpPassword);
                   ko1.println(list12.get(i).UpconPassword);
                   ko1.println(list12.get(i).ACType);
                   ko1.println(list12.get(i).Age);
                   ko1.println(list12.get(i).Gender);
                   ko1.println(list12.get(i).Role);
                   ko1.println(list12.get(i).UpUsername);
                  
               }    
                     ko1.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DeleteEmpForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                 text4.setText("Employee Deleted");
                 text4.setFont(font7);
                 text4.setFill(Color.RED);
                 grid5.add(text4,0,17);
                 btn3.setDisable(true);
                 userName.clear();
                 userName.setStyle(normalStyle);
                 t1.setText("");
                 text.setText("");
                 text2.setText("");
                 text3.setText("");
                
                
                
                
            }
        });

        btn2.setFont(font2);
        btn2.setPrefSize(230,40);
        btn2.setStyle(handle4_styles);
        
        vb3.getChildren().add(btn1);
        vb3.getChildren().add(btn2);
        vb3.getChildren().add(btn3);
        Text t7 = new Text(25,25,"Enter An Employee Name");
       
        t7.setFont(font7);
        Color c5 = Color.web("#7EAED9");
        t7.setFill(c5);
        hb.setSpacing(80);
        grid5.add(t7,0,9);
        
        userName.setPromptText("Enter Username");
        grid5.add(userName,0,11);
        Button btn7 = new Button("Search");
        btn7.setFont(font2);
        btn7.setStyle(handle4_styles);
        grid5.add(t1,0,10);
        btn7.setOnAction(new EventHandler<ActionEvent>()
    {
        public void handle (ActionEvent e)
        {
            Manager manager2 = new Manager();
            String name = userName.getText();
            
            
            try {
                if(manager2.searchforemp(name))
                {
                    userName.setStyle(successStyle);
                    //t2 =new Text("");
                    t1.setText("available username");
                    t1.setFont(font2);
                    t1.setFill(Color.GREEN);
                    check=false;
                    btn3.setDisable(check);
                   
                    int x=13;
                    h=0;
                    list12=manager2.getarraylist();
                    for(int i=0;i<list12.size();i++)
                    {
                        if(list12.get(i).UpUsername.equals(name))
                        {
                            h=i;
                            break;
                        }
                    }
                    for(int i=0;i<1;i++)
                    {
                        text.setText("This Employee is Available");
                        text.setFont(font2);
                       
                        x++;
                        text2.setText("Employee's username is " + list12.get(h).UpUsername);
                        text2.setFont(font2);
                        x++;
                        text3.setText("First Name: "+list12.get(h).Fname+" Last Name:  "+list12.get(h).Lname);
                        text3.setFont(font2);
                        x++;
                    }

                }
                else{
                    userName.setStyle(errorStyle);
                    check=true;
                    btn3.setDisable(check);
                  
                    t1.setText("try again");
                    t1.setFont(font2);
                    t1.setFill(Color.RED);
                    //userName.clear();
          //  userName.setStyle(normalStyle);
           // t1.setText("");
           // t2.setText("");
            text.setText("");
            text2.setText("");
            text3.setText("");
                   // grid5.add(t1,0,10);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DeleteEmpForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
    }
    );
         grid5.add(text,0,13);
         grid5.add(text2,0,14);
         grid5.add(text3,0,15);

         

         
    Button btn8 = new Button("Clear");
    btn8.setFont(font2);
    btn8.setStyle(handle4_styles);
    btn8.setOnAction(new EventHandler<ActionEvent>()
    {
        public void handle (ActionEvent e)
        {
            btn3.setDisable(true);
            userName.clear();
            userName.setStyle(normalStyle);
            t1.setText("");
           // t2.setText("");
            text.setText("");
            text2.setText("");
            text3.setText("");

        }
    }
    );
    hb4.getChildren().addAll(btn7,btn8);
    grid5.add(hb4,0,12);
    hb.getChildren().addAll(vb3,grid5);
   Button btn9 = new Button("Back");
   btn9.setFont(font2);
   btn9.setPrefSize(120,40);
   btn9.setStyle(handle3_styles);
   btn9.setOnAction(new EventHandler<ActionEvent>()
        {
        public void handle (ActionEvent e)
            {
              primaryStage.hide();
              EmployeeMenuForm clientsForm = new EmployeeMenuForm();
               
            try {
                clientsForm.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SearchClientForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                
              primaryStage.show();
                
            }
        });

    borderpane.setBottom(btn9);
    borderpane.setCenter(hb);
    Scene scene3 = new Scene(borderpane,900,730);
    primaryStage.setScene(scene3);
    primaryStage.show();
    }
                       
                        

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
