package com.orangeandbronze;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writing {
	
	public static void main(String[] args) {
		String filename = "file.txt";
		try (PrintWriter pwriter = new PrintWriter(new FileWriter(filename))) {
		    pwriter.println("Hey, I just met you...");
		    pwriter.println("And this is crazy...");
		    pwriter.println("But here's my number.");
		    pwriter.println("So call me maybe?");
		} catch (IOException e) {
			throw new RuntimeException("problem writing to file " + filename, e);
		}
	}

}
