package algo.list;


public class LinkedList<T> {
	protected Node root;
	public void add(T data) {
		Node current = new Node(data);
		if(root == null) {
			root = current;
		}
		else {
			Node iterator = root;
			while(iterator.getNext() != null) {
				iterator = iterator.getNext();
			}
			iterator.setNext(current);
		}
	}
	@SuppressWarnings("unchecked")
	public T get(int index) {
		Node iterator = root;
		for(int i = 0; i < index; i++) {
			iterator = iterator.getNext();
		}
		return (T) iterator.getData();
	}
	public int size() {
		Node iterator = root;
		int size = 0;
		while(iterator != null) {
			iterator = iterator.getNext();
			size++;
		}
		return size;
	}
	public void remove(int index) {
		if(index == 0) {
			root = root.next;
		}
		Node currentNode = root;
		Node previousNode = root;
		for(int i = 0; i < index; i++) {
			currentNode = currentNode.next;
			previousNode = (i == index-1) ? previousNode:previousNode.next;
		}
		if(index == size()) {
			previousNode.next = null;
		}else {
			previousNode.next = currentNode.next;
		}
		
	}
	class Node {
		private Object data;
		private Node next;
		public Node(Object data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Object getData() {
			return data;
		}
	}
}

