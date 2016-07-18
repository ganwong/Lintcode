/**
 * Binary Tree Paths
 * 
 * Given a binary tree, return all root-to-leaf paths.
 * 
 * Example
Given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

[
  "1->2->5",
  "1->3"
]

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
    List<String> l = new ArrayList<>();
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null) {
            findPaths(root, String.valueOf(root.val));
        }
        return l;
        
    }
    public void findPaths(TreeNode node, String path) {
        if (node.left == null && node.right == null) {
            l.add(path);
        }
        if (node.left != null) {
            findPaths(node.left, path + "->" + String.valueOf(node.left.val));
        }
        if (node.right != null) {
            findPaths(node.right, path + "->" + String.valueOf(node.right.val));
        }
    }
    
}