/*WAJP to read a day from the user and according to the display which
sport has to be played based on the following time table.*/

import java.util.*;

public class GameTimetableInWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Day In a Week : ");
		String day = sc.nextLine();
		
		switch(day)
		{
			case "monday":
				System.out.println("cricket");
				break;
			case "tuesday":
				System.out.println("volleyball");
				break;
			case "wednesday":
				System.out.println("basketball");
				break;
			case "thursday":
				System.out.println("kabbadi");
				break;
			case "friday":
				System.out.println("tennis");
				break;
			case "saturday":
				System.out.println("kho-kho");
				break;
			case "sunday":
				System.out.println("Holiday");
				break;
		}

	}

}
