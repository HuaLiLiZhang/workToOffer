package workToOffer;

import java.util.Arrays;

/** 
* Created by zhanghuali on 2017Äê12ÔÂ2ÈÕ. 
*/


public class Merge {
	public ListNode merge(ListNode list1,ListNode list2)
	{
		if(list1==null&&list2==null)
		{
			return null;
		}else 
		{
			if(list2==null) 
			{
				return list1;
			}
			else if(list1==null)
			{
				return list2;
			}
		}
		ListNode pMergeHead=null;
		if(list1.value<list2.value)
		{
			pMergeHead=list1;
			pMergeHead.next=merge(list1.next, list2);
		}
		else 
		{
			pMergeHead=list2;
			pMergeHead.next=merge(list1, list2.next);
		}
		return pMergeHead;
		
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(1);  
        ListNode node_one = new ListNode(3);  
        ListNode node_two = new ListNode(5);  
        ListNode node_three = new ListNode(7);  
        ListNode node_four = new ListNode(9);
        head.setNext(node_one);
        node_one.setNext(node_two);  
        node_two.setNext(node_three);  
        node_three.setNext(node_four);  
        node_four.setNext(null);
        
        ListNode head1 = new ListNode(0);  
        ListNode node_one1 = new ListNode(2);  
        ListNode node_two1 = new ListNode(4);  
        ListNode node_three1 = new ListNode(8);  
        ListNode node_four1 = new ListNode(9);
        head1.setNext(node_one1);
        node_one1.setNext(node_two1);  
        node_two1.setNext(node_three1);  
        node_three1.setNext(node_four1);  
        node_four1.setNext(null);
        
        ListNode m=new Merge().merge(head, head1);
        if(m==null)
        {
        	System.out.println("invalid list");
        }else {
			while(m!=null)
			{
				System.out.print(m.value+" ");
				m=m.next;
			}
		}
	}

}
