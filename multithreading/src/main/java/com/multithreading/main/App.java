package com.multithreading.main;

import com.multithreading.runnables.ThreadClassExample;

/**
 * MultiThreading
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Using thread class ====================================================");
		ThreadClassExample threadClassObj1 = new ThreadClassExample();
		ThreadClassExample threadClassObj2 = new ThreadClassExample();
		ThreadClassExample threadClassObj3 = new ThreadClassExample();
		threadClassObj1.start();
		threadClassObj2.start();
		threadClassObj3.start();
		System.out.println("After starting all threads using thread class ========================");
	}
}
