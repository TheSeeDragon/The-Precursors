import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// Hack 1 Filters out all the bad/unwanted signs

public class Hack1 {
    /**
	 * @param sc The Scanner, to read
	 * @param pwSigns The PrintWriter for signs format
	 * @param count To know what what line we are in
	 */
    public static boolean filter(PrintWriter pwSigns) {
    	Scanner sc;
           String a = "signalisation_stationnement.geojson";
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
            	   
            	   if(count>=5 && end==false) {

               if(!(st[8].substring(2,4).equalsIgnoreCase("PX"))){
               if(!(st[8].substring(2,4).equalsIgnoreCase("PR"))){
               if(!(st[8].substring(2,4).equalsIgnoreCase("PA"))){
               if(!(st[8].substring(2,4).equalsIgnoreCase("CR"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("AD-TT"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("AD-DC"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("AD-TU"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("AD-TD"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("AD-TE"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("AD-CD"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("AR-TT"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("AS-OS"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("SD-TT"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("SD-TC"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("SD-TU"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("SB-BG"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("SU-UA"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("SB-UP"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("PG-DP"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("PD-RC"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("PD-TS"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("PH-TB"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("PH-TA"))){
               if(!(st[8].substring(2,7).equalsIgnoreCase("PC-TD"))){
               if(!(st[8].substring(2,3).equalsIgnoreCase("E"))){
               if(!(st[8].substring(2,3).equalsIgnoreCase("D"))){
               if(!(st[8].substring(2,3).equalsIgnoreCase("R"))){
                   pwSigns.println(str);
               }}}}}}}}}}}}}}}}}}}}}}}}}}} 
            	   }//end if
            	   }//end while
               return true;//to satisfy boolean
           }
           catch(FileNotFoundException e){//file not found exception
               System.out.println("Could not open input file "+a+" for "
                   + "reading.\n\nPlease check if file exists!");
               System.exit(0);
           }
           return false;//to satisfy boolean
          
   }
   public static void main (String[] args){
       Scanner sc;
       String a = "signalisation_stationnement.geojson";
       String b = "Test1.geojson";
       try{
           sc = new Scanner(new FileInputStream(a));//input stream
           
               try{
                   PrintWriter pwSigns = new PrintWriter(new FileOutputStream(b,true)); //output stream
                   if(!Hack1.filter(pwSigns));
                   }
                   catch(FileNotFoundException e){
                      System.out.println("The file named" +b+ "could not be created/opened");
                      System.exit(0);

           } // while loop

           if(sc != null) { //close Scanner only if it was created
               sc.close();
           }

       }//end of try
           catch(FileNotFoundException e){
               System.out.println("Could not open input file "+a+" for "
                   + "reading.\n\nPlease check if file exists! Program "
                   + "will terminate after closing any opened files.\n");
                   System.exit(0);
       }//end of catch
       System.exit(0);
   } 
}