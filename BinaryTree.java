 
public class BinaryTree 
{ 

    // Root of Binary Tree 
	Nodee root; 
  
    BinaryTree() 
    { 
        root = null; 
    } 
  
    /* Given a binary tree, print its Nodeees according to the 
      "bottom-up" postorder traversal. */
    void printPostorder(Nodee node) 
    {  
    	if (node == null) 
            return; 
  
        // first recur on left subtree 
        printPostorder(node.left); 
  
        // then recur on right subtree 
        printPostorder(node.right); 
  
        // now deal with the node 
        System.out.print(node.key + " "); 
    } 
  
   
  
    // Wrappers over above recursive functions 
    void printPostorder()  {     printPostorder(root);  } 
   
    // Driver method 
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Nodee(1); 
        tree.root.left = new Nodee(2); 
        tree.root.right = new Nodee(3); 
        tree.root.left.left = new Nodee(4); 
        tree.root.left.right = new Nodee(5); 
  
        
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(); 
    }
} 