/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banksystemproject;
import javafx.scene.shape.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView;  
public class BankSystemProject{

    ArrayList<Person>list=new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
      Bank w=new Bank();
      Scanner inp=new Scanner(System.in);
      System.out.println("*****Welcome to our "+w.getName()+"*****");
      System.out.println("You are in "+w.getLocation());
      System.out.println("if you have an account press 1 to login ");
      System.out.println("if you want to creat an account press 2 to Signup ");
      boolean check1=false;
      Person k=new Person();
      Client client1=new Client();
      boolean check2=false;
      String Role;
      
      int counter=0;
      Employee emp=new Employee();
      Manager m1=new Manager();
      if(inp.nextInt()==2)
      {
         k.updisplay();
         check1=true;
      }
      else
      {
         check2=k.inDisplay();
      }
      if(check1||check2)
      {
                  
      }
}
    
    
    public String getmainmenu(String Username) throws FileNotFoundException
    {
        
         
          if(Username.startsWith("Cl"))
         { 
              return "Cl";
         }
          else if(Username.startsWith("Em"))
         {
             return "Em";
   
         }
          return "Ad";
        
        
        
        
        
        
        
    }
    
    

}
