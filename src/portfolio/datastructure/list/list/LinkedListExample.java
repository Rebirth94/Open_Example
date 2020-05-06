package portfolio.datastructure.list.list;

import portfolio.datastructure.list.data.NodeExample;

public class LinkedListExample<E> implements ListExample<E> {

	private NodeExample<E> head;
	
	@Override
	public void add(E e) {
		NodeExample<E> addNode = new NodeExample<>(e);
		if(this.head == null) {
			this.head = addNode;
		} else {
			NodeExample<E> nextNode = this.head;
			while(nextNode.getNextNode() != null){
				nextNode = nextNode.getNextNode();
			}
			nextNode.setNextNode(addNode);
		}
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		NodeExample<E> findNode = this.head;
		for(int i=0; i<index; i++) {
			findNode = findNode.getNextNode();
		}
		return findNode.getData();
	}

	
}
