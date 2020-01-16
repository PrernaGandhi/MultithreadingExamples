package com.multithreading.main;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.multithreading.runnables.RunnableExample;
import com.multithreading.runnables.ThreadClassExample;

/**
 * MultiThreading
 *
 */
public class App {
	public static void main(String[] args) {
		//with thread class
		ThreadClassExample threadClassObj1 = new ThreadClassExample();
		ThreadClassExample threadClassObj2 = new ThreadClassExample();
		ThreadClassExample threadClassObj3 = new ThreadClassExample();
		threadClassObj1.start();
		threadClassObj2.start();
		threadClassObj3.start();
		//with runnable interface
		RunnableExample runnableExample = new RunnableExample();
		Thread thread = new Thread(runnableExample);
		thread.start();
		//Executor 
		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(runnableExample);
		executor.execute(new RunnableExample());

	}
}
