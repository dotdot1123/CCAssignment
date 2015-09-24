package ch4;

import java.util.*;


public class solution06 {
	
	private class TreeNode{
		public int val;
		public TreeNode left;
		public TreeNode right;
		public TreeNode parent;
		
		public TreeNode(int val) {
			this.val = val;
		}
		
	}
	
	public TreeNode successor(TreeNode node) {
		if(node == null) return null;
		if(node.right != null) {
			
			TreeNode p = node.right;
			while(p.left != null) {
				p = p.left;
			}
			return p;
		} else {
	
			while(node.parent.right == node && node.parent != null) {
				node = node.parent;
			}
			return node.parent;
		}
	}
	
	
	public TreeNode buildTree(int arr[]) {
		if(arr.length == 0) return null;
		
		TreeNode root = new TreeNode(arr[0]);
		int index = 0;
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		current.add(root);
		while(index < arr.length -1) {
			LinkedList<TreeNode> parents = current;
			current = new LinkedList<TreeNode>();
			for(TreeNode parent: parents) {
				if(++index < arr.length) {
					parent.left = new TreeNode(arr[index]);
					parent.left.parent = parent;
					current.add(parent.left);
				} else{
					break;
				}
				if(++index < arr.length) {
					parent.right = new TreeNode(arr[index]);
					parent.right.parent = parent;
					current.add(parent.right);
				} else{
					break;
				}
			}
		}
		
		return root;
	}
	
	
	public static void main(String[] args) {
		
		solution06 s = new solution06();
		int arr[] = {0, 1, 2, 3, 4, 5, 6};
		TreeNode root = s.buildTree(arr); 
		
		TreeNode node = s.successor(root.left);
		System.out.println(node.val);   
	}
}