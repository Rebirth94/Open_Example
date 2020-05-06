package portfolio.datastructure.queue.queue;

import portfolio.datastructure.queue.exception.QueueOverflowError;
import portfolio.datastructure.queue.exception.QueueUnderflowError;

public class LinearQueue<E> implements QueueExample<E> {

	private E[] elements;
	private int front = 0;
	private int rear = 0;
	
	@SuppressWarnings("unchecked")
	public LinearQueue(int size) {
		this.elements = (E[]) new Object[size];
	}
	
	@Override
	public void enqueue(E e) {
		if(this.rear == elements.length) {
			throw new QueueOverflowError();
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
		return e;
	}

	@Override
	public boolean isEmpty() {
		return front == rear;
	}

}
