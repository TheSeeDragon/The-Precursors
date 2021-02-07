import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class AfternoonFilter {
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
               
                   if(!(st[8].substring(2,6).equalsIgnoreCase("ab-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ab-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ab-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ab-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ab-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ab-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ab-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ac-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ae-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("al-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("as-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("at-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("au-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("av-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ap-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sb-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sc-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("se-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sl-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ss-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("st-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("su-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sv-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sp-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("sd-k"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-p"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-x"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-o"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-j"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-l"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-m"))){
                    if(!(st[8].substring(2,6).equalsIgnoreCase("ad-k"))){        
                        pwSigns.println(str);
                            }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
                        }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
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
       String b = "Test4.geojson";
       try{
           sc = new Scanner(new FileInputStream(a)); //input stream for all the latex files
           
           //String s = sc.nextLine(); //read the first line.
               //String st[] = s.split(":"); // array of string by spaces in a to separate words
               try{
                   PrintWriter pwSigns = new PrintWriter(new FileOutputStream(b,true)); //try to open the output stream.
                   if(!AfternoonFilter.filter(pwSigns));
                   }
                   catch(FileNotFoundException e){
                      System.out.println("The file named" +b+ "could not be created/opened");
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