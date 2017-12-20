package workToOffer1;


/** 
* Created by zhanghuali on 2017Äê12ÔÂ4ÈÕ. 
*/
public class VerifySquenceOfBST {
	public boolean verifySequenceOfBST(int[]sequence)
	{
		if(sequence==null||sequence.length==0)
			return false;
		if(sequence.length==1)
			return true;
		
		return verify(sequence,0,sequence.length-1);
	}
	public boolean verify(int[]seq,int start,int root)
	{
		if(start>=root)
			return true;
		int i=root;
		while(i>start&&seq[i-1]>seq[root])
			i--;
		for(int j=start;j<i-1;j++)
		{
			if(seq[j]>seq[root])
			{
				return false;
			}
		}
		return verify(seq, start, i-1)&&verify(seq, i, root-1);
	}
	
	public static void main(String[] args) {
		int []s= {5,7,6,9,11,10,8};
//		int[]s={5,7,4,6,9,11,10,8};
//		int[]s={5,7,6,8};
//		int[]s={9,11,10,8};
//		int[]s={};
		boolean result=new VerifySquenceOfBST().verifySequenceOfBST(s);
		System.out.println("is the BST ?:"+result);
	}

}
