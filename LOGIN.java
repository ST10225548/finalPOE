
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author st10225548
 */
public class LOGIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       String firstName;
       String lastName;
       String userName;
       String password;
  
       System.out.println("Please enter your first name ");
       firstName= input.nextLine();
       System.out.println("Please enetr your last name ");
       lastName= input.nextLine();
       System.out.println("Please enter your username ");
       userName= input.nextLine();
       System.out.println("Please enter your passwword ");
       password= input.nextLine(); 
    
    public static boolean checkUserName(String username){
        boolean length= false;
        boolean underscore= false;
        
        if (username.length<=5){
            return true;
        } 
        else{
            System.out.println("Username is short.");
            
        }  
        for (int u=0;  u< username.length; u++){
            if(username.charAt(u)=95){
                return true;
            }
            else{
                System.out.println("Username doesnt include an underscore");
            }
        }
    
    }
    public static  boolean checkPasswordComplexity(String password){
      boolean upperCase=false;
      boolean digit= false;
      boolean specialChar= false;
      boolean length= false;
      
      for (int p= 0; p<password.length();p++){
          if (password.charAt(p)>65 && password.charAt(p)<=90){
                  upperCase= true;
      }
          else{
              System.out.println("Password has no uppercase letter.");
          }
      if (password.charAt(p)>=48 && password.charAt(p)<=57){
          digit=true;        
    }
      else{
          System.out.println(" Password does not have a number.");
      }
      if (password.charAt(p)==95){
          specialChar=true;
      }
      else{
          System.out.println("Password does not have a special character");
      }
      if (password.length()>=8){
          length=true;
      }
      else{
          System.out.println("Password is too short.");
      }
     
      }   
    }
     
    public static String registerUser(String username, String password){
       if ( checkUserName(username) && checkPasswordComplexity(password)){
           return("You have registered successfully.");    
       }
       else{
          System.out.println ("Password and username are incorrectly formatted");
       }
    } 
     public boolean loginUser(){
         String userName;
         userName= null;
         String password;
         password= null;
         
         if (!(usernName)==null ? userName== null): (userName).equals(password)){
         System.out.println("invaild details");
         
     }
         else{
                 System.out.println("Welcome + firstname + lastname. ");
                 }
         return true;
     }
     public static String returnLoginStatus(String userName, string password){
         if (userLog.equals(username)&& passLog.equals(password)){
             System.out.println("Login successful");
         }
         else{
             System.out.println("Login unsuccessful.");
         }
         
     
       
JOptionPane.showMessageDialog(null, "WELCOME TO EASYKABANA");/// welcoming the user 
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Please select your choice by entering a "
                    + "value next to the options\n"+
                    "1)add tasks\n"+
                    "2) coming soon\n"+
                     "3) quit"));   
 
        /// used loop for incase the user did not select an option
             while ((option !=1) && (option !=2) && (option  !=3)){
            JOptionPane.showMessageDialog(null, 
                "OPTION SELECTED IS INVALID!!");
            option = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Please select your choice by entering a "
                    + "value next to the options\n"+
                    "1)add tasks\n"+
                    "2) coming soon\n"+
                    "3)quit"));
            // if statement 
                    if(option == 1){
                   option = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "input the number of tasks you want to add"));
                   
              }
                  else if(option == 2){
        JOptionPane.showMessageDialog(null,"coming soon");
             }
                  else {
             JOptionPane.showMessageDialog(null,"thank you");
          
            
           {
           
             Scanner in = new Scanner (System.in);
             System.out.println("enter your taskNum ");
             int taskNum =in.nextInt();
             for (int a = 0;1<taskNum; a++){
             String Taskname=in.nextLine();
             
             System.out.println("enter the task description");
             String Taskdescriptio=in.nextLine();
             } 
           if(checkTaskDescription() == true){
           System.out.println("task description has been captured");
           }
           else{
               System.out.println("task description should not have more than 50 characters");
           }
            System.out.println("enter task ID");
           String taskID= createTaskID(Taskname= DevName);
           
                   
               System.out.println("please enter name");
               String name=in.nextLine();
               
               System.out.println("please enter lastname");
               String lastName=in.nextLine();
               
               System.out.println("enter duration of task in hours");
               int duration=in.nextInt();
                returnTotalHours();
               
              System.out.println("Enter the task status from the following options: /nOption1 To Do /nOption2 Done /nOption3 Doing");
              int taskStatus =in.nextInt();
               
             }
                  }
           

     
 }                  

public static int menuOption(){
    int custChoice;
    custChoice= Integer.parseInt(JOptionPane.showInputDialog("select number:"+
            "n\1)display the developer name,taskname and task duration with the status done"+
            "n\2)display the developer and duration with the longest task duration"+
            "n\3)search for the task with a task  name  and display the task name,developer and task status "+
            "n\4)search for all the tasks assigned to a developer and display the task name and status with a task  name"+
            "n\5)delete a task using the task name"+
                "n\6)display the report that lists the full details of all captured tasks "));
            
    return custChoice;
}
    
public static void main (String[]args){
    
int numOfTasks;
numOfTasks = Integer.parseInt(JOptionPane.showInputDialog("please input the num of the tasks"));
}

String nameOfDev[]=new String [Tasks];
String taskName[]=new String [numberOfTasks];
String taskStatus[]=new String [Tasks];
String taskNumber[]=new String [number of tasks];
String taskID[]= new String [number of tasks];
int taskOfDuration[]=new int [number of Tasks];


for (int i=0;i<numberOfTasks;i++ ){
nameOfDeveloper[i]=JOptionPane.showInputDialog("please enter the developter name");
taskName[i]=JOptionPane.showInputDialog("please enter the task name");
taskStatus[i]=JOptionPane.showInputDialog("please enter the status of task :"
        + "\n 1)to do"
        +  "\n 2) doings"
         + "\n 3) done");
taskDuration[i]=Integer.parseInt(JOptionPane.showInputDialog("Please enter duration of task"));
int response= menuOption();



if (response==1){
    JOptionPane.showMessageDialog(null,ShowReport.statusofdone);   
}
else if (response==2){
    JOptionPane.showMessageDialog(null,ShowReport.longestDuration); 
}
else if (response==3){
    JOptionPane.showMessageDialog(null,ShowReport.searchTaskName(nameSearch, nameOfDev, taskName, taskStatus));
}
else if (response==4){
    JOptionPane.showMessageDialog(null,ShowReport.searchDeveloper(nameOfDev, nameOfDev, taskName, taskStatus));
}
else if (response==5){
    JOptionPane.showMessageDialog(null,ShowReport.delete( taskName));      
}
else{
    menuOption();
}








} 

}

    
}    
   
    
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}