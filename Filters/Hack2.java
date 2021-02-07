import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// Hack2 filters out the removed and planned signs

public class Hack2 {
    /**
	 * @param sc The Scanner, to read
	 * @param pwSigns The PrintWriter for signs format
	 * @param count To know what index we are, to be able to use appropriate names and Scanners/PrintWriters
	 * @param num To count how many times an file is invalid
	 */
        public static boolean filter(PrintWriter pwSigns) {
        	Scanner sc;
               String a = "FilteredSigns.geojson";
               int count = 0;
               boolean end = false;
               try{
                   sc = new Scanner(new FileInputStream(a)); //input stream for all the latex files
                   
                   while(sc.hasNextLine()){ 
                	   count++;//counts amount of line in the beginning to skip header of geojson file
                       String str = sc.nextLine(); //read the first line.
                       String st[] = str.split(":"); // array of string by spaces in a to separate words
                       
                       if(end==true)//end of file, for format
                    	   pwSigns.println(str);
                       
                       if(st[0].contains("]")){//end of file
                    	   end = true;
                    	   pwSigns.println(str);//end of file, for format
                       }
                       
                       if(count<5)
                    	   pwSigns.println(str);//prints header format
                	   
                	   if(count>=5 && end==false) {//filter
               
                		   if(!(st[15].substring(2,7).equalsIgnoreCase("Enlev"))){
                			   if(!(st[15].substring(2,7).equalsIgnoreCase("Archi"))){
                				   if(!(st[15].substring(2,7).equalsIgnoreCase("En co"))){
                   pwSigns.println(str);
                }}}}//end if  
                   }//end while
               return true;
           }//end try
           catch(FileNotFoundException e){
               System.out.println("Could not open input file "+a+" for "
                   + "reading.\n\nPlease check if file exists!");
               return false;
           }
          
   }
   public static void main (String[] args){
       Scanner sc;
       String a = "FilteredSigns.geojson";
       String b = "Test2.geojson";
       try{
           sc = new Scanner(new FileInputStream(a)); //input stream for all the latex files
           
               try{
                   PrintWriter pwSigns = new PrintWriter(new FileOutputStream(b,true)); //try to open the output stream.
                   if(!Hack2.filter(pwSigns));
                   }
                   catch(FileNotFoundException e){
                      System.out.println("The file named"+ b+ " could not be created/opened");
                      System.exit(0);

           } // while loop
           
           
           if(sc != null) { //close Scanner only if it was created
               sc.close();
           }

       }
           catch(FileNotFoundException e){
               System.out.println("Could not open input file "+a+" for "
                   + "reading.\n\nPlease check if file exists! Program "
                   + "will terminate after closing any opened files.\n");
                   System.exit(0);
       }
       System.exit(0);
   } 
}