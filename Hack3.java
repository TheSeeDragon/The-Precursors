import java.util.Scanner;


public class Hack3 {

	    public static void main(String[] args) {
			
			System.out.println("Welcome to the EcoParking App!");
			boolean Ifloop = true;
			
				while (Ifloop == true) {
					System.out.println("What time of day would you like to park?(Please choose in hours in '0000' format)");
					Scanner scan = new Scanner(System.in);
					int timechoice = scan.nextInt();
					
					if(timechoice>0500 && timechoice<=1200) {
						 System.out.println("The file for the selected time is: MorningFilter.geojson");
						Ifloop = false;
					}//Ifloop end
					
					else if(timechoice>1200 && timechoice<=2000) {
						System.out.println("The file for the selected time is: AfternoonFilter.geojson");
						Ifloop = false;
					}//Ifloop end
					
					else if(timechoice>2000 && timechoice<=0700) {
						System.out.println("The file for the selected time is: NightFilter.geojson");
						Ifloop = false;
					}//Ifloop end
					
					else System.out.println("\nInput invalid.\n Please enter a valid input in the format '0000'. E.G for 8am '0800'");
					scan.close();
				}
	   } 
}