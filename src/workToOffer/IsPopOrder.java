package workToOffer;

import java.util.Stack;

/** 
* Created by zhanghuali on 2017��12��3��. 
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
			{     //Ӧ�����ж��Ƿ�Ϊ�գ��ټ����жϣ�������б�ջ�������ջ�Ĵ���
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
