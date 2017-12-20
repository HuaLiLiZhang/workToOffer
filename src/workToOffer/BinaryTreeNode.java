package workToOffer;
/** 
* @author zhanghuali: 
* @version ����ʱ�䣺2017��11��26�� ����9:46:56  
*/
public class BinaryTreeNode {
	private int value;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode(int value)
	{
		this.value=value;
	}
	public BinaryTreeNode(int value ,BinaryTreeNode left,BinaryTreeNode right)
	{
		this.value=value;
		this.left=left;
		this.right =right;
	}
	public int getValue()
	{
		return value;
	}
	public void setValue(int value)
	{
		this.value=value;
	}
	public BinaryTreeNode getLeft() 
	{  
        return left;  
    }  
  
    public void setLeft(BinaryTreeNode left) 
    {  
        this.left = left;  
    } 
    
	public BinaryTreeNode getRight()
	{
		return right;
	}
	public void setRight(BinaryTreeNode right)
	{
		this.right=right;
	}
	

}
