package structs;

public class DoubleLinkedList<T>{
	
	private class Node<T>{
		private T item;
		private Node<T> next;
		private Node<T> previous;
		
		public Node(T item, Node<T> next, Node<T> previous){
			this.item = item;
			this.next = next;
			this.previous = previous;
		}
	}
	
	private Node<T> head;
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insert(T item){
		if (isEmpty())
			head = new Node<T>(item, null, null);
		else{
			Node<T> temp = new Node(item, head, null);
			head.previous = temp;
			head = temp;
		}
	}
	
	public int size(){
		int size = 0;
		for (Node<T> position = head; position != null; position = position.next)
			size++;
		return size;
	}
	
	public void printList(){
		for (Node<T> position = head; position != null; position = position.next)
			System.out.println(position.item);
	}
}
