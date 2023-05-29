/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystemproject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class   Account {
    
    protected double Balance;
    protected int AccountNumber;
    protected String AccountDisc;
    protected String UserName;
    protected Employee n=new Employee();
    DecimalFormat f1=new DecimalFormat("##.##");
    Scanner inp=new Scanner(System.in); 
    protected ArrayList<Account> list1=new ArrayList<>();
    

    public String getUserName() {
        return UserName;
        
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
    
    
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public Account(){
      Balance=0;
    }
    public void checkBalance(String user1) throws IOException
    {
               
       
         ArrayList<Account>listy= ReadfromFile();   
         int k=-1;
         for(int i=0;i<listy.size();i++)
         {
             if(user1.equals(listy.get(i).UserName))
             {
                 k=i;
                 break;
             }
         }
         if(k!=-1)
         {
         setBalance(listy.get(k).Balance);
         System.out.println(getBalance());
         }
         else
         {
             Balance=0;
         }
 
             
     } 

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void AccountNum()
    {
       AccountNumber=n.Generate();
       
    }
    
     public void Deposit(double amount) throws IOException
    {
       File file=new File(UserName+".txt");
       Double num=Balance;
       Balance+=amount;
       FileWriter ko1=new FileWriter(file,true);
       PrintWriter ko3=new PrintWriter(ko1);
       ko3.println("The Balance was "+num+" and you deposited "+amount+" and your balance now is "+Balance);
       ko3.close();
       
    }
    public boolean Withdraw(double amount) throws IOException
    {
        
       if(amount<Balance)
       {
           File file=new File(UserName+".txt");
           Double num=Balance;
           Balance-=amount;
       FileWriter ko1=new FileWriter(file,true);
       PrintWriter ko3=new PrintWriter(ko1);
       ko3.println("The Balance was "+num+" and your  withdraw was "+amount+" and your balance now is "+Balance);
       ko3.close();
       return true;
       }
       
          return false;
       
        
    }
    public double getBalance() {
        return Balance;
    }
     public double convert(double amount,int combobox1,int combobox2) throws IOException 
    {
//     num=combobox1
//      num1=combobox2
//      System.out.println("what type of currency do you have");
//      System.out.println("For DOLLARS $ press 1");
//      System.out.println("For Euros € press 2");
//       System.out.println("For Sterling £ press 3");
//        System.out.println("For Egyptian pound press 4");
//        System.out.println("For canadian dollar c$ press 5");
//        int num=inp.nextInt(); 
//        System.out.println("Enter the amount that you want to Exchange ");
//        amount=inp.nextInt();
//        double old=amount;
        
        //System.out.println("what type of currency do you want to Exchange to");
        if(combobox1==1)
        {
//        System.out.println("For Euros € press 1");
//        System.out.println("For Sterling £ press 2");
//        System.out.println("For Egyptian pound press 3");
//        System.out.println("For canadian dollar c$ press 4");
//        int num1=inp.nextInt();
            
        switch(combobox2)
        {
            case 1:
            {
                amount*=1.0;
        break;
            }
            case 2:
            {
                amount*=0.94;//0.99
        break;
            }
            case 3:
            {
                
                amount*=0.82;//0.87
                
                break;
        
            }
            case 4:
            {
                double g=amount;
                amount*=24.50;//23                 
//                int added=inp.nextInt();
//                if(added==0)
//                {
//                   File file=new File(UserName+".txt");
//                   Double n=Balance;
//                   Deposit(amount);
//                   FileWriter ko1=new FileWriter(file,true);
//                   PrintWriter ko3=new PrintWriter(ko1);
//                   ko3.println("The Previos Transaction Was Done By Echanging "+g+" Dollars to "+(int)amount+"Egyptian pounds");
//                   ko3.close(); 
//                }
        break;
            }
             case 5:
            {
                amount*=1.37;
        break;
            }
            default:
            {
                //System.out.println("Invalide Number");
            }
            
            
        }
            //System.out.println("Exchange Done Succesfully");
            return amount;  
            
        }
        else if(combobox1==2)
        {
//        System.out.println("For DOLLARS $ press 1");
//        System.out.println("For Sterling £ press 2");
//        System.out.println("For Egyptian pound press 3");
//        System.out.println("For canadian dollar c$ press 4");
//        int num1=inp.nextInt();
        switch(combobox2)
        {
            case 1:
            {
                amount*=0.99;
                break;
        
            }
            case 2:
            {
                amount*=1;//1
        break;
            }
            case 3:
            {
                double g=amount;
                amount*=0.87;//0.87
//                System.out.println("if you want to add this amout to your balance press 0");
//                int added=inp.nextInt();
//                if(added==0)
//                {
//                    File file=new File(UserName+".txt");
//                    Deposit(amount);
//                   FileWriter ko1=new FileWriter(file,true);
//                   PrintWriter ko3=new PrintWriter(ko1);
//                   ko3.println("The Previos Transaction Was Done By Echanging "+g+" Euros to "+(int)amount+"Egyptian pounds");
//                   ko3.close(); 
//                }
        break;
            }
            case 4:
            {
                amount*=24; //24
        break;
            }
            case 5:
            {
                amount*=1.36; //24
        break;
            }
            default:
            {
                //System.out.println("Invalide Number");
            }
            
            
        }
           // System.out.println("Exchange Done Succesfully");
          return amount;  
            
        }
        
        else if(combobox1==3)
        {
//        System.out.println("For DOLLARS $ press 1");
//        System.out.println("For Euros € press 2");
//        System.out.println("For Egyptian pound press 3");
//        System.out.println("For canadian dollar c$ press 4");
//        int num1=inp.nextInt();
        switch(combobox2)
        {
            case 1:
            {
                amount*=1.15;
                
        break;
            }
            case 2:
            {
                amount*=1.15;
        break;
            }
            case 3:
            {
                double g=amount;
                amount*=1;//1
                
//                System.out.println("if you want to add this amout to your balance press 0");
//                int added=inp.nextInt();
//                if(added==0)
//                {
//                   File file=new File(UserName+".txt");
//                   Deposit(amount);
//                   FileWriter ko1=new FileWriter(file,true);
//                   PrintWriter ko3=new PrintWriter(ko1);
//                   ko3.println("The Previos Transaction Was Done By Exchanging "+g+" Sterling to "+(int)amount+"Egyptian pounds");
//                   ko3.close(); 
//                }
        break;
            }
            case 4:
            {
                amount*=22.59;//22.59
        break;
            }
            case 5:
            {
                amount*=1.56;//22.59
        break;
            }
            default:
            {
//                System.out.println("Invalide Number");
            }
            
            
        }
//            System.out.println("Exchange Done Succesfully");
           return amount;      
            
        }
       else if(combobox1==4)
        {
//        System.out.println("For DOLLARS $ press 1");
//        System.out.println("For Euros € press 2");
//        System.out.println("For Sterling £ press 3");
//        System.out.println("For canadian dollar c$ press 4");
//        int num1=inp.nextInt();
        switch(combobox2)
        {
            case 1:
            {
                amount*=0.051;
                
        break;
            }
            case 2:
            {
                amount*=0.051;
        break;
            }
            case 3:
            {
                amount*=0.044;
        break;
            }
            case 4:
            {
                amount*=1;
        break;
            }
              case 5:
            {
                amount*=0.069;
        break;
            }
            default:
            {
                //System.out.println("Invalide Number");
            }
            
            
        }
            //System.out.println("Exchange Done Succesfully");
           return amount;  
        }
        else
        {
//        System.out.println("For DOLLARS $ press 1");
//        System.out.println("For Euros € press 2");
//        System.out.println("For Sterling £ press 3");
//        System.out.println("For Egyptian pound press 4");
//        int num1=inp.nextInt();
        switch(combobox2)
        {
            case 1:
            {
                amount*=0.73;
                
        break;
            }
            case 2:
            {
                amount*=0.74;
        break;
            }
            case 3:
            {
                amount*=0.64;
        break;
            }
            case 4:
            {
                double g=amount;
                amount*=14.47;
//                System.out.println("if you want to add this amout to your balance press 0");
//                int added=inp.nextInt();
//                if(added==0)
//                {
//                   File file=new File(UserName+".txt");
//                   Deposit(amount); 
//                   FileWriter ko1=new FileWriter(file,true);
//                   PrintWriter ko3=new PrintWriter(ko1);
//                   ko3.println("Previos Transaction Was Done By Exchanging "+g+" Canadian Dollars to "+(int)amount+"Egyptian pounds");
//                   ko3.close(); 
//                }
        break;
            }
             case 5:
            {
                amount*=1;
        break;
            }
            
            default:
            {
//                System.out.println("Invalide Number");
            }
        {
//            System.out.println("Exchange Done Succesfully");
            return amount;      
            
        }
        
        }
        return amount;
    }
  } 
    
    public String Transfer(double amount,int ToAccNo,int j) throws IOException
    {
        ArrayList<Account> L5=ReadfromFile();
       int w=0;

       if(L5.get(j).Balance>amount)
       {
          boolean check5=false;
           for(int i=0;i<L5.size();i++)
           {
               if(ToAccNo==L5.get(i).AccountNumber)
               {
                   w=i;
                   check5=true;
                   break;
                   
               }   
   
           }
           if(check5==true)
           {
                   this.Balance=Balance-amount;
                   L5.get(w).Balance=L5.get(w).Balance+amount;
                   System.out.println( L5.get(w).Balance);
                   System.out.println( this.Balance);
                   
            
            
             
                       
            
              //System.out.println("Amount Transfered"); 
              
              FileWriter file=new FileWriter("BankData.txt");
              PrintWriter ko1=new PrintWriter(file);
              for(int i=0;i<L5.size();i++)
              {
                  ko1.println(L5.get(i).AccountNumber);
                  ko1.println(L5.get(i).UserName);
                  ko1.println(L5.get(i).Balance);
        
              }
              
              ko1.close();
              
              
              File file2=new File(UserName+".txt");
              FileWriter ko4=new FileWriter(file2,true);
              PrintWriter ko3=new PrintWriter(ko4);
              ko3.println("This amount "+amount+" was Transfered to Account Number: "+ToAccNo);
              ko3.close();
              ArrayList<Account>list=ReadfromFile();
              int g=0;
              for(int i=0;i<list.size();i++)
              {
                  if(ToAccNo==list.get(i).AccountNumber)
                  {
                      g=i;
                      break;       
                  }

              }
              String user=list.get(g).UserName;
              File file3=new File(user+".txt");
              FileWriter ko5=new FileWriter(file3,true);
              PrintWriter ko6=new PrintWriter(ko5);
              ko6.println("This amount "+amount+" was Transfered to your account by this Account Number: "+this.AccountNumber);
              ko6.close();
           }
                 

           else{
              return "false1";
           }
                   
         }
       else
       {
          return "false2";
       }

       return "true";
       
      
      
    }

    public int getAccountNumber() {
        return AccountNumber;
    }
    
    

    public  void setlistwithap() throws IOException
    {
        Account x=new Account();
        x.AccountNumber=AccountNumber;
        x.UserName=UserName;
        x.Balance=getBalance();
        FileWriter file=new FileWriter("BankData.txt",true);
        PrintWriter ko1=new PrintWriter(file);
        ko1.println(x.AccountNumber);
        ko1.println(x.UserName);
        ko1.println(x.Balance);
        ko1.close();
        list1.add(x);  
    }
    public  void setlistwithap(Account x) throws IOException
    {
       
        x.AccountNumber=AccountNumber;
        x.UserName=UserName;
        x.Balance=getBalance();
        FileWriter file=new FileWriter("BankData.txt",true);
        PrintWriter ko1=new PrintWriter(file);
        ko1.println(x.AccountNumber);
        ko1.println(x.UserName);
        ko1.println(x.Balance);
        ko1.close();
        list1.add(x);  
    }
    
    
    public  ArrayList<Account> ReadfromFile() throws IOException
    {
        ArrayList<Account> list1=new ArrayList<>();
        File file=new File("BankData.txt");
        Scanner in=new Scanner(file);
        while(in.hasNext())
        {
            Account x=new Account();
            x.AccountNumber=in.nextInt();
            x.UserName=in.next();
            x.Balance=in.nextDouble();
            list1.add(x);
        }
        return list1;
    }
     public  void setlistwithoutap(String UserName1) throws IOException
     {
         ArrayList<Account>myList=ReadfromFile();
         int k=0;
         for(int i=0;i<myList.size();i++)
         {
             if(UserName1.equals(myList.get(i).UserName))
             {
                 k=i;
                 break;
             } 
         }
         Account t=new Account();
         t.AccountNumber=myList.get(k).AccountNumber;
         t.UserName=myList.get(k).UserName;
         t.Balance=Balance;
         myList.set(k, t);
         FileWriter file=new FileWriter("BankData.txt");
         PrintWriter ko1=new PrintWriter(file);
         for(int i=0;i<myList.size();i++)
         {
             ko1.println(myList.get(i).AccountNumber);
             ko1.println(myList.get(i).UserName);
             ko1.println(myList.get(i).Balance);
         }
         ko1.close();
         
         
         
         
         
         
     }
    
    
    
}
