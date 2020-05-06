package portfolio.datastructure.queue.queue;

import portfolio.datastructure.queue.exception.QueueOverflowError;
import portfolio.datastructure.queue.exception.QueueUnderflowError;

public class CircularQueue<E> implements QueueExample<E> {

	private E[] elements;
	private int front = 0;
	private int rear = 0;
	
	@SuppressWarnings("unchecked")
	public CircularQueue(int size) {
		this.elements = (E[]) new Object[size];
	}
	
	@Override
	public void enqueue(E e) {
		if(this.rear == elements.length) {
			if(elements[0] != null) {
				throw new QueueOverflowError();
			}
			this.rear = 0;
		}
		elements[this.rear++] = e;
	}

	@Override
	public E dequeue() {
		if(isEmpty() == true) {
			throw new QueueUnderflowError();
		}
		E e = elements[this.front];
		elements[this.front++] = null;
		if(this.front == elements.length) {
			this.front = 0;
		}
		return e;
	}
	
	@Override
	public boolean isEmpty() {
		return front == rear;
	}

}
