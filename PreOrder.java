class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
    this.value=value;
    left = right = null;
    }
}
public class PreOrder {
    public void preorder(TreeNode node){
        if(node == null){                   //PreOrder Traversal:
            return;                         //root=>left=>right
        }
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        PreOrder tree=new PreOrder();
        System.out.print("PreOrder Traversal: ");
        tree.preorder(root);
    }
    
}
/*
  Ouput:
       PreOrder Traversal: 1 2 4 5 3 
 */
