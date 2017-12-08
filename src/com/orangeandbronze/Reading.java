package com.orangeandbronze;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
	public static void main(String[] args) {
		String filename = "file.txt";
		try (BufferedReader breader = new BufferedReader(new FileReader(filename))) {
		    while (breader.ready()) {
		    String line = breader.readLine();
		        System.out.println(line);
		    }
		} catch (IOException e) {
		    throw new RuntimeException("problem reading from file " + filename, e);
		}
	}
}
