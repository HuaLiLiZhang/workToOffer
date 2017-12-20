package workToOffer;

import java.util.Stack;

/** 
* Created by zhanghuali on 2017年12月3日. 
*/
public class IsPopOrder {
	public boolean isPopOreder(int []pushA,int[]popA)
	{
		if(pushA==null||popA==null||pushA.length==0||popA.length==0)
		{
			return false;
		}
		int index=0;
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<pushA.length;i++)
		{
			stack.push(pushA[i]);
			while(!stack.isEmpty()&&stack.peek()==popA[index])
			{     //应该先判断是否为空，再继续判断，否则会有爆栈或者溢出栈的错误
//				Exception in thread "main" java.util.EmptyStackException
				stack.pop();
				index++;
			}
		}
		
		return stack.empty();
	}
	
	public static void main(String[] args) {
		int[]pusha= {1,2,3,4,5};
		int[]popa= {4,5,3,2,1};
		boolean result=new IsPopOrder().isPopOreder(pusha, popa);
		System.out.println("result:"+result);
	}

}
