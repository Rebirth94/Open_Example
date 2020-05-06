package portfolio.datastructure.queue.queue;

public interface QueueExample<E> {
	void enqueue(E e);		// 데이터 입력
	E dequeue();			// 데이터 출력
	boolean isEmpty();	// 비었는지 확인
}

