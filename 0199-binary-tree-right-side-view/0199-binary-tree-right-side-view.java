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
    public List<Integer> rightSideView(TreeNode root) {
     List<Integer> results= new ArrayList<>();
     if(root==null)return results;

     Queue<TreeNode> queue=new LinkedList<>();
     queue.add(root);

     while(!queue.isEmpty()){
        int level= queue.size();
        List<Integer> ref= new ArrayList<>();
        
        for(int i=0;i<level;i++){
            TreeNode polls= queue.poll();
            if(i==level-1){
                results.add(polls.val);
            }
            if(polls.left!=null)queue.add(polls.left);
            if(polls.right!=null)queue.add(polls.right);

        }
    
     }
     return results;
    }
}