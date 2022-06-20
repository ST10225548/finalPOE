/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author st10225548
 */
public class ShowReport {
   
    public static int[] longestDuration;
    public static String[] statusofdone;
    public static String[] taskname;
    public static String[]  developer[];
    public static String[] nameSearch;
    public static String[] taskStatus;
    public static String[] taskName;
    public static String[] nameOfDev;
    
    public static String[] taskID;
   
public static String statusOfdone(){// for loop to search
 String done="";
    for (int i = 0; i < statusofdone.length; i++) {
        if(statusofdone[i].equalsIgnoreCase("Done")){
             
            done+=developer[i]+taskname[i]+longestDuration[i];
        }
    }
    return done; 
  }
public static String longestDuration(){// for loop to show max 
   int max=longestDuration[0];
   int place= 0;
   for(int i = 0; i<longestDuration.length;i++){
       if(max<longestDuration[i]){
           max =longestDuration[i];
           place=i;
           
       }
   }
   return developer[place]+""+max;
}
public static String searchTaskName( String nameSearch, String []developer , String []taskName, String[] taskStatus){
    
    for(int i= 0;i<taskName.length; i++){
        if (taskName[1].equals(nameSearch)){
        return (taskName[1]+ "\n"+ developer[1]+"\n" taskStatus[1]);
     
    }
    return null;
     
    }

} 
     
public static String searchDeveloper(String []developer, String nameOfDev, String[] taskName , String[] taskStatus){
    for(int i= 0;i<nameOfDev.length; i++){
    
        if (nameOfDev [1], equals (searchDeveloper)){
        return(taskName[1]+ "\n"+ taskStatus[1]);// returning statments 
    
    }
       
   }
    return null;

}
public static void delete( String taskName){
    String[]newTaskName= new String[taskName.length-1];
    int []newDuration= new int[longestDuration.length-1];
    String[]newTaskID= new String[taskID.length-1];
    String[]newTaskStatus= new String[taskStatus.length-1];
    String[]newnameOfDev= new String[nameOfDev.length-1]; // showing new strings 
    
    int n=0;
    int place=0;
    
    for (int i=0; i<taskName.length;i++){ 
    if (taskName[i].equals(taskName)){
       place=i;
        
    }
    else{
        newTaskName[n]=taskName[i];
        n++;
    }
}
    int m=0;
    for (int l=0;l<longestDuration.length;l++){
     if(l!=place){
         newDuration[m]=longestDuration[l];
         newTaskID[m]=taskID[l];
         newTaskStatus[m]=taskStatus[l];
         newnameOfDev[m]=nameOfDev[l];
         
         m++;
     }   
        
        
    }
longestDuration=newDuration;
taskID=newTaskID;
taskStatus=newTaskStatus;
 nameOfDev=newnameOfDev;
taskName=new taskName;
}
public static String displayreport(String nameOfDev[],String taskStatus[],String taskName[],String[] longestDuration){
for (int i = 0;i<nameOfDev.length;i++){
  return (nameOfDev[i]+"\n"+taskStatus[i]+"\n"+taskName[i]+"\n"+longestDuration[i]);  
    //showing display
    
}
return null;
}

}

    


        




 
 
 
 

    


