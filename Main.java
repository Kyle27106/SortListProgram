//University of Arizona Global Campus
//Kyle Younce
//CPT307: Data Structures & Algorithms 
//Dr. Joshua Reichard
// 8/09/2021

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Creating list of days of the week
		LinkedList<String> day = new LinkedList<String>();
		
		
		//Adding items to the list
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");
		day.add("Friday");
		
		//Printing Original list to the console
		System.out.println("Original List: " + day);

		//Adding additional to the top of the list using the add(int index, E element) method
		day.add(0, "Sunday");
		
		//Printing Updated list to the console
		System.out.println("Updated List: " + day);
		
		//Removing last of the items form the list using the remove(int index) method
	
		day.remove(5);
		
		//Printing Final list to the console
		System.out.println("Final List: " + day);
	}
}

