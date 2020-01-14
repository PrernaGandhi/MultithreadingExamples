package com.multithreading.runnables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * The task is to read data from file and output it to the console 
 * 
 */
public class ThreadClassExample extends Thread {

	@Override
	public void run() {

		try (BufferedReader buffReader = new BufferedReader(
				new FileReader(new File("file.txt")))) {
			String line = null;
			while ((line = buffReader.readLine()) != null) {
				System.out.println("Thread => ".concat(Thread.currentThread().getName()).concat(" reading the line : ").concat(line));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
