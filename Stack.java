package algo.list;

public class Stack<T> extends LinkedList<T>{
	private boolean isEmpty;
	public Stack() {
		isEmpty = true;
	}
	public void push(T data) {
		Node current = new Node(data);
		if(root == null) {
			root = current;
			isEmpty = false;
		}else {
			Node temp = root;
			root = current;
			root.setNext(temp);
		}
	}
	@SuppressWarnings("unchecked")
	public T pop() {
		if(root == null) {
			throw new NullPointerException("list is empty");
		}
		Node top = root;
		root = root.getNext();
		if(root == null) {
			isEmpty = true;
		}
		return (T)top.getData();
	}
	@SuppressWarnings("unchecked")
	public T peek() {
		if(isEmpty) {
			throw new NullPointerException("list is empty");
		}
		return (T)root.getData();
	}
	public boolean isEmpty() {
		return isEmpty;
	}
}
