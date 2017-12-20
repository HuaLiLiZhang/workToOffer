package workToOffer;

public class ReplaceBlank {
	public String replaceBlank(StringBuffer str)
	{
		String result="";
		if (str.length()==0)
		{
			return result;
		}
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			if(str.charAt( i )==' ')
			{
				str.replace(i, i+1, "%20");
				length+=2;
			}
		}
//		System.out.println("length:"+length+" str:"+str);
		
		return str.toString();
	}
	public static void main(String[] args) {
		StringBuffer string=new StringBuffer();
		string.append("we are happy girls");
		System.out.println("the orifinal string:"+string);
		System.out.println("the length:"+string.length());
		System.out.print("replace The blank:"+new ReplaceBlank().replaceBlank(string));
	}

}
