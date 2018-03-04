package algo.list;

public class DoublyLinkedList<T> {
	protected Node head;
	protected Node tail;
	private int size = 0;
	public void add(T data) {
		Node right = new Node(data);
		if(head == null) {
			head = right;
			tail = head;
		}
		else {
			tail.right = right;
			right.left = tail;
			tail = right;
		}
		size++;
	}
	@SuppressWarnings("unchecked")
	public T get(int index) {
		Node iterator = head;
		for(int i = 0; i < index; i++) {
			iterator = iterator.right;
		}
		return (T)iterator.data;
	}
	public int size() {
		return size;
	}
	public void remove(int index) {
		if(index == 0) {
			head = head.right;
			return;
		}
		Node currentNode = head;
		for(int i = 0; i < index; i++) {
			currentNode = currentNode.right;
		}
		if(currentNode.equals(tail)) {
			currentNode.left.right = null;
			tail = currentNode.left;
		}else {
			currentNode.left.right = currentNode.right;
			currentNode.right.left = currentNode.left;
			
		}
	}
	class Node{
		private Object data;
		private Node left,right;
		public Node(Object data) {
			this.data = data;
		}
		public Object getData() {
			return data;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		
	}
}
