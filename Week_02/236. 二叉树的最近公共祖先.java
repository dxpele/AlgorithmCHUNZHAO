// 1.递归  后序遍历DFS  O(n) O(n)
class Solution {
    //所有的递归的返回值有4种可能性，null、p、q、公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //当遍历到叶结点后就会返回null 
        //当找到p或者q的是时候就会返回pq
        /*当然，值得一提的是，如果公共祖先是自己（pq），并不需要寻找另外
        一个，我们在执行前序遍历会先找上面的，后找下面的，我们会直接返回公共祖先。*/
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if(left == null && right == null) return null; // 1.
        //还有一种可能就是，由下面返回的公共祖先，并将这个值一路返回到最表层
        if(left == null) return right; // 3.
        //否则我们返回已经找到的那个值（存储在left，与right中），p或者q
        if(right == null) return left; // 4.
        //如果左右都存在，就说明pq都出现了，这就是，公共祖先，此时不用考虑公共祖先是自己的情况，因为上面已经做过判断了。
        return root; // 2. if(left != null and right != null)
    }
}
