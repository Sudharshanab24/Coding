class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        // If one of the subtrees is null, return the non-null subtree's depth + 1
        if (root.left == null) return 1 + rightDepth;
        if (root.right == null) return 1 + leftDepth;

        // If both subtrees exist, return the minimum depth
        return 1 + Math.min(leftDepth, rightDepth);
    }
}
