package example;

import java.io.File;
import java.util.ArrayList;

public class PrintStrategy {

	public void printAverageSales(float averageSales) {
		System.out.print(averageSales);
	}

	public void printSpecialReport(ArrayList<Float> sales) {
	}

	public void printSalesToFile(String fileName, ArrayList<Float> sales) {
	}

	// Here we can add more methods related to printing 
}
