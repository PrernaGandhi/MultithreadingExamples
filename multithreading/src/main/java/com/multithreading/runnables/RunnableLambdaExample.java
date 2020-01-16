package com.multithreading.runnables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RunnableLambdaExample {
	
	public static void main(String[] args) {
		Runnable runnable = () ->{
			try (BufferedReader buffReader = new BufferedReader(
					new FileReader(new File("file.txt")))) {
				String line = null;
				while ((line = buffReader.readLine()) != null) {
					System.out.println("Runnable Lambda Thread => ".concat(Thread.currentThread().getName()).concat(" reading the line : ").concat(line));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
