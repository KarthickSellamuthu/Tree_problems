class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
    this.value=value;
    left = right = null;
    }
}
public class InOrder {
    public void inorder(TreeNode node){          //Inorder Traversal:
        if(node == null){                        //left=>root=>right
            return;
        }
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
    }
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        InOrder tree=new InOrder();
        System.out.print("InOrder Traversal: ");
        tree.inorder(root);
    }
    
}
/*
OUTPUT: 
       InOrder Traversal: 4 2 5 1 3 
 */
