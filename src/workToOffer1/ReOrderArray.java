package workToOffer1;

import java.util.Arrays;

/** 
* Created by zhanghuali on 2017Äê12ÔÂ1ÈÕ. 
*/


public class ReOrderArray {
	public void reorderArray(int []array)
	{
		if(array.length==0||array.length==1) 
			return;
		int oddcount=0,oddbegin=0;
		int []newarray=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			if((array[i]&1)==1)
				oddcount++;
		}
		for(int i=0;i<array.length;i++)
		{
			if((array[i]&1)==1)
			{
				newarray[oddbegin++]=array[i];
			}else {
				newarray[oddcount++]=array[i];
			}
		}
		for (int i=0;i<array.length;i++)
		{
			array[i]=newarray[i];
		}
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		ReOrderArray reOrderArray=new ReOrderArray();
		reOrderArray.reorderArray(arr);
		System.out.println("arr:"+Arrays.toString(arr));
	}

}
