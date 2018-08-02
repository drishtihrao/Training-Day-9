package com.lambaexpressionexamples;

import java.io.File;
import java.util.Scanner;

public class FileFilter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file path");
		String path = new String(scanner.nextLine());
		File dir = new File(path);
		
		File subDirectory[] = dir.listFiles(File::isDirectory);
		for(File file : subDirectory) {
			System.out.println(file.getName());
		}
	}
}
