package workToOffer;
/** 
* Created by zhanghuali on 2017Äê11ÔÂ29ÈÕ. 
*/
public class JumpFloor {
	public int JumpFloor1(int target) {
        int []tar={0,1,2};
        if(target<3)
        {
            return tar[target];
        }
        int sum=0;
        int front=1;
        int behind=2;
        for(int i=3;i<=target;i++)
        {
            sum=front+behind;
            front=behind;
            behind=sum;
        }
        return sum;

    }
	public static void main(String[] args) {
		int a=10;
		System.out.println("the number:"+new JumpFloor().JumpFloor1(a));
		
	}

}
