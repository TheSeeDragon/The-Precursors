import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* Hack3 seperates the signs into timeblocks
    ab-
    ac-
    ad-
    ae-
    al-
    as-
    at-
    au-
    av-
    ap-
    sb-
    sc-
    sd-
    se-
    sl-
    ss-
    st-
    su-
    sv-
    sp-
*/

public class MorningFilter {
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
               
        if(!(st[8].substring(2,6).equalsIgnoreCase("ab-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ab-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ab-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ab-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ab-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ab-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ab-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ab-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ab-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ac-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ac-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ac-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ac-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ac-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ac-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ac-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ac-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ac-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ae-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ae-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ae-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ae-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ae-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ae-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ae-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ae-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ae-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("al-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("al-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("al-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("al-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("al-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("al-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("al-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("al-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("al-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("as-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("as-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("as-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("as-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("as-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("as-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("as-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("as-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("as-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("at-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("at-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("at-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("at-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("at-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("at-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("at-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("at-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("at-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("au-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("au-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("au-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("au-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("au-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("au-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("au-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("au-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("au-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("av-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("av-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("av-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("av-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("av-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("av-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("av-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("av-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("av-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ap-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ap-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ap-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ap-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ap-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ap-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ap-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ap-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ap-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sb-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sb-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sb-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sb-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sb-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sb-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sb-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sb-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sb-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sc-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sc-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sc-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sc-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sc-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sc-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sc-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sc-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sc-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("se-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("se-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("se-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("se-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("se-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("se-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("se-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("se-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("se-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sl-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sl-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sl-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sl-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sl-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sl-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sl-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sl-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sl-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ss-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ss-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ss-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ss-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ss-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ss-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ss-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ss-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ss-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("st-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("st-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("st-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("st-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("st-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("st-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("st-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("st-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("st-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("su-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("su-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("su-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("su-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("su-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("su-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("su-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("su-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("su-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sv-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sv-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sv-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sv-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sv-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sv-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sv-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sv-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sv-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sp-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sp-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sp-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sp-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sp-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sp-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sp-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sp-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sp-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sd-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sd-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sd-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sd-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sd-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sd-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sd-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sd-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("sd-k"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ad-a"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ad-b"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ad-c"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ad-q"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ad-r"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ad-j"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ad-l"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ad-m"))){
        if(!(st[8].substring(2,6).equalsIgnoreCase("ad-k"))){        
            pwSigns.println(str);
                }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
            }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}//If end
                	   }//end if
                	   } //while end
               return true;
            
               }
               //end try
               catch(FileNotFoundException e){
                System.out.println("Could not open input file "+a+" for "
                    + "reading.\n\nPlease check if file exists! Program "
                    + "will terminate after closing any opened files.\n");
                return false;
            }      
    }
    
public static void main (String[] args){
       Scanner sc;
       String a = "ReelSigns.geojson";
       String b = "Test3.geojson";
       try{
           sc = new Scanner(new FileInputStream(a)); //input stream for all the latex files
               try{
                   PrintWriter pwSigns = new PrintWriter(new FileOutputStream(b,true)); //try to open the output stream.
                   if(!MorningFilter.filter(pwSigns));
                   }
                   catch(FileNotFoundException e){
                      System.out.println("The file named MorningFilter.geojson could not be created/opened");
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