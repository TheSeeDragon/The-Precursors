import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class NightFilter{
    	 /**
		 * @param sc The Scanner, to read
		 * @param pwSigns The PrintWriter for signs format
		 * @param count To know what index we are, to be able to use appropriate names and Scanners/PrintWriters
		 * @param num To count how many times an file is invalid
		 */
	        public static boolean filter(PrintWriter pwSigns) {
	        	Scanner sc;
	               String a = "ReelSigns.geojson";
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
               
                   if(!(st[8].substring(2,6).equalsIgnoreCase("ab-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ab-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ab-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ab-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ab-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-n"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-s"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-u"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-v"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-w"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-n"))){       
                        pwSigns.println(str);
                            }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
                        }}}}}}}}}}}}}
	                	   }//end if
                    } // end of while loop
               }catch(FileNotFoundException e){
                System.out.println("Could not open input file "+a+" for "
                    + "reading.\n\nPlease check if file exists! Program "
                    + "will terminate after closing any opened files.\n");
                return false;
            }
               return true;
               
    }
    
public static void main (String[] args){
       Scanner sc;
       String a = "ReelSigns.geojson";
       String b = "Test5.geojson";
       try{
           sc = new Scanner(new FileInputStream(a)); //input stream for all the latex files
               try{
                   PrintWriter pwSigns = new PrintWriter(new FileOutputStream(b,true)); //try to open the output stream.
                   if(!NightFilter.filter(pwSigns));
                   }
                   catch(FileNotFoundException e){// file not found exception
                      System.out.println("The file named" +b+ " could not be created/opened");
                      System.exit(0);
           } // while loop
           
           
           if(sc != null) { //close Scanner only if it was created
               sc.close();
           }

       }
           catch(FileNotFoundException e){//file not found exception
               System.out.println("Could not open input file "+a+" for "
                   + "reading.\n\nPlease check if file exists!");
                   System.exit(0);
       }
       System.exit(0);
   } 
}