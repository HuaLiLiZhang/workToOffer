package workToOffer;
/** 
* Created by zhanghuali on 2017Äê12ÔÂ6ÈÕ. 
*/


public class Clone {
	public RandomListNode clone(RandomListNode pHead)
	{
		if(pHead==null)
			return null;
		RandomListNode pNode=pHead;
		while(pNode!=null)
		{
			RandomListNode pCloned = new RandomListNode(0);
//			System.out.println(pCloned);
//			System.out.println(pNode);
			pCloned.label = pNode.label;
			pCloned.random=pNode.random;
			pCloned.next=pNode.next;
			pNode.next=pCloned;
			pNode=pNode.next.next;
			
		}
		
		pNode=pHead;
		while(pNode!=null)
		{
			if(pNode.random!=null)
			{
				pNode.next.random=pNode.random.next;
			}
			pNode=pNode.next.next;
		}
		pNode=pHead.next;
		RandomListNode temp=new RandomListNode(0);
		temp.label=pHead.next.label;
		temp.random=pHead.next.random;
		
		RandomListNode newHead=temp;
		RandomListNode pointer1=newHead;
		while(pNode.next!=null)
		{
			RandomListNode tmp=new RandomListNode(0);
			tmp.label=pNode.next.next.label;
			tmp.random=pNode.next.next.random;
			pointer1.next=tmp;
			pointer1=pointer1.next;
			pNode=pNode.next.next;
			
		}
		
		return newHead;
	
	}
	
	
	public static void main(String[] args) {
		RandomListNode head=new RandomListNode(1);
		RandomListNode one=new RandomListNode(2);
		RandomListNode two=new RandomListNode(3);
		RandomListNode there=new RandomListNode(4);
		RandomListNode four=new RandomListNode(5);
		head.next=one;
		one.next=two;
		two.random=null;
		two.next=there;
	
		there.next=four;
		head.random=two;
		there.random=one;
		one.random=four;
		four.next=null;
		four.random=null;
		
		RandomListNode node=new Clone().clone(head);
		if(node==null)
		{
			System.out.println("valid randomlist");
		}else {
			while(node!=null)
			{
//				if(node.random!=null)
//				{   RandomListNode p1=node;
//					System.out.println(p1.random.label);
//				}
				System.out.print(node.label+" ");
				node=node.next;
				
			}
		}

	}
	
}

class RandomListNode
{
	int label;
	RandomListNode next=null;
	RandomListNode random=null;
	public RandomListNode(int lab) {
		// TODO Auto-generated constructor stub
		this.label=lab;
	}

	
}
