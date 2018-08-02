package com.fileexamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrepFunction {

	public static void main(String[] args) throws IOException {
		int lineCount = 0, flag = 0;
		
		Pattern pattern = Pattern.compile(args[1]);
		Matcher matcher = pattern.matcher(" ");
		
		String line;
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		while((line = reader.readLine()) != null) {
			matcher.reset(line);
			lineCount++;
			if(matcher.find()) {
				flag = 1;
				System.out.println("Line number " + lineCount + " Line: " + line);
			}
		}
		if(flag == 0)
			System.out.println("String is not present");
		reader.close();
	}
}
