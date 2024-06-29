class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode (int value){
        this.value=value;
        left=right=null;
    }
}
public class LeafNodeCount {
    // function to count leaf node in a tree
    public int countLeafNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left==null&&root.right==null){
          return 1;
        }
        // recursively count leaf nodes in left and right subtree
        return countLeafNodes(root.left)+countLeafNodes(root.right);
    }
    public static void main(String args[]){
        // constructing a sample Binary tree
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        LeafNodeCount tree= new LeafNodeCount();
        int leafCount=tree.countLeafNodes(root);
        // print the no of leaf nodes in binary tree
        System.out.print("Number of leaf nodes in the tree : "+ leafCount);
    }
    
}
/*
 OUTPUT:
 Number of leaf nodes in the tree : 4
 */