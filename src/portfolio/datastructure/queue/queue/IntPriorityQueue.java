package portfolio.datastructure.queue.queue;

import java.util.TreeSet;

import portfolio.datastructure.queue.exception.QueueUnderflowError;

public class IntPriorityQueue<E extends Integer> implements QueueExample<E> {
	
	private static interface IntPriority{}
	private static class UP implements IntPriority{};
	private static class DOWN implements IntPriority{}

	public static final IntPriority UP = new UP();		// 오름차순
	public static final IntPriority DOWN = new DOWN();	// 내림차순
	
	private final IntPriority priority;
	
	private TreeSet<Integer> elementTree = new TreeSet<>();
	
	public IntPriorityQueue(IntPriority intPriority) {
		if(intPriority == null) {
			throw new NullPointerException();
		}
		this.priority = intPriority;
	}
	
	@Override
	public void enqueue(Integer e) {
		elementTree.add(e);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E dequeue() {
		if(isEmpty() == true) {
			throw new QueueUnderflowError();
		}
		
		E e = null;
		if(priority instanceof UP) {
			e = (E) elementTree.pollFirst();
		}else if(priority instanceof DOWN) {
			e = (E) elementTree.pollLast();
		}
		
		return e;
	}

	@Override
	public boolean isEmpty() {
		return elementTree.isEmpty();
	}

}
