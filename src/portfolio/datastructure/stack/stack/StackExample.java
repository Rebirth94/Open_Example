package portfolio.datastructure.stack.stack;

public interface StackExample<E> {
	void push(E e);		// 데이터 입력
	E pop();			// 데이터 출력
	boolean isEmpty();	// 비었는지 확인
}
