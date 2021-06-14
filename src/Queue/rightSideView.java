package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightSideView {
    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
    //通过bfs算法， 广度优先
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i<size; i++){
                TreeNode node  = queue.poll();
                if(node.left!= null){
                    queue.offer(node.left);
                }
                if(node.right!= null){
                    queue.offer(node.right);
                }
                if(i == size-1){
                    res.add(node.val);
                }
            }


        }
        return res;

    }

    //来一个dfs， 深度优先
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideViewDFS(TreeNode root){
        dfs(root, 0);
        return result;

    }
    private void dfs(TreeNode root, int depth){
        if(root==null)
            return;
        if(depth==result.size()){
            result.add(root.val);
        }
        depth++;
        dfs(root.right, depth);
        dfs(root.left, depth);
    }
}
