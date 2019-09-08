// Serialised verion of meteorology
//Tim Hodgson
//August 2019

import java.io.*;
import java.util.Scanner;

public class Meteorology
{
	public String inputFile;
	public String outputfile;

	public static void main(String[] args)
		{
			Scanner inputOutput = new Scanner(System.in);

			System.out.println("Input files in form <data file name> <output file name> separated by a space");
			String temp = inputOutput.nextLine();
			System.out.println(temp);
		}
}
