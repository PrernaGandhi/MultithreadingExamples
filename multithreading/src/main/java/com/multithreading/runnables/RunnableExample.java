package com.multithreading.runnables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RunnableExample implements Runnable{

	@Override
	public void run() {
		System.out.println("Using runnable interface ====================================================");
		try (BufferedReader buffReader = new BufferedReader(
				new FileReader(new File("file.txt")))) {
			String line = null;
			while ((line = buffReader.readLine()) != null) {
				System.out.println("Runnable Thread => ".concat(Thread.currentThread().getName()).concat(" reading the line : ").concat(line));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
