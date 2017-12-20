package workToOffer;
/** 
* Created by zhanghuali on 2017Äê12ÔÂ2ÈÕ. 
*/
public class Mirror {
	public void mirrir(BinaryTreeNode root)
	{
		if(root==null)
		{
			return;
		}
		if(root.getLeft()==null&&root.getRight()==null)
		{
			return;
		}
		swapLR(root);
		if(root.getLeft()!=null)
			mirrir(root.getLeft());
		if(root.getRight()!=null)
			mirrir(root.getRight());

	}
	public void swapLR(BinaryTreeNode root)
	{
		BinaryTreeNode temp=root.getLeft();
		root.setLeft(root.getRight());
		root.setRight(temp);
	}
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(8);  
        BinaryTreeNode t1 = new BinaryTreeNode(6);  
        BinaryTreeNode t2 = new BinaryTreeNode(10);  
        BinaryTreeNode t3 = new BinaryTreeNode(5);  
        BinaryTreeNode t4 = new BinaryTreeNode(7);  
        BinaryTreeNode t5 = new BinaryTreeNode(9);  
        BinaryTreeNode t6 = new BinaryTreeNode(11);  
        root.setLeft(t1);  
        root.setRight(t2);  
        t1.setLeft(t3);  
        t1.setRight(t4);  
        t2.setLeft(t5);  
        t2.setRight(t6);  
        t3.setLeft(null);  
        t3.setRight(null);  
        t4.setLeft(null);  
        t4.setRight(null);  
        t5.setLeft(null);  
        t5.setRight(null);  
        t6.setLeft(null);  
        t6.setRight(null);
        new Mirror().mirrir(root);
        printPreOrder(root);
	}
	public static void printPreOrder(BinaryTreeNode root) {  
        if (root != null) {  
            System.out.print(root.getValue() + "¡¢");  
            printPreOrder(root.getLeft());  
            printPreOrder(root.getRight());  
        }  
    }  


}
