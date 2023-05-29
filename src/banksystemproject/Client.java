/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystemproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;



public class Client  extends Person{
    int num;
    int num1;
    Account new1=new Account(); 
    Person p1=new Person();
    Scanner inp =new Scanner(System.in);
    int numberAccount1;
    

    public Client() {
    }

//    public Client(Person p2) {
//        p2.UpUsername=UpUsername;
//        p2.Age=Age;
//    }

    
    
    void display( ArrayList<Person>list,int j) throws FileNotFoundException, IOException
    {
        
        System.out.println("******WELCOME TO YOUR ACCOUNT******");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        File file12=new File("Help.txt");
        Scanner read12=new Scanner(file12);
        ArrayList<help_system>help12=new ArrayList<>();
        while(read12.hasNext())
         {
           help_system x=new help_system();
           x.hname=read12.nextLine();
           x.problem=read12.nextLine();
           x.answer=read12.nextLine();
           help12.add(x);
          } 
        int counter=0;
        for(int i=0;i<help12.size();i++)
        {
          if(list.get(j).UpUsername.equals(help12.get(i).hname))
          {
              if(help12.get(i).answer.equals("null"))
              {
                continue;  
              }    
              counter++;
          }           
  
        }
        
        
        
        
        new1.setUserName(list.get(j).UpUsername);
        new1.AccountNum();
        new1.checkBalance(list.get(j).UpUsername);
        System.out.println("your UserName is "+list.get(j).UpUsername);
        if(counter>0)
                {
                   
                     System.out.println("***YOU HAVE A MESSAGE FROM OUR TEAM*** "+" num of messages is "+counter);
                }
        
        do{
        System.out.println("If you want to show all the transactions you can press 1");
        System.out.println("If you want to show all DATA of your account press 2");
        System.out.println("If you want to Delete your account press 3");
        System.out.println("If you HAVE ANY PROBLEM press 4");
        System.out.println("To take a look on the messages you got press 5");
        System.out.println("If you want to Exit the Application Press 0");
        num1=inp.nextInt();
                
        switch(num1)
        {
            case 1:
            {
                System.out.println("+++If you want to make a DEPOSIT PRESS 1+++");
                System.out.println("---If you want to make a WITHDRAW PRESS 2---");
                System.out.println("===If you want to show YOUR BALANCE PRESS 3===");
                System.out.println("$#$#If you want to make an EXCHANGE PRESS 4$#$#");
                System.out.println("<--If you want to TRANSFER PRESS 5-->");
                num=inp.nextInt();
                switch(num)
                {
                    case 1:
                    {
                        double amount;
                        System.out.println("Enter the amount you want to DEPOSIT ");
                        amount=inp.nextDouble();
                        new1.Deposit(amount);
                        
                        break;
                        
                        
                    }
                    case 2:
                    {
                        double amount;
                        System.out.println("Enter the amount you want to WITHDRAW ");
                        amount=inp.nextDouble();
                        new1.Withdraw(amount);
                        break;
                    }
                    case 3:
                    {
                        
                        System.out.println("Your BALANCE is "+new1.getBalance());
                        Employee emp1=new Employee();
                        new1.Deposit(emp1.Promotion(list, j));
                        break;
                    }
                    case 4:
                    {
                       //new1.convert(amountbox, comboBox1_value, comboBox_value);
                       break;
                    }
                    case 5:
                   {
                       int Account_n1;                                                                                                          
                       double amount1;
                       System.out.println("Enter the amount you want to Transfer ");
                       amount1=inp.nextDouble();
                       System.out.println("Enter the Account Number");
                       Account_n1=inp.nextInt();
                        //new1.Transfer(amount1,  Account_n1,j);
                        break;
                     }
                    
                    
                    default:
            {
                System.out.println("Invalide Number");
            }
                    
                    
                    
                    
                    
                    
                }

               ArrayList<Account>newone=new ArrayList<>();
        newone=new1.ReadfromFile();
        boolean check1=false;
        for(int i=0;i<newone.size();i++)
        {
            if(list.get(j).UpUsername.equals(newone.get(i).getUserName()))
            {
               check1=true;
               break; 
            }    
        }
        
        if(check1==false)
        {
            new1.setlistwithap();
        }
        else
        {
            
            new1.setlistwithoutap(list.get(j).UpUsername);
            
        }
        
        
        break;
            }
            case 2:
            {
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
                
                System.out.println("           ###### Your Account ######");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("UserName is: "+list.get(j).UpUsername);
                System.out.println("First Name is: "+list.get(j).Fname);
                System.out.println("Last Name is: "+list.get(j).Lname);
                System.out.println("Age is: "+list.get(j).Age);
                System.out.println("Gender is: "+list.get(j).Gender);
                System.out.println("Phone is: "+list.get(j).Phone);
                System.out.println("You are a: "+list.get(j).Role);
                System.out.println("Account type is: "+list.get(j).ACType);
                System.out.println("Account Number is: "+L.get(k).getAccountNumber());
                System.out.println("To get all your Previous Transactions Enter 1");
                int num=inp.nextInt();
                if(num==1)
                {
                   File file=new File(list.get(j).UpUsername+".txt");
                   Scanner ko=new Scanner(file);
                   System.out.println("|------------------------------------|");
                   System.out.println("|------------------------------------|");
                   System.out.println("|--------- **Transactions**----------|");
                   System.out.println("|------------------------------------|");
                   System.out.println("|------------------------------------|");
                   while(ko.hasNext())
                   {
                       
                       System.out.println(ko.nextLine());
                       
                   }

                }

               break; 
            }
            case 3:
            {
              Employee emp=new Employee();
              emp.Erase(list,j);
              exit(0);
                
                
                
                
            break;
            }
            case 4:
            {
                FileWriter file =new FileWriter("Help.txt",true);
                PrintWriter ko1=new PrintWriter(file);
                help_system x=new help_system();
                
                Scanner inp=new Scanner(System.in);
                System.out.println("You can now Send a message to OUR Customer Support team");
                x.hname=list.get(j).UpUsername;
                x.problem=inp.nextLine();
                ko1.println(x.hname);
                ko1.println(x.problem);
                ko1.println(x.answer);
                ko1.close();
               
                break;
            }
            case 5:
            {
               File file1=new File("Help.txt");
               Scanner read=new Scanner(file1);
               ArrayList<help_system>help=new ArrayList<>();
         while(read.hasNext())
          {
             help_system x=new help_system();
             x.hname=read.nextLine();
             x.problem=read.nextLine();
             x.answer=read.nextLine();
             help.add(x);
          }
         int c=0;
         for(int i=0;i<help.size();i++)
                  {
                      if(list.get(j).UpUsername.equals(help.get(i).hname))
                      {
                          
                          System.out.println("the problem was:"+help.get(i).problem);
                          if(help.get(i).answer.equals("null"))
                          {
                           System.out.println("Working to fix your problem as soon as possible");
                           continue;
                          }
                          System.out.println("the Answer is: " +help.get(i).answer);
                          
                          File file2=new File("Help.txt");
                          Scanner read1=new Scanner(file2);
                          ArrayList<help_system>nee1=new ArrayList<>();
                          while(read1.hasNext())
                          {
                            help_system y=new help_system();
                            y.hname=read1.nextLine();
                            y.problem=read1.nextLine();
                            y.answer=read1.nextLine();
                            nee1.add(y);
                          }  
                          
                          nee1.remove(i);
                          File file3=new File("Help.txt");
                          PrintWriter ko4=new PrintWriter(file3);
                          for(int k=0;k<nee1.size();k++)
                          {
                              ko4.println(nee1.get(k).hname);
                              ko4.println(nee1.get(k).problem);
                              ko4.println(nee1.get(k).answer);
                          }
                          ko4.close();
                          
                          
                          
                          

                      }
                      
                  }
        
                break;
            }
            case 0:
            {
                exit(0);
                break;
            }
            
        }
        
        
        
                }while(num1!=0);
        
        
        
        
        
       
        
          
       

        
        
        
    }
    
    
    
}
