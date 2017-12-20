package workToOffer;
/** 
* Created by zhanghuali on 2017年12月2日. 
*/
public class ReverseList {
	public ListNode reverseList(ListNode head) 
	{
		if(head==null)
		{
			return null;
		}
		ListNode preverseHead=null;
		ListNode pNode=head;
		ListNode pPrev=null;
		while(pNode!=null)
		{
			ListNode pNext=pNode.next;
			if(pNext==null)
			{
				preverseHead=pNode;
			}
			pNode.next=pPrev;
			pPrev=pNode;
			pNode=pNext;
		}
		return preverseHead;
	}
	
	public static void main(String[] args) {
		// 构建链表  
				ListNode head = new ListNode(0);  
		        ListNode node_one = new ListNode(1);  
		        ListNode node_two = new ListNode(2);  
		        ListNode node_three = new ListNode(3);  
		        ListNode node_four = new ListNode(4);
		        head.setNext(node_one);
		        node_one.setNext(node_two);  
		        node_two.setNext(node_three);  
		        node_three.setNext(node_four);  
		        node_four.setNext(null);
//				head.next=null;
//				ListNode head =null;
		        ListNode reverse=new ReverseList().reverseList(head);
		        if(reverse==null)
		        {
		        	System.out.println("invalid list");
		        }else {
		        	while(reverse!=null)
		        		{
		        		System.out.print(reverse.value+" ");
		        		reverse=reverse.next;
		        		}
		        }
		        	   
		    }
}
