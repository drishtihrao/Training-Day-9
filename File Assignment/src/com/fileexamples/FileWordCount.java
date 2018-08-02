package com.fileexamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileWordCount {
	public static void main(String[] args) throws Exception {
		int wordCount = 0;
		Scanner scanner = new Scanner(System.in);
		
		//taking the file path from the user
		System.out.println("Enter the file path");
		String path = scanner.nextLine();
		
		String line;
		BufferedReader reader = new BufferedReader(new FileReader(path));
		while((line = reader.readLine()) != null) {
			String wordList[] = line.split("\\s+");
			wordCount +=wordList.length;
		}
		reader.close();
		
		//Displaying the numbe of words
		System.out.println("No. of wors is " + wordCount);	
	}
}
