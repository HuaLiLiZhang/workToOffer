package workToOffer;
/** 
* Created by zhanghuali on 2017年11月26日. 
*/
public class ReConstructBinaryTree {
	public static void main(String[] args) 
	{
		int preOrder[]= {1,2,4,7,3,5,6,8};
		int inOrder[]= {4,7,2,1,5,3,8,6};
		TreeNode root=constructTree(preOrder,inOrder);
		System.out.println("前序遍历");
		preOrderPrintTree(root);
		System.out.println();
		System.out.println("中序遍历");
		inOrderPrintTree(root);
		System.out.println();
		System.out.println("后序遍历");
		printPostOrder(root);
		
	}
	public static TreeNode constructTree(int pre[],int in[])
	{
		TreeNode root =reconstructTree(pre,0,pre.length-1,in,0,in.length-1);
		return root;
	}
	private static TreeNode reconstructTree(int pre[],int startpre,int endpre,int in[],int startin,int endin )
	{
		if (startpre>endpre||startin>endin)
		{
			return null;
		}
		TreeNode root=new TreeNode(pre[startpre]);
		for (int i=startin;i<=endin;i++)
		{
			if (in[i]==pre[startpre])
			{
				root.left=reconstructTree(pre, startpre+1, startpre+i-startin, in, startin, i-1);
				root.right=reconstructTree(pre, i-startin+startpre+1, endpre, in, i+1, endin);
			}
		}
		return root;
		
	}
	
	public static void preOrderPrintTree(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print (root.value+" ");
        preOrderPrintTree ( root.left );
        preOrderPrintTree ( root.right );
    }

    public static void inOrderPrintTree(TreeNode root){
        if (root == null){
            return;
        }
        inOrderPrintTree ( root.left );
        System.out.print (root.value+" ");
        inOrderPrintTree ( root.right );
    }
	
	public static void printPostOrder(TreeNode root)
	{
		if(root!=null)
		{
			printPostOrder(root.left);
			printPostOrder(root.right);
			System.out.print(root.value+" ");
		}
	}

}

class TreeNode
{
	int value;
	TreeNode right;
	TreeNode left;
	TreeNode(int val) {
		// TODO Auto-generated constructor stub
		this.value=val;
	}
}
