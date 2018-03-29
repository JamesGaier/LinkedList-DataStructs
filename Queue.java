public class Queue<T> extends DoublyLinkedList<T>{
	public void enqueue(T data) {
		Node insertionNode = new Node(data);
		if(head == null) {
			head = insertionNode;
			tail = head;
		}else {
			tail.setRight(insertionNode);
			insertionNode.setLeft(tail);
		}
	}
	@SuppressWarnings("unchecked")
	public T dequeue() {
		Node temp = tail;
		//Switch to remove from LEFT side (head.getRight())
		tail = tail.getLeft();
		return (T)temp.getData();
	}
}
