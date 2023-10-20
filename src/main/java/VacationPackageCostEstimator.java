// Copyright (C) 2020
// All rights reserved
import java.util.Scanner;

public class VacationPackageCostEstimator {
//CHECKSTYLE:OFF
/**
 * Summary of JavaDoc.
 * @author Joby Farra
 * @param args Arguments
*/
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the destination of the vacation: ");
	String destination = scanner.nextLine();

	System.out.print("Enter the number of travelers: ");
	int travelers = scanner.nextInt();

	System.out.print("Enter the duration of the vacation in days: ");
	int days = scanner.nextInt();

	scanner.close();
	int baseCostTrip = 1000;
	int additionalCostCity = 0;


	if (destination.equalsIgnoreCase("Paris")) {
		additionalCostCity = 500;
	} else if (destination.equalsIgnoreCase("New York City")) {
		additionalCostCity = 600;
	}

	int total = baseCostTrip + additionalCostCity;

	if (travelers > 4 && travelers < 10) {
		total -= total * 0.1;
	} else if (travelers > 10) {
		total -= total * 0.2;
	}

	if (days < 7) {
		total += 200;
	}

	if (days > 30 || travelers == 2) {
		total -= 200;
	}

	if (total < 0 || travelers > 80) {
		total = -1;
	}

	if (total >= 0) {
		System.out.println("The amount for the vacation package: $"
	+ total);
	} else {
		System.out.println("Please Try Again, and check your inputs");
	}
	}
}
