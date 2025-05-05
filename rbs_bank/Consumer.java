package com.internshala.advancedjava;

import java.util.LinkedList;

public class Consumer implements Runnable {
	
	//Buffer,constructor
    
private final LinkedList<Integer> buffer;
	
Consumer (LinkedList<Integer> buffer) {
		this.buffer = buffer;
		
	}
	@Override
	public void run() {
		//Assuming  run() or consumer consuming  infinite items
		while(true) {
			try {
				this .consume();
			}
			catch (Exception e) {
				System.out.print(e);
			}
			
		}
		
	}
	
	public void consume () throws InterruptedException {
		
		synchronized(buffer) {
			//if buffer is empty
			while (buffer.size()==0) {
				System.out.println("Consumer is waiting");
				buffer.wait();
			}
			//if we want to consume an item
			int num = buffer.remove(0);
			System.out.println("Consumer consumed : "+num);
			buffer.notifyAll();
			Thread.sleep(5);
		}
	}
	

}

