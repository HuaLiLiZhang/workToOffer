package workToOffer;

import java.util.Arrays;

/** 
* Created by zhanghuali on 2017年11月30日. 
*/
public class ReOrderArray {
	public static void main(String[] args) {
		int [] integ= {1,2,3,4,5,6};
//		int [] integ= {2,4,6,8,1,3,5,7,10};
//		int [] integ= {};
//		int [] integ= null;
		ReOrderArray reOrderArray=new ReOrderArray();
		reOrderArray.reorder(integ);
//		System.out.println("奇数位于偶数前："+Arrays.toString(integ));
	}
	public void reorder (int []arr)
	{
		if(arr==null||arr.length==0)
		{
			System.out.println("the invalid array");
			return ;
		}
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right)
		{
			if((arr[left]&1)==1)
				left++;
			else if ((arr[right]&1)==1) {
				swap(arr,left,right);
				left++;
				right--;
			} else {
				right--;
			}
		}
		System.out.println("奇数位于偶数前："+Arrays.toString(arr));
		
		
	}
	public void swap(int[]arr,int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
