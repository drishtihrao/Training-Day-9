package com.fileexamples;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

public class FileLineCount {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		//taking the file path from the user
		System.out.println("Enter the file path");
		String path = scanner.nextLine();
		
		//creating a buffered
		BufferedReader reader = new BufferedReader(new FileReader(path));
		int lineCount = 0;
		//counting the number of lines in the file
		while(reader.readLine() != null)
			lineCount++;
		reader.close();
		System.out.println("No. of lines is " + lineCount);
	}
}
