package workToOffer;
/** 
* Created by zhanghuali on 2017Äê12ÔÂ1ÈÕ. 
*/
public class FindKthToTail {
	public ListNode findkthtotail (ListNode head,int k ) 
	{
		if(head==null||k==0)
		{
			return null;
		}
		ListNode nodehead=head;
		ListNode nodebehind=null;
		for(int i=0;i<k-1;i++)
		{
			if(nodehead.next!=null)
			{
				nodehead=nodehead.next;	
			}else {
				return null;
//				try{throw new NullPointerException();}
//				catch(NullPointerException exception)
//				{
//					System.out.println("the k beyond the nodelist");
//					exception.printStackTrace();
//				}
			}	
		}
		nodebehind=head;
		while(nodehead.next!=null)
		{
			nodehead=nodehead.next;
			nodebehind=nodebehind.next;
		}
		return nodebehind;
		
	}
	public static void main(String[] args)  {
		ListNode head=new ListNode(8);
		head.next=null;
		FindKthToTail findKthToTail1=new FindKthToTail();
		ListNode nodeList=findKthToTail1.findkthtotail(head, 1);
		
		if(nodeList==null)
		{
			System.out.println("the k beyond the nodelist");
		}else
		{
			System.out.println("the behind k:"+nodeList.value);
		}
		
	}

}
