package banksystemproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import banksystemproject.Person;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
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
public class TransferForm extends Application {
     public static void main(String[] args) {
        launch(args);
    }
      ArrayList<Person>list=new ArrayList<>();
      int j=0; 
      Label label=new Label();
      ImageView imageView = new ImageView(new Image("file:right3.png"));
      final ContextMenu ComboBoxValidator = new ContextMenu();
    public TransferForm(ArrayList<Person>list,int j) {
        
        this.list=list;
        this.j=j;
    }
    
    
     
     
     
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
      "-fx-background-color: #0197f6  ;"+
      "-fx-text-fill: #FFFFFF;" ;
        String ComboStyle=
      "-fx-text-fill: -fx-text-inner-White;"+
      "-fx-font:18 Arial;"+
      "-fx-background-color: #0197f6 ;";
                
        
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
        Color c = Color.web("#0197f6");
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
                        Image image4 =new Image(new FileInputStream("transfer.png"));
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
                        
                        
                        Button btn3 = new Button ("Currency Exchange");
                        btn3.setOnAction(new EventHandler<ActionEvent>() {
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

                        
                        
                       // btn1.setFont(font2);
                        btn1.setPrefSize(230,40);
                        btn1.setStyle(handle2_styles);
                        //btn2.setFont(font2);
                        btn2.setPrefSize(230,40);
                        btn2.setStyle(handle2_styles);
                        btn3.setPrefSize(230,40);
                        btn3.setStyle(handle2_styles);
                        
                        btn1.setFont(font2);
                        btn2.setFont(font2);
                        btn3.setFont(font2);
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

                        
                        
                        vb3.getChildren().add(im4);
                        vb3.getChildren().add(btn1);
                        vb3.getChildren().add(btn2);
                        vb3.getChildren().add(btn3);

                       
                        Text t1 = new Text(30,30,"Money Transfer");
                        Font font7=Font.font("Lucida Handwriting",FontWeight.BOLD,40);
                        t1.setFont(font7);
                        Color c3 = Color.web("#F24162");
                        t1.setFill(c3);
                        hb.setSpacing(80);
                        
                        TextField t3=new TextField();
                        t3.setStyle(tf_style);
                        Text Acctxt=new Text("Enter Account Number ");
                        Acctxt.setFont(font2);
                        
                        Acctxt.setStyle(tf_style);
                        Text amounttxt=new Text("Enter Amount ");
                        amounttxt.setFont(font2);
                        amounttxt.setStyle(tf_style);
                        TextField t4=new TextField();
                        t4.setStyle(tf_style);
                        
                        Button btn5 = new Button("Transfer");
                        btn5.setStyle(handle2_styles);  
                        btn5.setFont(font2);
                         btn5.setPrefSize(350, 2);
                        btn5.setOnAction(new EventHandler<ActionEvent>()
                        {
                            double amount=0;
                            int Acc=0;
                            String check=null;
                              @Override
                             public void handle(ActionEvent t) {
                                
                                Account n1=new Account();
                                 n1.setUserName(list.get(j).UpUsername);
                                 
                                try {
                                    n1.checkBalance(list.get(j).UpUsername);
                                } catch (IOException ex) {
                                    Logger.getLogger(TransferForm.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                
                                try {
                                    n1.setAccountNumber(get_accountnum());
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(TransferForm.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                
                                try{
                                String SAcc= t3.getText();
                                Acc=Integer.parseInt(SAcc);
                                String Samount= t4.getText();
                                amount=Double.parseDouble(Samount);
                                 check= n1.Transfer(amount, Acc, j);
                                 if(check=="true")
                                 {
                                    try { 
                                        n1.setlistwithoutap(list.get(j).UpUsername);
                                    } catch (IOException ex) {
                                        Logger.getLogger(TransferForm.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                           label.setText("""
                                                         Transfer Processing
                                                          $"""
                                          +amount); 
                             
                              
          
                                      label.setFont(font1);
                                      label.setPadding(new Insets(0,0,0,10));
                                     
                                     imageView.setFitHeight(50);
                                     imageView.setFitWidth(50);
                                     StackPane image=new StackPane();
                                     StackPane.setAlignment(imageView, Pos.CENTER);
                                     image.setPadding(new Insets(10,0,10,10));
                                     image.getChildren().add(imageView);
                                     image.getChildren().add(label);
                                     Group root = new Group();

                                     root.getChildren().add(btn5);
                                     root.getChildren().add(label);
                                     box.getChildren().addAll(image,label,root);
                                     grid4.add(box, 0, 2);
                                     grid4.add(btn5,0,8);
                                     
                                 }
                                if(check.equals("false1"))
                                 {
                                   
                                     ComboBoxValidator.getItems().clear();
                                    ComboBoxValidator.getItems().add(
                                    new MenuItem("Invalide Account Number"));
                                    ComboBoxValidator.show(t3, Side.RIGHT, 10, 0); 
                                 }
                                if(check.equals("false2"))
                                 {
                                   
                                     ComboBoxValidator.getItems().clear();
                                    ComboBoxValidator.getItems().add(
                                    new MenuItem("Cant transfer this amount"));
                                    ComboBoxValidator.show(t4, Side.RIGHT, 10, 0); 
                                 }
                                }
                            catch(NumberFormatException e1)
                            {

                                     ComboBoxValidator.getItems().clear();
                                    ComboBoxValidator.getItems().add(
                                    new MenuItem("Invalide Account Number"));
                                    ComboBoxValidator.show(t3, Side.RIGHT, 10, 0); 
                                      ComboBoxValidator.getItems().clear();
                                    ComboBoxValidator.getItems().add(
                                    new MenuItem("Cant transfer this amount"));
                                    ComboBoxValidator.show(t4, Side.RIGHT, 10, 0); 
        }                       catch (IOException ex) {
                                    Logger.getLogger(TransferForm.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                
                                  
                        
                             }
                        });
                        
   
                        grid4.add(t1,0,1);
                     
                        grid4.add(Acctxt,0,4);
                        grid4.add(t3,0,5);
                        grid4.add(amounttxt,0,6);
                        grid4.add(t4,0,7);

                        grid4.add(btn5,0,8);
                        
                         GridPane cash=new GridPane();
                        Image image2 =new Image(new FileInputStream("reset.png"));
                        ImageView im2=new ImageView(image2); 
                        im2.setFitHeight(60);
                        im2.setFitWidth(60);
                        cash.setAlignment(Pos.BOTTOM_CENTER);
                        cash.add(im2, 0, 0);
                        RotateTransition rotate = new RotateTransition();    
                        rotate.setAxis(Rotate.Z_AXIS);    
                        rotate.setByAngle(360);  
                        rotate.setCycleCount(1000);  
                        rotate.setDuration(Duration.millis(1500));  
                        //rotate.setAutoReverse(true);  
                        rotate.setNode(im2);     
                        rotate.play(); 
                        //cash.setPadding(new Insets(470,270,0,0));
                        //grid4.add(cash, 2, 13);
                        
                        hb.getChildren().addAll(vb3,grid4);
                        borderpane.setCenter(hb);   
                    HBox bottom=new HBox();
                    bottom.getChildren().add(btn9);
                    bottom.getChildren().add(cash);
                    bottom.setSpacing(600);
                    borderpane.setBottom(bottom);
        Scene scene1 = new Scene(borderpane,765, 615);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Test");
        primaryStage.show();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
   public int get_accountnum() throws FileNotFoundException     
    {
        int accn;
        File file=new File("BankData.txt");
        Scanner inp=new Scanner(file);
        ArrayList<Account>list2=new ArrayList<>();
        while(inp.hasNext())
        {
            Account x=new Account();
            x.AccountNumber=inp.nextInt();
            x.UserName=inp.next();
            x.Balance=inp.nextDouble();
            list2.add(x);
            
        }
        int k=0;
        for(int i=0;i<list2.size();i++)
        {
            if(list.get(j).UpUsername.equals(list2.get(i).UserName))
            {
                k=i;
                break;
            }
        }
        
        
        
        
        
        return list2.get(k).AccountNumber;
    }
   
}
