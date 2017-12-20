package workToOffer;
/** 
* Created by zhanghuali on 2017年12月4日. 
*/
import java.util.*;
public class PrintFromTopToBottom {
	public ArrayList<Integer> printFromTopToBttom(TreeNode root)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();  
		//arr定义一定得在前面，并且root=null时
//		要返回arr，才满足{}的情况。还有root=null
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		if(root==null)
		{
			return arr;
		}
		if(root.left==null&&root.right==null)
		{
			arr.add(root.value);
			return arr;
		}
		queue.add(root);
		while(queue.size()!=0)
		{
			TreeNode node=queue.peek();
			queue.poll();
			
			if(node.left!=null)
			{
				queue.add(node.left);
			}
			if(node.right!=null)
			{
				queue.add(node.right);
			}
			arr.add(node.value);
		}
		return arr;
	}

}
