package workToOffer;

import javax.management.RuntimeErrorException;

/** 
* Created by zhanghuali on 2017��11��29��. 
*/
public class Power {
	//����ָ����0��������������
	public double powerInteger(double base,int exponent)
	{   //����ʱ�������ķ����࣬���ڴ��õ���
		double res=1,curr=base;
		int exp;
		if(exponent>0)
		{
			exp=exponent;
		}else if (exponent<0) {
			if(base==0)
			{
				throw new RuntimeException("��ĸ����Ϊ0");
			}
			exp=-exponent;
		}else {
			return 1;
		}
		while(exp!=0)
		{
			if((exp&1)==1) //��λ��������������������
				//�ж�һ��������������ż����
			{
				res*=curr;
			}
			curr*=curr;
			exp>>=1;//��������������˳���2
		}
		return exponent>0?res:(1/res);

	}
	
	//
//	 public double power(double base, int exponent){
//	        if (Math.abs ( base-0.0 )<0.00001){
//	            if (exponent > 0)
//	                return 0.0;
//	            else if (exponent<0) {
//	            	throw new RuntimeException("Infinity");
//				}
//	                
//	        }
//
//	        double result = 0.0;
//	        if (exponent < 0){
//	            exponent = -exponent;
//	            result = calculate ( base, exponent);
//	            result = 1.0/result;
//	        } else if(exponent ==0){
//	            return 1;
//	        } else {
//	            result = calculate ( base,exponent );
//	        }
//
//	        return result;
//	    }
//
//	    public double calculate(double base,int exponent){
//	        if (exponent ==1)
//	            return base;
//	        if (exponent == 0)
//	            return 1;
//
//	        double result = calculate ( base,exponent >>1 );
//	        result *= result;
//	        if((exponent & 1) == 1)
//	            result *= base;
//	        return result;
//	    }
	
	
	
	public static void main(String[] args) {
		double base=2;
		int exp=11;
		Power power1=new Power();
		System.out.println("the "+base+"'s  "
		+exp+" exp is "+
				power1.powerInteger(base, exp));
	}
}
