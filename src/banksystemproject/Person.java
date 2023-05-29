/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystemproject;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;


public class Person implements Serializable{
 protected String UpUsername;
 protected String Fname;
 protected String Lname;
 protected String Address;
 protected String Phone;
 protected String UpPassword;
 protected String UpconPassword;
 protected String ACType;
 protected int Age;
 protected String Gender;
 protected String Role;
 Scanner inp=new Scanner(System.in);
 Scanner inpw=new Scanner(System.in);
 ArrayList<Person>list=new ArrayList<>();

    public Person() {
       
    }

    public Person(String UpUsername, String Fname, String Lname, String Address, String Phone, String UpPassword, String UpconPassword, String ACType, int Age, int Year, String Gender, String Role) {
        this.UpUsername = UpUsername;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Address = Address;
        this.Phone = Phone;
        this.UpPassword = UpPassword;
        this.UpconPassword = UpconPassword;
        this.ACType = ACType;
        this.Age = Age;
        this.Gender = Gender;
        this.Role = Role;
    }
    
 
public boolean inDisplay() throws FileNotFoundException
   {
       
      System.out.println("       ****SIGN IN****       ");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("enter your username ");
     String username = inp.nextLine();
      System.out.println("enter your password ");
     String password = inp.nextLine();
     boolean check1=check(username,password);
     UpUsername=username;
     return check1;
    
   }
   public boolean check(String username,String password)
   {
       boolean check2=false;
       int c=0;
       try
       {
           if(username.startsWith("Ad"))
           {
           File file=new File("AdminUsername.txt");
           Scanner input=new Scanner(file);
           File file1=new File("AdminPassword.txt");
           Scanner input1=new Scanner(file1);
           String []x=new String[10];
           String []k=new String[10];
           int i=0;
           while(input.hasNext())
           {
              x[i]=input.next();
              k[i]=input1.next();
              i++;
           }
           boolean check1=false;
           for(int j=0;j<i;j++)
           {
               
               if(x[j].equals(username)&&k[j].equals(password))
               {
                   
                   check1=true;
               }
           }
           if(check1)
           {
               System.out.println("Correct username and password ");
               return check1;
           }
           else
           {
               System.out.println("Incorrect username and password ");
               c++;
           }
           }
           else if(username.startsWith("Cl"))
           {
            File file=new File("ClientUsername.txt");
           Scanner input=new Scanner(file);
           File file1=new File("ClientPassword.txt");
           Scanner input1=new Scanner(file1);
           String []x=new String[10];
           String []k=new String[10];
           int i=0;
           while(input.hasNext())
           {
              x[i]=input.next();
              k[i]=input1.next();
              i++;
           }
           boolean check1=false;
           for(int j=0;j<i;j++)
           {
               
               if(x[j].equals(username)&&k[j].equals(password))
               {
                   
                   check1=true;
                   break;
               }
           }
           if(check1)
           {
               System.out.println("Correct username and password ");
               return check1;
           }
           else
           {
               System.out.println("Incorrect username and password ");
               c++;
               
           }  
           }
           else if(username.startsWith("Em"))
           {
               
           File file=new File("EmployeeUsername.txt");
           Scanner input=new Scanner(file);
           File file1=new File("EmployeePassword.txt");
           Scanner input1=new Scanner(file1);
           String []x=new String[10];
           String []k=new String[10];
           int i=0;
           while(input.hasNext())
           {
              x[i]=input.next();
              k[i]=input1.next();
              i++;
           }
           boolean check1=false;
           for(int j=0;j<i;j++)
           {
               
               if(x[j].equals(username)&&k[j].equals(password))
               {
                   
                   check1=true;
                   
                   
               }
           }
           if(check1)
           {
               System.out.println("Correct username and password ");
               return check1;
           }
           else
           {
               System.out.println("Incorrect username and password ");
               c++;
           }     
           }
       }catch(Exception e)
       {
           System.out.println("Incorrect username and password");
           c++;
       }
       if(c==0)
       System.out.println("Incorrect username and password");
       
       return check2;
   }
    
    
    
    
    
