package ch4;

import java.util.Random;

public class solution11 {
	public static class Tree{
		TreeNode root=null;
		public int size(){
			if(root==null){
				return 0;
			}else{
				return root.size();
			}
		}
		public TreeNode getRandomNode(){
			if(root==null){
				return null;
			}
			Random random=new Random(); 
			int i=random.nextInt(size()); 
			return root.getIthNode(i);
		}
		
		public void insertInOrder(int value) {
			if(root == null) {
				root = new TreeNode(value);
			}else{
				root.insertInOrder(value);
			}
		}
	}
	static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		private int size=0;
		TreeNode(int data){
			this.data=data;
			left=null;
			right=null;
		}
		public TreeNode getIthNode(int i){  
			
			int leftSize=left==null? 0: left.size();    //pre-order traversal.
			if(i<leftSize){
				return left.getIthNode(i);
			}else if(i==leftSize){
				return this;
			}else{
				return right.getIthNode(i-(leftSize+1));
			}
		}
		public int size(){
			return size;
		}
		public void insertInOrder(int d){
			if(d<=data){
				if(left==null){
					left=new TreeNode(d);
				}else{
					left.insertInOrder(d);
				}	
			}else{
				if(right==null){
					right=new TreeNode(d);
				}else{
					right.insertInOrder(d);
				}
			}
			size++;
		}
		public TreeNode find(int d){
			if(d==data){
				return this;
			}else if(d<=data){
				return left !=null? left.find(d) : null;
			}else if(d>data){
				return right !=null? right.find(d) : null;
			}
			return null;
		}
	}	
	 
}