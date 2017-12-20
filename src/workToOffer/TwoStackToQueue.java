package workToOffer;
/** 
* Created by zhanghuali on 2017Äê11ÔÂ27ÈÕ. 
*/
import java.util.*;
public class TwoStackToQueue {
	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	public void push(int a)
	{
		stack1.push(a);
//		for(int i=0;i<a.length;i++)
//		{
//			stack1.push(a[i]);
//		}
//	
	}
	public int pop() throws Exception {
			if (stack2.size()<=0)
			{
				while(stack1.size()>0)
				{
					int data=stack1.peek();
					stack1.pop();
					stack2.push(data);
					
				}
			}
			if (stack2.size()==0)
			{
				throw new Exception("queue is empty");
			}
		return stack2.pop();
			
			
	}
	public static void main(String[] args) throws Exception {
		
		TwoStackToQueue stackToQueue =new TwoStackToQueue();
		stackToQueue.push(1);
		stackToQueue.push(3);
		stackToQueue.push(5);
		stackToQueue.push(8);
		int out1=stackToQueue.pop();
		System.out.println(out1);
		int out2=stackToQueue.pop();
		System.out.println(out2);
		stackToQueue.push(4);
		stackToQueue.push(9);
		int out3=stackToQueue.pop();
		System.out.println(out3);
		int out4=stackToQueue.pop();
		System.out.println(out4);
		int out5=stackToQueue.pop();
		System.out.println(out5);
		int out6=stackToQueue.pop();
		System.out.println(out6);
		int out7=stackToQueue.pop();
		System.out.println(out7);
	}
}
