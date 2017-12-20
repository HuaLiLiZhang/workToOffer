package workToOffer;
/** 
* Created by zhanghuali on 2017Äê11ÔÂ29ÈÕ. 
*/
public class NumberOf1 {
	public int numberf1(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=(n-1)&n;
		}
		return count;
	}
//	public int numberf1(int n)
//	{
//		int count=0;
//		int flag=1;
//		while(flag!=0)
//		{
//			if((n&flag)!=0)
//			{
//				count++;
//			}
//			flag=flag<<1;
//		}
//		return count;
//	}
	public static void main(String[] args) {
//		int a=1;
//		int a=0x7FFFFFFF;
//		int a=0x80000000;
//		int a=0xFFFFFFFF;
//		int a=0;
//		int a=154;
		int a=0b1101; 	
		
		System.out.println("the number of one:"+new NumberOf1().numberf1(a));
		int by=(0b10010)^(0b11010);
		System.out.println(Integer.toBinaryString(by));
		
	}

}
