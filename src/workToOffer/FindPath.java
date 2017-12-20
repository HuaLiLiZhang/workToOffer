package workToOffer;
/** 
* Created by zhanghuali on 2017年12月4日. 
*/

import java.util.ArrayList;

public class FindPath {
	public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target)
	{
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		if(root==null)
			return list;
		find(list,new ArrayList<Integer>(),root,target);
		return list;
	}
	public void find(ArrayList<ArrayList<Integer>> list,
			ArrayList<Integer> list1,TreeNode root,int target)
	{
		list1.add(root.value);
		if(root.left==null&&root.right==null)
		{
			if(target==root.value)
			{
				list.add(list1);
			}
			return;
		}
		ArrayList<Integer> list2=new ArrayList<>();
		list2.addAll(list1);  //将list1中所有元素添加到list2的尾部
		if(root.left!=null)
			find(list, list1, root.left, target-root.value);
		if(root.right!=null)
			find(list, list2, root.right, target-root.value);
		
	}
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);  
		TreeNode t1 = new TreeNode(6);  
		TreeNode t2 = new TreeNode(10);  
		TreeNode t3 = new TreeNode(4);  
		TreeNode t4 = new TreeNode(7);  
		
        root.left=t1;  
        root.right=t2;  
        t1.left=t3;  
        t1.right=t4;  
        t2.left=null;  
        t2.right=null;  
        t3.left=null;  
        t3.right=null;  
        t4.left=null;  
        t4.right=null;  
        
        ArrayList<ArrayList<Integer>> arrayList = new FindPath().findPath(root,18);
        if(arrayList==null)
        {
        	System.out.println("invalid ");
        }else {
        	for (ArrayList<Integer> list : arrayList) 
        	{
        	    for (Integer i : list) 
        	    {
        	        System.out.print(i+" ");
        	    }
        	    System.out.println();
        	}
		}
	}
	
	

}
