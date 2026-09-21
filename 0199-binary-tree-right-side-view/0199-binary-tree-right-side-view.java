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
     List<Integer> result =new ArrayList<>();
     if(root==null) return result;
      //make queue
      Queue<TreeNode> queue= new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
        int levelup=queue.size();
        List<Integer> refer=new ArrayList<>();
        for(int i=0;i<levelup;i++){
            TreeNode node= queue.poll();
            if(i==levelup-1){
                result.add(node.val);
            }
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }
      }
      return result;
    }
}