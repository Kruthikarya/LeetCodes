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
    public List<List<Integer>> levelOrder(TreeNode root) {
List<List<Integer>> result= new ArrayList<>();
//base case
if(root==null)return result;
//make queue
Queue<TreeNode> queue=new LinkedList<>();
//add root into queue
queue.add(root);
while(!queue.isEmpty()){
    List<Integer> loop=new ArrayList<>();
    int levelup= queue.size();
    for(int i=0;i<levelup;i++){
        TreeNode pollu=queue.poll();
        loop.add(pollu.val);
        if(pollu.left!=null)queue.add(pollu.left);
        if(pollu.right!=null)queue.add(pollu.right);
    }
    result.add(loop);
}
return result;

    }
    }
   