package workToOffer;

import java.util.Stack;


/** 
* Created by zhanghuali on 2017年12月8日. 
*/
public class Convert {
	public TreeNode convert(TreeNode pRootOfTree)
	{
		if(pRootOfTree==null)
		{
			return null;
		}
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode p=pRootOfTree;
		TreeNode pre=null;   //保存中序遍历序列的上一个结点
		boolean isFirst=true;
		while(p!=null||!stack.isEmpty())
		{
			while(p!=null)
			{
				stack.push(p);
				p=p.left;
			}
			p=stack.pop();
			if(isFirst)
			{
				pRootOfTree=p;
				pre=pRootOfTree;
				isFirst=false;
			}
			else {
				pre.right=p;
				p.left=pre;
				pre=p;
			}
			p=p.right;
		}
		return pRootOfTree;
		
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
        		System.out.print(node.value+" ");
        		node=node.right;
        	}
        	System.out.println();
//        	while(node!=null)
//        	{
//        		System.out.print(node.value+" ");
//        		node=node.left;
//        	}
		}
        
        
	}

}