 public void updisplay() throws FileNotFoundException, IOException
    {
        System.out.println("       ****SIGN UP****       ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("First Name: ");
        setFname(inp.next());
//        System.out.print("Last Name: ");
//        setLname(inp.next());
//        System.out.print("Address: ");
//        String Address="";
//        Address+=inpw.nextLine();
//        setAddress(Address);
//        System.out.print("Phone: ");
//        setPhone(inp.next());
        System.out.print("Password(8 char): ");
        setUpPassword(inp.next());
//        System.out.print("Confirm Password: ");
//        setUpconPassword(inp.next());
//        System.out.print("Account Type (Saving,Transaction): ");
//        setACType(inp.next());
        System.out.print("Age: ");
        setAge(inp.nextInt());
//        System.out.print("Year: ");
//        setYear(inp.nextInt());
//        System.out.print("Gender: ");
//        setGender(inp.next());
        System.out.print("Role(Admin,Client,Employee): ");
        setRole(inp.next());
        System.out.println("your UserName is : ");
        System.out.println(setUpUsername());
        File file =new File("DATA.txt");
        setarray();
        SetFile();
        setfile1(file);
       
        
        
    }
    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setUpPassword(String UpPassword) {
//        boolean check1=false;
//        boolean check2=false;
//        boolean check3=false;
//        
//        if(UpPassword.length()<8)
//        {
//            System.out.println("please enter password with more Characters ");
//            UpPassword=inp.next();
//        }
//        for(int i=0;i<UpPassword.length();i++)
//        {
//            if(UpPassword.charAt(i)>=65&&UpPassword.charAt(i)<=90)
//            {
//                check2=true;
//                break;
//            }
//        }
//        if(check2==false)
//        {
//            System.out.println("please enter at least one CAPITAL Character ");
//            UpPassword=inp.next();
//        }
//        
//        for(int i=0;i<UpPassword.length();i++)
//        {
//            if(UpPassword.charAt(i)>=48&&UpPassword.charAt(i)<=57)
//            {
//                check3=true;
//                break;
//            }
//        }
//        if(check3==false)
//        {
//            System.out.println("please enter at least one NUMBER in your Password ");
//            UpPassword=inp.next();
//        }
//        else{
           this.UpPassword = UpPassword;
//           check1=true;
//        }
       
        
    }

       
    public void setUpconPassword(String UpconPassword) {
 
            this.UpconPassword=UpconPassword;
    }

    public void setACType(String ACType) {
        boolean check=false;
        do{
        if(ACType.equals("Saving")||ACType.equals("Transaction"))
        {
          this.ACType = ACType;
          check=true;
        }
        else
        {
            System.out.println("Please choose from the following options (Saving or Transaction)");
            ACType=inp.next();
        }
        }while(check==false);
        
    }

    public void setAge(int Age) {
        
          this.Age=Age; 
    }

 
    public void setGender(String Gender) {
        
          this.Gender=Gender;

    }

    public void setRole(String Role) {
 
          this.Role=Role;
    }
    
     public String setUpUsername() throws FileNotFoundException, IOException {

         if(Role.equals("Client"))
        {
            
            
         String check;
         check="Cl"+Fname+Age;
         // FileWriter CLU=new FileWriter("ClientUsername.txt",true);
    
          FileWriter ko10=new FileWriter("ClientUsername.txt",true);
          PrintWriter k=new PrintWriter(ko10);
          this.UpUsername=check;
          k.println(this.UpUsername);
       File file=new File("ClientUsername.txt");
         Scanner input =new Scanner(file);
         String[] array=new String[100];
         int i=0;
         while(input.hasNext())
         {
                 
             array[i]=input.next();
         i++;
         }
         for(int j=0;j<i;j++)
         {
      
             if(check.equals(array[j]))
             {
                this.UpUsername="Cl"+Fname+Age+(int)(0+(Math.random()*10));
          k.println(this.UpPassword);
             }
            
//                else
//                 this.UpUsername=check;
//            k.println(this.UpUsername);
             
        
         
         }
        }
        
        if(Role.equals("Admin"))
        {
            
         String check;
         check="Ad"+Fname+Age;
         FileWriter ADU=new FileWriter("AdminUsername.txt",true);
         this.UpUsername=check;
         File file=new File("AdminUsername.txt");
         Scanner input =new Scanner(file);
         String[] array=new String[100];
         int i=0;
         while(input.hasNext())
         {
             array[i]=input.next();
         i++;
         }
         for(int j=0;j<i;j++)
         {
      
             if(check.equals(array[j]))
             {
                this.UpUsername="Ad"+Fname+Age+(int)(0+(Math.random()*10));
             }
         }
        }
            
        if(Role.equals("Employee"))
        {
            String check;
         check="Em"+Fname+Age;
         FileWriter EMU=new FileWriter("EmployeeUsername.txt",true);
         this.UpUsername=check;
         File file=new File("EmployeeUsername.txt");
         Scanner input =new Scanner(file);
         String[] array=new String[100];
         int i=0;
         while(input.hasNext())
         {
             array[i]=input.next();
         i++;
         }
         for(int j=0;j<i;j++)
         {
      
             if(check.equals(array[j]))
             {
                this.UpUsername="Em"+Fname+Age+(int)(0+(Math.random()*10));
             }
            
                 
         }
            
           
            
        }
        
        return UpUsername;
    }
        
    public void SetFile()
    {
     try {
         if(UpUsername.startsWith("Cl"))
         {
         FileWriter ko10=new FileWriter("ClientUsername.txt",true);
         PrintWriter ko1=new PrintWriter(ko10);
         ko1.println(list.get(0).UpUsername);
         ko1.close();
          FileWriter CLP=new FileWriter("ClientPassword.txt",true);
         PrintWriter ko2=new PrintWriter(CLP);
         ko2.println(list.get(0).UpPassword);
         ko2.close();
         }
         if(UpUsername.startsWith("Ad"))
         {
           FileWriter ko11=new FileWriter("AdminUsername.txt",true);
         PrintWriter ko3=new PrintWriter(ko11);
         ko3.println(list.get(0).UpUsername);
         ko3.close();
          FileWriter ADP=new FileWriter("AdminPassword.txt",true);
         PrintWriter ko4=new PrintWriter(ADP);
         ko4.println(list.get(0).UpPassword);
         ko4.close();
         }
         if(UpUsername.startsWith("Em"))
         {
         FileWriter ko12=new FileWriter("EmployeeUsername.txt",true);
         PrintWriter ko5=new PrintWriter(ko12);
         ko5.println(list.get(0).UpUsername);
         ko5.close();
          FileWriter EMP=new FileWriter("EmployeePassword.txt",true);
         PrintWriter ko6=new PrintWriter(EMP);
         ko6.println(list.get(0).UpPassword);
         ko6.close();
         }
                 
     } catch (IOException ex) {
         Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
     }    
    }

    public void setarray()
    {
       Person x= new Person();
       x.Fname=Fname;
       x.Lname=Lname;
       x.Address=Address;
       x.Phone=Phone;
       x.UpPassword=UpPassword;
       x.UpconPassword=UpconPassword;
       x.ACType=ACType;
       x.Age=Age;
       x.Gender=Gender;
       x.Role=Role;
       x.UpUsername=UpUsername;
       list.add(x); 
    }
    
    public void setfile1(File file) throws IOException
    {
        //if(list.get(0).Role.equals("Client"))
       // {
        FileWriter ko1=new FileWriter(file,true);
        PrintWriter ko2=new PrintWriter(ko1);
        ko2.println(list.get(0).Fname);
        ko2.println(list.get(0).Lname);
        ko2.println(list.get(0).Address);
        ko2.println(list.get(0).Phone);
        ko2.println(list.get(0).UpPassword);
        ko2.println(list.get(0).UpconPassword);
        ko2.println(list.get(0).ACType);
        ko2.println(list.get(0).Age);
        ko2.println(list.get(0).Gender);
        ko2.println(list.get(0).Role);
        ko2.println(list.get(0).UpUsername);
        ko2.close();
       // }
       //
  
    }
    
    
    

    public String getUpUsername() {
        return UpUsername;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public String getUpPassword() {
        return UpPassword;
    }

    public String getUpconPassword() {
        return UpconPassword;
    }

    public String getACType() {
        return ACType;
    }

    public int getAge() {
        return Age;
    }
    public String getGender() {
        return Gender;
    }

    public String getRole() {
        return Role;
    }
    public Scanner getInp() {
        return inp;
    }


  
    
    
    
    
}
