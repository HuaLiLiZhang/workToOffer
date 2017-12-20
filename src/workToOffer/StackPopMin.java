package workToOffer;
/** 
* Created by zhanghuali on 2017Äê12ÔÂ3ÈÕ. 
*/

import java.util.*;

public class StackPopMin {
	Stack<Integer> data=new Stack<Integer>();
	Stack<Integer> min=new Stack<Integer>();
	Integer temp=null;
	
	public void push(int node)
	{
		if(temp!=null)
		{
			if(node<=temp)
			{
				temp=node;
				min.push(node);
			}
			data.push(node);
		}else 
		{
			temp=node;
			data.push(node);
			min.push(node);
		}
	}
	public void pop() 
	{
		int num=data.pop();
		int num1=min.pop();
		if(num!=num1)
		{
			min.push(num1);
		}
	}
	public int top()
	{
		int num=data.pop();
		data.push(num);
		return num;
	}
	public int min()
	{
		int num1=min.pop();
		min.push(num1);
		return num1;
	}
	
	public static void main(String[] args) {
		StackPopMin s=new StackPopMin();
		s.push(3);
		int t=s.top();
		int m=s.min();
		System.out.println("the top element:"+t+" the min element:"+m);
		s.push(4);
		int t1=s.top();
		int m1=s.min();
		System.out.println("the top element:"+t1+" the min element:"+m1);
		s.push(2);
		int t2=s.top();
		int m2=s.min();
		System.out.println("the top element:"+t2+" the min element:"+m2);
		s.push(1);
		int t3=s.top();
		int m3=s.min();
		System.out.println("the top element:"+t3+" the min element:"+m3);
		s.pop();
		s.pop();
		int t4=s.top();
		int m4=s.min();
		System.out.println("the top element:"+t4+" the min element:"+m4);
		s.push(0);
		int t5=s.top();
		int m5=s.min();
		System.out.println("the top element:"+t5+" the min element:"+m5);
	}

}
