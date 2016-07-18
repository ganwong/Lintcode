/**
 * Convert Sorted Array to Binary Search Tree With Minimal Height
 * 
 * Given a sorted (increasing order) array, Convert it to create a binary tree with minimal height.
 * 
 * Example
Given [1,2,3,4,5,6,7], return

     4
   /   \
  2     6
 / \    / \
1   3  5   7
 * 
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {
        if (A == null) return null;
        TreeNode root = buildTree(A, 0, A.length - 1);
        return root;
    }
    public TreeNode buildTree(int[] A, int left, int right) {
        if (left > right) return null;
        int mid = (left + right + 1) / 2;
        TreeNode node = new TreeNode(A[mid]);
        node.left = buildTree(A, left, mid - 1);
        node.right = buildTree(A, mid + 1, right);
        return node;
    }
}
