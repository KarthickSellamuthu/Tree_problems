// node class for BST
class Node{
    int key;
    Node left,right;
    public Node(int item){
        key = item;
        left = right =null;
}
}
// Binary Search Tree class
 class binarySearchTree {
    // Root of BST
    Node root;
    // Constructor
    binarySearchTree(){
        root = null;
}
// Method to insert a key in BST
      void insert(int key){
        root =insertRec(root,key);
      }
    // Recursion Function to insert a new Key in BST
      Node insertRec(Node root,int key){
        // if tree is empty,return a new node
        if(root==null){
            root = new Node(key);
            return root;
        }
        // otherwise,recursion down the tree
        if(key<root.key)
          root.left=insertRec(root.left,key);
        else if(key>root.key)
        root.right=insertRec(root.right,key);
        // return the node pointer
        return root;  
      }
      Node findMinimum(Node root){
        if(root == null|| root.left==null)
        return root;
        return findMinimum(root.left);
      }
      void inorder(){
        inorderRec(root);
      }
      void inorderRec(Node root){
        if(root !=null){
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);
        }
      }
      public static void main(String args[]){
        binarySearchTree tree=new binarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println("Inorder traversal of the BST:");
        tree.inorder();
        Node min=tree.findMinimum(tree.root);
        System.out.println();
        System.out.print("Smallest element in the BST:" +min.key);
      }
    
}
/*
 OUTPUT:
 norder traversal of the BST:
20 30 40 50 60 70 80 
Smallest element in the BST:20
 */
