/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystemproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Employee extends Person{
    
     static int counter=0;
    Employee()
    {
        
    }
    public int Generate()
    {
        ArrayList<Integer>list=new ArrayList<>();
        int AcNum=(int)(10000+Math.random()*89999);
        boolean check=true;
        do{
        check=true;
        if(list.contains(AcNum))
        {
            AcNum=(int)(10000+Math.random()*89999);
            check=false;
        }
        }while(check==false);
        list.add(AcNum);
        return AcNum;
  
    }
     public double Promotion (ArrayList<Person>list,int j) throws FileNotFoundException, IOException
     {
        ArrayList<Account>list1=new ArrayList<>();
        File file2=new File("BankData.txt");
        Scanner in=new Scanner(file2);
        double prom=0;
        
        while(in.hasNext())
        {
           Account x=new Account();
           x.setAccountNumber(in.nextInt());
           x.setUserName(in.next());
           x.setBalance(in.nextDouble());
           list1.add(x); 
        }
        int d=0;
       for(int i=0;i<list1.size();i++)
       {
           if(list.get(i).UpUsername.equals(list1.get(i).getUserName()))
           {
              d=i;
              break;
               
           }

       }
       if(list1.get(d).Balance>10000&&counter==0)
       {
           
           System.out.println("Congratulations you have got 5% in ");
           
                double amount=list1.get(d).Balance;
                
                prom+= amount*0.02;
                counter++;
 
       }
       return prom;
     }
    
    public void Erase(ArrayList<Person>list,int j) throws FileNotFoundException
    {
        
        File file=new File(list.get(j).UpUsername+".txt");
        
        if(file.exists())
        {
            file.delete();    
        }
        ArrayList<Account>list1=new ArrayList<>();
        File file2=new File("BankData.txt");
        Scanner in=new Scanner(file2);
        
        while(in.hasNext())
        {
           Account x=new Account();
           x.setAccountNumber(in.nextInt());
           x.setUserName(in.next());
           x.setBalance(in.nextDouble());
           list1.add(x); 
        }
        int k=0;
        for(int i=0;i<list1.size();i++)
        {
            
            if(list1.get(i).getUserName().equals(list.get(j).UpUsername))
            {
              k=i;
              break;
            } 
        }
        list1.remove(k);
        File file3=new File("BankData.txt");
        PrintWriter ko1=new PrintWriter(file3);
        for(int i=0;i<list1.size();i++)
        {
            ko1.println(list1.get(i).getAccountNumber());
            ko1.println(list1.get(i).getUserName());
            ko1.println(list1.get(i).getBalance());
 
        }
        ko1.close();
        
        ArrayList<String>userlist=new ArrayList<>();
        ArrayList<String>Passlist=new ArrayList<>();
        
         File file5=new File("ClientUsername.txt");
         Scanner inp1=new Scanner(file5);
         while(inp1.hasNext())
         {
             userlist.add(inp1.next());
         }
         
         int f=-1;
         for(int i=0;i<userlist.size();i++)
         {
             if(userlist.get(i).equals(list.get(j).UpUsername))
             {
                 f=i;
                 break;
             }
              
             
         }
        
         userlist.remove(f);
         //File file6=new File("ClientUsername.txt");
         PrintWriter ko6=new PrintWriter(file5);
         for(int i=0;i<userlist.size();i++)
         {
             ko6.println(userlist.get(i));
         }
         ko6.close();
         
         File file7=new File("ClientPassword.txt");
         Scanner inp7=new Scanner(file7);
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
         
         File file8=new File("ClientPassword.txt");
         PrintWriter ko8=new PrintWriter(file8);
         for(int i=0;i<Passlist.size();i++)
         {
             ko8.println(Passlist.get(i));
         }
         ko8.close();
         
         
         
         
         
         
        
        
        
        list.remove(j);
        File file4=new File("DATA.txt");
        PrintWriter ko2=new PrintWriter(file4);
        for(int i=0;i<list.size();i++)
        {
             ko2.println(list.get(i).Fname);
        ko2.println(list.get(i).Lname);
        ko2.println(list.get(i).Address);
        ko2.println(list.get(i).Phone);
        ko2.println(list.get(i).UpPassword);
        ko2.println(list.get(i).UpconPassword);
        ko2.println(list.get(i).ACType);
        ko2.println(list.get(i).Age);
        ko2.println(list.get(i).Gender);
        ko2.println(list.get(i).Role);
        ko2.println(list.get(i).UpUsername);
        }
        
        ko2.close();
        
        
       
         
         
        
        
        
       
        
        
        
        
    }
        
        
        
        
        
//        File file=new File(list.get(j).UpUsername+".txt");
//        
//        if(file.exists())
//        {
//            file.delete();    
//        }
//        ArrayList<Account>list1=new ArrayList<>();
//        File file2=new File("BankData.txt");
//        Scanner in=new Scanner(file2);
//        
//        while(in.hasNext())
//        {
//           Account x=new Account();
//           x.setAccountNumber(in.nextInt());
//           x.setUserName(in.next());
//           x.setBalance(in.nextDouble());
//           list1.add(x); 
//        }
//        int k=0;
//        for(int i=0;i<list1.size();i++)
//        {
//            if(list1.get(i).getUserName().equals(list.get(j)))
//            {
//              k=i;
//              break;
//            }
//            
//        }
//        list1.remove(k);
//        File file3=new File("BankData.txt");
//        PrintWriter ko1=new PrintWriter(file3);
//        for(int i=0;i<list1.size();i++)
//        {
//            ko1.println(list1.get(i).getAccountNumber());
//            ko1.println(list1.get(i).getUserName());
//            ko1.println(list1.get(i).getBalance());
// 
//        }
//        ko1.close();
       
        
        
        
        
   // }
       public void display(ArrayList<Person> list,int j) throws FileNotFoundException
       {
           System.out.println("to display all the messages you got press 1");
           int f;
           Scanner inp=new Scanner(System.in);
           f=inp.nextInt();
           int counter=0;
           ArrayList<help_system> list1=new ArrayList<>();
           if(f==1)
           {
               File file =new File("Help.txt");
               Scanner ko1=new Scanner(file);
               while(ko1.hasNext())
               {
                   help_system x=new help_system();
                   x.hname=ko1.nextLine();
                   x.problem=ko1.nextLine();
                   ko1.nextLine();
                   list1.add(x);
                  
               }
              for(int i=0;i<list1.size();i++)
              {
                  System.out.println("Username is: "+list1.get(i).hname);
                  System.out.println("the problem is:"+list1.get(i).problem);
                  counter++;
                  System.out.println("The problem number is:"+counter);
              }
               
              int num1=-1;
              String answer1;
             
              int k=0;
              Scanner in=new Scanner(System.in);
              while(num1!=0)
              {
                  System.out.println("To exit press 0");
                  System.out.println("choose the number of the problem you want to reply to");
                  num1=inp.nextInt();
        
                  if(num1==0)
                  {
                      break;
                  }
                  System.out.println("Username is: "+list1.get(num1-1).hname);
                  System.out.println("the problem is:"+list1.get(num1-1).problem);
                  System.out.print("the Answer is: ");
                  answer1=in.nextLine();
                  list1.get(num1-1).answer=answer1; 
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
                  for(int i=0;i<help.size();i++)
                  {
                      if(list1.get(num1-1).hname.equals(help.get(i).hname))
                      {
                          help.get(i).answer=answer1;
                          break;
                      }
                      
                  }
                  File file2=new File("Help.txt");
                  PrintWriter ko2=new PrintWriter(file);
                  for(int i=0;i<help.size();i++)
                  {
                      ko2.println(help.get(i).hname);
                      ko2.println(help.get(i).problem);
                      ko2.println(help.get(i).answer);
                  }
                  ko2.close();
                  
                  
              }
              
              
               

           }
           
           
           
           
           
       }
}
