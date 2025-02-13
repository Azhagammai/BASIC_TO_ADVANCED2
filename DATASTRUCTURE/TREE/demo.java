package DATASTRUCTURE.TREE;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value){
        this.value=value; 
        this.left=null;
        this.right=null;

    }
}
class BinaryTree{
    TreeNode root;
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
 }
 public void preorder(TreeNode root){
    if(root == null){
        return;
    }
    System.out.print(root.value+" ");
    preorder(root.left);
    preorder(root.right);

 }
 public void postorder(TreeNode root){
    if(root == null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.value+" ");
 }
}
public class demo{
    public static void main(String args[]){
        BinaryTree tree=new BinaryTree();
        tree.root=new TreeNode(1);
        tree.root.left=new TreeNode(2);
        tree.root.right=new TreeNode(3);
        System.out.println("In-order Traversal");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("Pre-order Traversal");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println("Post-order Traversal");
        tree.postorder(tree.root);
    }
}
