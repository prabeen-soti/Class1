import java.util.Scanner;

public class NemoReefTours {
	final static float RATE = 85.50f;

	final static float DISCOUNT3TO5 = 10;
	final static float DISCOUNT6TO10 = 15;
	final static float DISCOUNT10TOMAX = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to the Nemo Reef Tours Management System");
		int N = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of passenger");
		N = scan.nextInt();
		scan.nextLine();
		
		String [] name = new String[N];
		
		int [] noOfPassenger = new int[N];
		
		double[] totalCost = new double[N];
		
		int total = 0;
		double finalCost = 0.0d;
		
		for(int i=0;i<N;i++) {
			System.out.println("Enter name of passenger"+i+":");
			name[i]= scan.nextLine();
			System.out.println("Enter number of passenger for "+name[i]+":");
			noOfPassenger[i] = scan.nextInt();
			scan.nextLine();
			
			total+=noOfPassenger[i];
			
			if(noOfPassenger[i]<=2) {
				totalCost[i]=noOfPassenger[i]*RATE;
			}else if(noOfPassenger[i]<=5) {
				totalCost[i]=noOfPassenger[i]*RATE*(1-DISCOUNT3TO5/100);
			}else if(noOfPassenger[i]<=10) {
				totalCost[i]=noOfPassenger[i]*RATE*(1-DISCOUNT6TO10/100);
			}else {
				totalCost[i]=noOfPassenger[i]*RATE*(1-DISCOUNT10TOMAX/100);
			}
			finalCost+=totalCost[i];

			System.out.println("The Tour charges for "+name[i]+" of "+noOfPassenger[i]+" passenger(s) is $"+totalCost[i]);
		}
		
		System.out.println("Statical Information for Nemo Reef");
		int minPassenger=Integer.MAX_VALUE;
		int maxPassenger=Integer.MIN_VALUE;
		String minPassengerName="";
		String maxPassengerName="";
		for(int i=0;i<N;i++) {
			if(minPassenger>=noOfPassenger[i]) {
				minPassenger = noOfPassenger[i];
				minPassengerName = name[i];
			}
			if(maxPassenger<=noOfPassenger[i]) {
				maxPassenger = noOfPassenger[i];
				maxPassengerName = name[i];
			}
		}
	
		System.out.println("Booking: "+minPassengerName+" has minimum number of "+minPassenger+" passenger(s)");
		System.out.println("Booking: "+maxPassengerName+" has minimum number of "+maxPassenger+" passenger(s)");
		System.out.println("The Average number of booking per passenger is "+total/N+" passenger(s)");
		System.out.println("The total Collected charges is $"+finalCost);
		
		System.out.println("Thank You For Using the Nemo Reef Tours Management System");

	}

}
