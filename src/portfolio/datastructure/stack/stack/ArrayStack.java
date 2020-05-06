package portfolio.datastructure.stack.stack;

public class ArrayStack<E> implements StackExample<E> {
	
	private int top = -1;
	private E[] elements;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		this.elements = (E[]) new Object[size];
	}
	
	@Override
	public void push(E e){
		if(this.top == elements.length) {
			throw new StackOverflowError();
		}
		elements[++this.top] = e;
	}

	@Override
	public E pop(){
		if(isEmpty() == true) {
			throw new NullPointerException();
		}
		E e = elements[this.top];
		elements[this.top--] = null;
		return e;
	}

	@Override
	public boolean isEmpty(){
		return top < 0;
	}
}
