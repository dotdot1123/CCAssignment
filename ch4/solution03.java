package ch4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode(int x) {val = x; left = null; right = null;}
}


public class solution03 {
	public List<List<Integer>> listOfDepth(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        List<TreeNode> queue1 = new ArrayList<TreeNode>();
        List<TreeNode> queue2 = new ArrayList<TreeNode>();
        queue1.add(root);
        while (!queue1.isEmpty()) {
            List<Integer> tmp = new LinkedList<Integer>();
            for (int i = 0; i < queue1.size(); ++i) {
            	TreeNode node = queue1.get(i);
                tmp.add(node.val);
                if (node.left != null) queue2.add(node.left);
                if (node.right != null) queue2.add(node.right);
            }
            res.add(tmp);
            queue1 = queue2;
            queue2 = new ArrayList<TreeNode>();
        }
        return res;
    }
	
	public static void main(String[] args) {
		solution03 sl = new solution03();
		TreeNode l1 = new TreeNode(0);
		TreeNode l2 = new TreeNode(1);
		TreeNode l3 = new TreeNode(2);
		TreeNode l4 = new TreeNode(3);
		TreeNode l5 = new TreeNode(4);
		TreeNode l6 = new TreeNode(5);
		l1.left = l2; l1.right = l3;
		l2.left = l4; l2.right = l5;
		l4.left = l6;

		List<List<Integer>> queue = sl.listOfDepth(l1);
		System.out.println(queue);
	}
}
