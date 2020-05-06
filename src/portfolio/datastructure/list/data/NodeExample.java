package portfolio.datastructure.list.data;

public class NodeExample<E> {
	private E data;
	private NodeExample<E> nextNode;	// 다음노드
	private NodeExample<E> prevNode;	// 이전노드
	
	public NodeExample(E data) {
		this.data = data;
	}
	
	public NodeExample(E data, NodeExample<E> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public NodeExample(E data, NodeExample<E> nextNode, NodeExample<E> prevNode) {
		this.data = data;
		this.nextNode = nextNode;
		this.nextNode = prevNode;
	}
	
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public NodeExample<E> getNextNode() {
		return nextNode;
	}
	public void setNextNode(NodeExample<E> nextNode) {
		this.nextNode = nextNode;
	}
	public NodeExample<E> getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(NodeExample<E> prevNode) {
		this.prevNode = prevNode;
	}
	
	
}
