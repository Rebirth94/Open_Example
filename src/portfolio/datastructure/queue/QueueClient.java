package portfolio.datastructure.queue;

import portfolio.datastructure.queue.queue.CircularQueue;
import portfolio.datastructure.queue.queue.IntPriorityQueue;
import portfolio.datastructure.queue.queue.LinearQueue;
import portfolio.datastructure.queue.queue.LinkedQueue;
import portfolio.datastructure.queue.queue.QueueExample;

@SuppressWarnings("unused")
public class QueueClient {

	public static void main(String[] args) {
		
//		QueueExample<Integer> queue = new LinearQueue<>(10);
//		QueueExample<Integer> queue = new CircularQueue<>(5);
//		QueueExample<Integer> queue = new LinkedQueue<>();
		QueueExample<Integer> queue = new IntPriorityQueue<>(IntPriorityQueue.DOWN);
		
		
		queue.enqueue(3);
		queue.enqueue(7);
		queue.enqueue(9);
		queue.enqueue(1);
		queue.enqueue(6);
		
		for (int i=0; i<5; i++) {
			System.out.println(queue.dequeue());
		}
		
		if(true) {return;}
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		
		
		for (int i=0; i<5; i++) {
			System.out.println(queue.dequeue());
		}
		
	}
}
