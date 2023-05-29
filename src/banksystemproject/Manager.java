/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystemproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Manager {

    public Manager() {
    }

    public void display() throws FileNotFoundException
    {
        while(1<2)
        {
         System.out.println("To Access any of the Client's Info Press 1");
        System.out.println("To Access any of the Employees Info Press 2");
        System.out.println("To Exit press 0");
        Scanner inp=new Scanner(System.in);
        
        int num=inp.nextInt();
        if(num==1)
        {
            
            clientCount();
            System.out.println("To show all the Client's Bank Data press 1");
            System.out.println("To Search for getting a specific data of a Client press 2");
            num=inp.nextInt();
            if(num==1)
            {
                 ShowAll();
            }
            else
            {
                System.out.println("Enter the name you are searching for");
                Scanner in=new Scanner(System.in);
                showspc(in.next());
            }
           
           
            
        }
        else if(num==0)
        {
            System.exit(0);
            
        }
        else
        {
            System.out.println("invalide number"); 
            
        }   
        }
        
  
    }
    public void clientCount() throws FileNotFoundException
    {
       // ArrayList<Person>cnum=new ArrayList<>();
        File file=new File("DATA.txt");
        int counter1=0;
        Scanner in=new Scanner(file);
        while(in.hasNext())
        {
            Person p1=new Person();
            p1.Fname=in.next();
            p1.Lname=in.next();
            p1.Address=in.next();
            p1.Phone=in.next();
            p1.UpPassword=in.next();
            p1.UpconPassword=in.next();
            p1.ACType=in.next();
            p1.Age=in.nextInt();
            p1.Gender=in.next();
            p1.Role=in.next();
            p1.UpUsername=in.next();
            counter1++;
    
        }
        //ArrayList<Account> list1=new ArrayList<>();
        File file1=new File("BankData.txt");
        Scanner in1=new Scanner(file1);
        int counter2=0;
        while(in1.hasNext())
        {
            Account x=new Account();
            x.AccountNumber=in1.nextInt();
            x.UserName=in1.next();
            x.Balance=in1.nextDouble();
            counter2++;
           
        }
        
        System.out.println("The number of the Clients in the Bank are: "+counter1);
        System.out.println("The number of the Active Clients in the Bank are: "+counter2);

    }
    public ArrayList<Account>  ShowAll() throws FileNotFoundException
    {
        
        ArrayList<Account> list1=new ArrayList<>();
        File file=new File("BankData.txt");
        Scanner in=new Scanner(file);
        double total=0;
        int counter=0;
        int tranCounter=0;
        int depositnum=0;
        int withdrawnum=0;
        while(in.hasNext())
        {
            Account x=new Account();
            x.AccountNumber=in.nextInt();
            x.UserName=in.next();
            x.Balance=in.nextDouble();
            list1.add(x);
        }
//        for(int i=0;i<list1.size();i++)
//        {
////            System.out.println("Account number: "+list1.get(i).AccountNumber);
////            System.out.println("UserName: "+list1.get(i).UserName);
////            System.out.println("Balance: "+list1.get(i).Balance);
////            total+=list1.get(i).Balance;
//            if(list1.get(i).Balance>5000)
//            {
//                counter++;
//            }
//            File file1=new File(list1.get(i).UserName+".txt");
//            Scanner in1=new Scanner(file1);
//            while(in1.hasNext())
//            {
//                String s=in1.nextLine();
//                tranCounter++;
//                if(s.startsWith("Previos"))
//                {
//                    tranCounter--;
//                }
//                if(s.contains("deposited"))
//                {
//                    depositnum++;
//                }
//                if(s.contains("withdraw"))
//                {
//                    withdrawnum++;
//                }
//                
//            }
//        }
   
//        System.out.println("You can get some Statistics by pressing 1");
//        Scanner inp=new Scanner(System.in);
//        int x=inp.nextInt();
//        if(x==1)
//        {
//            System.out.println("The Total Balances in the Bank are: "+total);
//            System.out.println("Number of Clients having Balance more than 5000:"+counter );
//            System.out.println("Number of Transactions done are: "+tranCounter);
//            System.out.println("Number of deposits are: "+depositnum);
//            System.out.println("Number of withdraws are: "+withdrawnum);
//        }
        return list1;
    }
    
    
     public boolean showspc(String name) throws FileNotFoundException
    {
        ArrayList<Account> list1=new ArrayList<>();
        File file=new File("BankData.txt");
        Scanner in=new Scanner(file);
        
        boolean check=false;
        while(in.hasNext())
        {
            Account x=new Account();
            x.AccountNumber=in.nextInt();
            x.UserName=in.next();
            x.Balance=in.nextDouble();
            list1.add(x);
        }
        int x=0;
        
        for(int i=0;i<list1.size();i++)
        {
            if(list1.get(i).UserName.equals(name))
            {
//              System.out.println("Account number: "+list1.get(i).AccountNumber);
//              System.out.println("UserName: "+list1.get(i).UserName);
//              System.out.println("Balance: "+list1.get(i).Balance);
                x=i;
              check=true;
              break;
            }  
        }
        return check;
        
    }
     public ArrayList<Integer> dataClient(String name) throws FileNotFoundException
     {
        double total=0;
        int counter=0;
        int tranCounter=0;
        int depositnum=0;
        int withdrawnum=0;
         
            File file1=new File(name+".txt");
            Scanner in1=new Scanner(file1);
            while(in1.hasNext())
            {
                String s=in1.nextLine();
                tranCounter++;
                if(s.startsWith("Previos"))
                {
                    tranCounter--;
                }
                if(s.contains("deposited"))
                {
                    depositnum++;
                }
                if(s.contains("withdraw"))
                {
                    withdrawnum++;
                }
            }
            
//       
//            System.out.println("This client is an Active Client");
//            System.out.println("This client made "+tranCounter+" transactions");
//            System.out.println("From these "+tranCounter+" transactions "+depositnum+" deposits and "+ withdrawnum+" withdraws");
//            System.out.println("To Show all the transactions done by this Client press 1");
//            Scanner inp=new Scanner(System.in);
//            int num=inp.nextInt();
            
            ArrayList<Integer> arrList = new ArrayList();
            arrList.add(tranCounter);
            arrList.add(depositnum);
            arrList.add(withdrawnum);
//            if(num==1)
//            {
//            File file2=new File(name+".txt");
//            Scanner in2=new Scanner(file2);
//            while(in2.hasNext())
//            {
//                System.out.println(in2.nextLine());
//            }  
//            }     
        
//        else
//        {
//           System.out.println("This Client did not do any trasactions yet");    
//        }
            return arrList;
    
     }
     public ArrayList<Double> showStat() throws FileNotFoundException
     {
        ArrayList<Account> list1=new ArrayList<>();
        File file=new File("BankData.txt");
        Scanner in=new Scanner(file);
        double total=0;
        double counter=0;
        double tranCounter=0;
        double depositnum=0;
        double withdrawnum=0;
        double maxTranCounter=0;
        double maxDepositnum=0;
        double maxWithdrawnum=0;
        double maxBalance=0;
        int k=0;
        while(in.hasNext())
        {
            Account x=new Account();
            x.AccountNumber=in.nextInt();
            x.UserName=in.next();
            x.Balance=in.nextDouble();
            list1.add(x);
        }
        for(int i=0;i<list1.size();i++)
        {
//            System.out.println("Account number: "+list1.get(i).AccountNumber);
//            System.out.println("UserName: "+list1.get(i).UserName);
//            System.out.println("Balance: "+list1.get(i).Balance);
            total+=list1.get(i).Balance;
            if(list1.get(i).Balance>5000)
            {
                counter++;
                if(list1.get(i).Balance > maxBalance)
                {
                    maxBalance = list1.get(i).Balance;
                    k=i;
                    
                }
            }
            File file1=new File(list1.get(i).UserName+".txt");
            Scanner in1=new Scanner(file1);
            while(in1.hasNext())
            {
                String s=in1.nextLine();
                tranCounter++;
                if(s.startsWith("Previos"))
                {
                    tranCounter--;
                }
                if(s.contains("deposited"))
                {
                    depositnum++;
                }
                if(s.contains("withdraw"))
                {
                    withdrawnum++;
                }
                
            }
        }
        
        File file1=new File(list1.get(k).UserName+".txt");
            Scanner in1=new Scanner(file1);
            while(in1.hasNext())
            {
                String s=in1.nextLine();
                maxTranCounter++;
                if(s.startsWith("Previos"))
                {
                    maxTranCounter--;
                }
                if(s.contains("deposited"))
                {
                    maxDepositnum++;
                }
                if(s.contains("withdraw"))
                {
                    maxWithdrawnum++;
                }
                
            }
        
   
        //System.out.println("You can get some Statistics by pressing 1");
        //Scanner inp=new Scanner(System.in);
        //int x=inp.nextInt();
//        if(x==1)
//        {
//            System.out.println("The Total Balances in the Bank are: "+total);
//            System.out.println("Number of Clients having Balance more than 5000:"+counter );
//            System.out.println("Number of Transactions done are: "+tranCounter);
//            System.out.println("Number of deposits are: "+depositnum);
//            System.out.println("Number of withdraws are: "+withdrawnum);
//        }
        ArrayList<Double> arrList = new ArrayList<>();
        arrList.add(total);
        arrList.add(counter);
        arrList.add(tranCounter);
        arrList.add(depositnum);
        arrList.add(withdrawnum);
        arrList.add(list1.get(k).Balance);
        arrList.add(maxTranCounter);
        arrList.add(maxDepositnum);
        arrList.add(maxWithdrawnum);
        
        return arrList;
         
     }
     public boolean searchforemp(String name) throws FileNotFoundException
     {
        ArrayList<Person> list1=new ArrayList<>();
        File file=new File("DATA.txt");
        Scanner in=new Scanner(file);
        
        boolean check=false;
        while(in.hasNext())
        {
            Person x=new Person();
            x.Fname=in.next();
            x.Lname=in.next();
            x.Address=in.next();
            x.Phone=in.next();
            x.UpPassword=in.next();
            x.UpconPassword=in.next();
            x.ACType=in.next();
            x.Age=in.nextInt();
            x.Gender=in.next();
            x.Role=in.next();
            x.UpUsername=in.next();
            if(x.Role.equals("Employee"))
            {
              list1.add(x);  
            }
            
        }
        int x=0;
        
        for(int i=0;i<list1.size();i++)
        {
            if(list1.get(i).UpUsername.equals(name))
            {
                x=i;
              check=true;
              break;
            }  
        }
        return check;
         
         
         
         
     }
     public ArrayList<Person>getarraylist() throws FileNotFoundException
     {
         ArrayList<Person> list1=new ArrayList<>();
        File file=new File("DATA.txt");
        Scanner in=new Scanner(file);
        
        boolean check=false;
        while(in.hasNext())
        {
             Person x=new Person();
            x.Fname=in.next();
            x.Lname=in.next();
            x.Address=in.next();
            x.Phone=in.next();
            x.UpPassword=in.next();
            x.UpconPassword=in.next();
            x.ACType=in.next();
            x.Age=in.nextInt();
            x.Gender=in.next();
            x.Role=in.next();
            x.UpUsername=in.next(); 
            list1.add(x);
            
        }
         
         return list1;
         
         
     }
     
     
     
     
     
     
     
     
     
    
    
    
}
