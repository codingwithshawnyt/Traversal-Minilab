
//Name: Shawn Ray
//Class Period: 4


/*************************************
 * Mini-Lab: Tree Traversal
 *
 * Given a tree, create recursive print 
 * methods for each traversal pattern.
 *
 *	pre-, in-, & post- order
 *
 *************************************/

public class TreesTraversalMiniLab
{
		
	public static void main (String[] args) 
	{
		//Creating the Tree
		IntTreeNode overallRoot = new IntTreeNode(17);
		overallRoot.left = new IntTreeNode(41, new IntTreeNode(29), new IntTreeNode(6));
		overallRoot.right = new IntTreeNode(9, new IntTreeNode(81), new IntTreeNode(40));
		
		//CALL the 3 print methods using the overallRoot
		printPreOrder(overallRoot);
		System.out.println();
		printPostOrder(overallRoot);
		System.out.println();
		printInOrder(overallRoot);
	}
	
	public static void printPreOrder(IntTreeNode root){
		/* Prints the given tree using the pre-order pattern
		 */
		if (root == null)
            return;
 
        // First print data of node
        System.out.print(root.data + " ");
 
        // Then recur on left subtree
        printPreOrder(root.left);
 
        // Now recur on right subtree
        printPreOrder(root.right);
	}
	
	public static void printInOrder(IntTreeNode root){
		/* Prints the given tree using the in-order pattern
		 */
		if (root == null)
            return;
 
        // First recur on left child
		printInOrder(root.left);
 
        // Then print the data of node
        System.out.print(root.data + " ");
 
        // Now recur on right child
        printInOrder(root.right);
	}
	
	public static void printPostOrder(IntTreeNode root){
		/* Prints the given tree using the pre-order pattern
		 */
		if (root == null)
            return;
		 
        // Now recur on right subtree
        printPostOrder(root.left);
 
        // Then recur on left subtree
        printPostOrder(root.right);
        
        // First print data of node
        System.out.print(root.data + " ");
	}

}

class IntTreeNode
{
	public int data;            // data stored at this node
    public IntTreeNode left;    // reference to left subtree
    public IntTreeNode right;   // reference to right subtree
        
    // Constructs a leaf node with the given data.
    public IntTreeNode(int data) {
        this(data, null, null);
    }
                
    // Constructs a branch node with the given data and links.
    public IntTreeNode(int data, IntTreeNode left,
                                 IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}