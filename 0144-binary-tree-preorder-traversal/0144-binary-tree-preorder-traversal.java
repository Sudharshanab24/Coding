/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public static List<Integer> preorder(TreeNode root,ArrayList<Integer> arr)
    {
         if(root==null)
         return arr;

         arr.add(root.val);
         preorder(root.left,arr);
         preorder(root.right,arr);

         return arr;
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        return preorder(root,new ArrayList<>());
        
    }
}