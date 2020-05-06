package portfolio.datastructure.stack.stack;

import java.util.LinkedList;
import java.util.List;

public class LinkedStack<E> implements StackExample<E> {
	
	private List<E> elementList = new LinkedList<>();
	
	@Override
	public void push(E e){
		elementList.add(e);
	}

	@Override
	public E pop(){
		if(isEmpty() == true) {
			throw new NullPointerException();
		}
		int topIndex = elementList.size()-1;
		E e = elementList.get(topIndex);
		elementList.remove(topIndex);
		return e;
	}

	@Override
	public boolean isEmpty(){
		return elementList.isEmpty();
	}
}
