package ch4;

public class solution05 {
	
	public boolean isValidBST(TreeNode root) {
        return helper(root, -Float.MAX_VALUE, Float.MAX_VALUE);
    }
    
    public boolean helper(TreeNode root, Float min, Float max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        if (!helper(root.left, min, (float) root.val) ||
            !helper(root.right, (float) root.val, max))
            return false;
        return true;
    }

}