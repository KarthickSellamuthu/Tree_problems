class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
    this.value=value;
    left = right = null;
    }
}
public class PostOrder {
    public void postorder(TreeNode node){
        if(node == null){
            return;                          //Postorder traversal
        }                                    //left=>right=>root
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");
    }
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        PostOrder tree=new PostOrder();
        System.out.print("PostOrder Traversal: ");
        tree.postorder(root);
    }
    
}
/* 
 Output:
        PostOrder Traversal: 4 5 2 3 1 
 */
