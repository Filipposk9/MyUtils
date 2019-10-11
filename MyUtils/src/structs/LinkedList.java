package structs;

public class LinkedList<T>{
	
	private class Node<T>{
		private T item;
		private Node<T> next;
		
		public Node(T item, Node<T> next){
			this.item = item;
			this.next = next;
		}
	}
	
	private Node<T> head;
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insert(T item){
		head = new Node<T>(item, head);
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
