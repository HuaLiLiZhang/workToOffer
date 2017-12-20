package workToOffer;
/** 
* Created by zhanghuali on 2017年11月29日. 
*/
public class Fibonacci {
	//递归有弊端，分配空间太多，容易栈溢出，效率低
//	public int F(int n)
//	{
//		if(n==0||n==1)
//		 return n;
//		int result=F(n-1)+F(n-2);
//		return result;
//	}
	public int F(int n) {
		if(n==0||n==1)
		{
			return n;
		}
		int fibNMinusOne=0;
		int fibNMinusTwo=1;
		int fibN=0;
		for (int i=2;i<=n;i++)
		{
			fibN=fibNMinusOne+fibNMinusTwo;
			fibNMinusOne=fibNMinusTwo;
			fibNMinusTwo=fibN;
		}
		return  fibN;
	}
	public static void main(String[] args) {
		int n=10;
		System.out.println("the fibonacci result:"+new Fibonacci().F(n));
	}

}
