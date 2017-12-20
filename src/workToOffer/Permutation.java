package workToOffer;

import java.util.ArrayList;
import java.util.Collections;

/** 
* Created by zhanghuali on 2017年12月9日. 
*/
public class Permutation {
	public ArrayList<String> permutation(String str)
	{
		ArrayList<String> res=new ArrayList<>();
		if(str!=null&&str.length()>0)
		{
			PermutationHelper(str.toCharArray(),0,res);  
			//toCharArray() 方法将字符串转换为字符数组。
			Collections.sort(res);  // Collections 类的 sort() 方法对向量进行排序
		}
		return res;
	}
	
	public static void PermutationHelper(char[] cs,int i,ArrayList<String> list)
	{
		if(i==cs.length-1)
		{
			list.add(String.valueOf(cs));
		}else {
			for(int j=i;j<cs.length;++j)
			{
				if(j==i||cs[j]!=cs[i])
				{
					swap(cs,i,j);	
					PermutationHelper(cs, i+1, list);
					swap(cs, i, j);
				}
			}
		}
	}
	public static void swap(char[] cs,int i, int j)
	{
		char temp=cs[i];
		cs[i]=cs[j];
		cs[j]=temp;
		
	}
	
	
	
	public static void main(String[] args) {
		String liString= "abcd";
		ArrayList<String> list=new Permutation().permutation(liString);
		if(list!=null)
		{
			System.out.println(list);
		}
		
		
	}

}
