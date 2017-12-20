package workToOffer;
/** 
* Created by zhanghuali on 2017Äê11ÔÂ30ÈÕ. 
*/
public class Print1ToMaxOfNDigits {
	public static void main(String[] args) {
		Print1ToMaxOfNDigits print1=new Print1ToMaxOfNDigits();
		print1.print1ToMaxOfN(2);
//		System.out.println("over");
	}
	public void print1ToMaxOfN(int n)
	{
		if(n<=0)
			return;
		char[] number=new char[n];
		for(int i=0;i<10;i++)
		{
			number[0]=(char)(i+'0');
			print1ToMax(number,n,0);
		}
	}
	public void print1ToMax(char[]number,int nlength,int index)
	{
		if(index==nlength-1)
		{
			PrintNumber(number);
			return;
		}
		for(int i=0;i<10;i++)
		{
			number[index+1]=(char)(i+'0');
			print1ToMax(number, nlength, index+1);
		}
	}
	
	public void PrintNumber(char[]number)
	{
		boolean isBeginning0=true;
		int nLength=number.length;
		for(int i=0;i<nLength;i++)
		{
			if(isBeginning0&&number[i]!='0')
				isBeginning0=false;
			if(!isBeginning0)
			{
				System.out.print(number[i]);
			}
		}
		System.out.print(" ");
	}
	
}
