package workToOffer;

import java.util.Arrays;

/** 
* Created by zhanghuali on 2017年12月4日. 
*/
public class VerifySquenceOfBST {
	public boolean verifySequenceOfBST(int []sequence)
	//二叉线索树：节点的左子树比其小，右子树都比其大
	{
		if(sequence==null||sequence.length<=0)
		{
			return false;
		}
		boolean result =false;
		int length=sequence.length;
		int root=sequence[length-1];
		int i=0;
		for(;i<length-1;i++)
		{
			if(sequence[i]>root)
				break;
		}
		int j=i;
		for(;j<length-1;j++)
		{
			if(sequence[j]<root)
				return false;
		}
		
		boolean left=true;
		if(i>0)
		{
			if(length==1)
				return true;
			int []lefttemp=new int[i];
			System.arraycopy(sequence, 0, lefttemp, 0,lefttemp.length);
			left=verifySequenceOfBST(lefttemp);
		}
		
		boolean right = true;
	        if (i<length-1){
	            if (length==1)
	                return true;
	            int[] rightTemp = new int[length-1-i];
	            System.arraycopy ( sequence,i,rightTemp,0,rightTemp.length );
//	            System.out.println ( Arrays.toString (seqTemp));
	            right = verifySequenceOfBST ( rightTemp );
	        }

	        result = left && right;
	        return result;		
	}
	public static void main(String[] args) {
//		int []s= {5,7,6,9,11,10,8};
		int[]s={5,7,4,6,9,11,10,8};
//		int[]s={5,7,6,8};
//		int[]s={9,11,10,8};
//		int[]s={};
		boolean result=new VerifySquenceOfBST().verifySequenceOfBST(s);
		System.out.println("is the BST ?:"+result);
	}
}
