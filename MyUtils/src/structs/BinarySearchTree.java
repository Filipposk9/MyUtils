package structs;

public class BinarySearchTree<T extends Comparable<T>>{
	
	private class TreeNode<T>{
		private T item;
		private TreeNode<T> leftNode;
		private TreeNode<T> rightNode;
		
		public TreeNode(T item){
			this.item = item;
		}
		
		public boolean isLeaf(){
			return leftNode == null && rightNode == null;
		}
	}
	
	private TreeNode<T> root;
	
	public void insertElement(T item){
		if (isEmpty())
			root = new TreeNode<T>(item);
		else
			insertElement(item, root);
	}
	
	private void insertElement(T item, TreeNode<T> node){
		if (item.compareTo(node.item) < 0)
			if (node.leftNode == null)
				node.leftNode = new TreeNode<T>(item);
			else
				insertElement(item, node.leftNode);
		else
			if (node.rightNode == null)
				node.rightNode = new TreeNode<T>(item);
			else
				insertElement(item, node.rightNode);
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public void preOrderTraversal(){
		preOrderTraversal(root);
	}
	
	private void preOrderTraversal(TreeNode<T> node){
		if (node == null)
			return;
		System.out.println(node.item);
		preOrderTraversal(node.leftNode);
		preOrderTraversal(node.rightNode);
	}
	
	public void inOrderTraversal(){
		inOrderTraversal(root);
	}
	
	private void inOrderTraversal(TreeNode<T> node){
		if (node == null)
			return;
		inOrderTraversal(node.leftNode);
		System.out.println(node.item);
		inOrderTraversal(node.rightNode);
	}
	
	public void postOrderTraversal(){
		postOrderTraversal(root);
	}
	
	private void postOrderTraversal(TreeNode<T> node){
		if (node == null)
			return;
		preOrderTraversal(node.leftNode);
		preOrderTraversal(node.rightNode);
		System.out.println(node.item);
	}
	
	public int size(){
		return size(root);
	}
	
	private int size(TreeNode<T> node){
		if (node == null)
			return 0;
		return 1 + size(node.leftNode) + size(node.rightNode);
	}
	
	public int height(){
		return height(root);
	}
	
	private int height(TreeNode<T> node){
		if (node == null)
			return 0;
		return 1 + Math.max(height(node.leftNode), height(node.rightNode));
	}
	
	public boolean equals(BinarySearchTree<T> bst){
		return equals(root, bst.root);
	}
	
	private boolean equals(TreeNode<T> node1, TreeNode<T> node2){
		if (node1 == node2)
			return true;
		if (node1 == null || node2 == null)
			return false;
		return node1.item.equals(node2.item) && equals(node1.leftNode, node2.leftNode) && equals(node1.rightNode, node2.rightNode);
	}
}
