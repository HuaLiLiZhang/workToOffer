package workToOffer;
/** 
* Created by zhanghuali on 2017年12月2日. 
*/
public class HasSubtree {
	public boolean hasSubTree(BinaryTreeNode root1,BinaryTreeNode root2)
	{
		boolean result=false;
		if(root1!=null&&root2!=null) 
		{
			if(root1.getValue()==root2.getValue())
				result=DoesTree1HaveTree2(root1,root2);
			if(!result)
			{
				result=hasSubTree(root1.getLeft(), root2);
			}
			if(!result)
			{
				result=hasSubTree(root1.getRight(), root2);
			}
		}
		return result;
	}
	public boolean DoesTree1HaveTree2(BinaryTreeNode root1,BinaryTreeNode root2)
	{
		if(root2==null)
		{
			return true;
		}
		if(root1==null)
		{
			return false;
		}
		if(root1.getValue()!=root2.getValue())
			return false;
		
		return DoesTree1HaveTree2(root1.getLeft(), root2.getLeft())&&
				DoesTree1HaveTree2(root1.getRight(), root2.getRight());
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
        
        BinaryTreeNode n3 = new BinaryTreeNode(6);  
        BinaryTreeNode n4 = new BinaryTreeNode(5);  
        BinaryTreeNode n5 = new BinaryTreeNode(7); 
        n3.setLeft(n4);
        n3.setRight(n5);
        n4.setLeft(null);
        n4.setRight(null);
        n5.setLeft(null);
        n5.setRight(null);
        
        boolean result=new HasSubtree().hasSubTree(root,n3);  
        System.out.println("result:"+result);
        // 前序遍历输出  
        printPreOrder(root);  
	}
	
	public static void printPreOrder(BinaryTreeNode root) {  
        if (root != null) {  
            System.out.print(root.getValue() + "、");  
            printPreOrder(root.getLeft());  
            printPreOrder(root.getRight());  
        }  
    }  

}
