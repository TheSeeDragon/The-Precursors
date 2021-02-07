import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// Hack 1 Filters out all the bad/unwanted signs

public class Test {
    /**
	 * @param sc The Scanner, to read
	 * @param pwSigns The PrintWriter for signs format
	 * @param count To know what index we are, to be able to use appropriate names and Scanners/PrintWriters
	 * @param num To count how many times an file is invalid
	 */
    public static String[] filter(String s, PrintWriter pwSigns) {
        Scanner sc;
        String[] test = new String[20];
        int track = 0;
           String a = "Parking-signs.txt";
           try{
               sc = new Scanner(new FileInputStream(a)); //input stream for all the latex files
               
               while(sc.hasNextLine()){ 
                   
                   String str = sc.nextLine(); //read the first line.
                   String st[] = str.split(":"); // array of string by spaces in a to separate words
               
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
                   test[track] =str;
                   track++;
        }}}}}}}}}}}}}}}}}}}}}}}}}}} 
               }
           }//try
           catch(FileNotFoundException e){
               System.out.println("Could not open input file "+a+" for "
                   + "reading.\n\nPlease check if file exists! Program "
                   + "will terminate after closing any opened files.\n");
           }//catch
          
   }//filter1 method
    
    
    public static void main(String[] args) {
		
		System.out.println("Welcome to the EcoParking App!");
		boolean switchloop = true;
		
			while (switchloop == true) {
				System.out.println("What time of day would you like to park?(Please choose in hours in '0000' format)");
				Scanner scan = new Scanner(System.in);
				int daychoice = scan.nextInt();
				switch (daychoice) {
				case 1:
					
					switchloop = false;
					break;
					
				default :
					System.out.println("Input invalid.\n Please enter a valid input in the format '0000'. E.G for 8am '0800'");
				}
				scan.close();
			}
   } 
    /*	 public static String[] filter1(PrintWriter pwSigns,int num) {
        Scanner sc;
        String[] dayArray = new String[80000];
        int track = 0;
        String a = "ReelSigns.txt";
           try{
               sc = new Scanner(new FileInputStream(a)); //input stream for all the latex files
               
               while(sc.hasNextLine()){ 
                   
                   String str = sc.nextLine(); //read the first line.
                   String st[] = str.split(":"); // array of string by spaces in a to separate words
                   String[] string = st[num].split("-") ;
                   
                   if(string[1].substring(0,1).equalsIgnoreCase("o")) {
                   if(string[1].substring(0,1).equalsIgnoreCase("j")) {
                   if(string[1].substring(0,1).equalsIgnoreCase("l")) {
                   if(string[1].substring(0,1).equalsIgnoreCase("m")) {
                   if(string[1].substring(0,1).equalsIgnoreCase("k")) {
                   }}}}
                   dayArray[track] = str;
                   track++;
                   }
           }//while loop
               return dayArray;
               }//try loop
           catch(FileNotFoundException e){
               System.out.println("Could not open input file "+a+" for "
                   + "reading.\n\nPlease check if file exists!");
           }
		return dayArray;
          
   }//filter1 method*/
}