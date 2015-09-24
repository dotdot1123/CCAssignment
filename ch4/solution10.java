package ch4;

public class solution10 {

    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        if (T2 == null) {
            return true;
        }
        return subTree(T1, T2);
    }

    public boolean subTree(TreeNode T1, TreeNode T2) {
        if (T1 == null) {
            return false;
        } else if (T1.val == T2.val && checkSubtree(T1, T2)) {
           
            return true;
        }
        
        return subTree(T1.left, T2) || subTree(T1.right, T2);
    }

    public boolean checkSubtree(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        } else if (A == null || B == null) {
            return false;
        }
        return A.val == B.val
            && checkSubtree(A.left, B.left)
            && checkSubtree(A.right, B.right);
    }
}
