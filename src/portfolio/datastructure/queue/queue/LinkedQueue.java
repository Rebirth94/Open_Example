package portfolio.datastructure.queue.queue;

import java.util.LinkedList;
import java.util.List;

import portfolio.datastructure.queue.exception.QueueUnderflowError;

public class LinkedQueue<E> implements QueueExample<E> {

	private List<E> elementList = new LinkedList<>();
	
	@Override
	public void enqueue(E e) {
		elementList.add(e);
	}

	@Override
	public E dequeue() {
		if(isEmpty() == true) {
			throw new QueueUnderflowError();
		}
		E e = elementList.get(0);
		elementList.remove(0);
		return e;
	}

	@Override
	public boolean isEmpty() {
		return elementList.isEmpty();
	}

}
