package workToOffer1;

/** 
* Created by zhanghuali on 2017年12月9日. 
*/
public class Convert {
	protected TreeNode leftLast=null;
	public TreeNode convert(TreeNode root)
	{
		if(root==null)
		{
			return null;
		}
		if(root.left==null&&root.right==null)
		{
			leftLast=root;
			return root;
		}
		TreeNode left =convert(root.left);
		if(left!=null)
		{
			leftLast.right=root;
			root.left=leftLast;
		}
		leftLast=root;
		TreeNode right=convert(root.right);
		if(right!=null)
		{
			right.left=root;
			root.right=right;
		}
		return left!=null?left:root;
		
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);  
        TreeNode t1 = new TreeNode(6);  
        TreeNode t2 = new TreeNode(14);  
        TreeNode t3 = new TreeNode(4);  
        TreeNode t4 = new TreeNode(8);  
        TreeNode t5 = new TreeNode(12);  
        TreeNode t6 = new TreeNode(16);  
        root.left=t1; 
        t1.left=t3;
        t1.right=t4;
        t3.left=null;
        t3.right=null;
        t4.left=null;
        t4.right=null;
        root.right=t2;
        t2.left=t5;
        t2.right=t6;
        t5.left=null;
        t5.right=null;
        t6.left=null;
        t6.right=null;
        
        
        TreeNode node=new Convert().convert(root);
        if(node==null)
        {
        	System.out.println("invalid node");
        }else {
        	while(node!=null)
        	{
        		
        		if(node.left!=null)
        		{
        			System.out.print(node.left.val+" ");
        			if(node.right==null)
        			{
        				System.out.print(node.val+" ");
        			}
        		}
        		System.out.print(node.val+" ");
        		node=node.right;

        	}
        	System.out.println();
		}
	
	}
}

//class TreeNode
//{
//	int value;
//	TreeNode right;
//	TreeNode left;
//	TreeNode(int val) {
//		// TODO Auto-generated constructor stub
//		this.value=val;
//	}
//}
