
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
public class TASK2 {
 //// DECLARATIONS
public static String taskdescription;
 public static String taskName;
 public static int total;
 public static String description;
 public static String taskID;
 public static String taskStatus;
 public static int taskDuration;
 
          /// boolean method determetion
public static boolean checkTaskDescription(){
   if (description.length()<=50){
   }
   else{
       return false;
   }
   return true;
    
}
/// task id method instructions
public static String createTaskID( String name, String taskname, int total, String taskID){
    taskID= (taskName.substring(0,3))+ ":"+(1)+(name.substring(name.length()-4));   
}

///instructions for the 
public static String printTaskDetails(String taskStatus, String name, String lastname, int total, String taskName, String taskDescription, String taskID, int taskDuration){
    return taskStatus + ":"+ lastname + ","+ 2 + ","+ taskName + taskDescription + ","+ createTaskID(name, taskName, 1, taskID)+ "," + taskDuration+ "total";
}
public int returnTotalHours(int taskDuration){
    total +=taskDuration;
    return total;
}
}
         
 

 
 
 
     
        
    }
}

