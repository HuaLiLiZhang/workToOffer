package workToOffer;
/** 
* @author zhanghuali: 
* @version ����ʱ�䣺2017��11��26�� ����3:48:27  
*/

//use the stack
import java.util.*;

public class PrintListFromTailToHead {
	//��һ�ַ�������ջ
//	public ArrayList<Integer> printlistfromtailtohead(ListNode listnode)
//	{
//		Stack<Integer> stack =new Stack<Integer>();
//		while(listnode!=null)
//		{
//			stack.push(listnode.value);
//			listnode=listnode.next;
//		}
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		while(!stack.isEmpty())
//		{
//			int a=stack.pop();
//			System.out.print(a + ",");  
//			list.add(a);
//		}
//		return list;
//	}
	//�ڶ��ַ������ݹ�
	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	public ArrayList<Integer> printlistfromtailtohead(ListNode listNode)
	{
		if(listNode!=null)
		{
			this.printlistfromtailtohead(listNode.next);
			arrayList.add(listNode.value);
			System.out.print(listNode.value+" ");
		}
		return arrayList;
	}
	
	public static void main(String[]args)
	{
		// ��������  
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
//        System.out.println("��һ�ַ�ʽ����ջʵ�֣�"); 
//        PrintListFromTailToHead a=new PrintListFromTailToHead();
//        ArrayList<Integer> s=a.printlistfromtailtohead(head);
        
      System.out.println("�ڶ��ַ�ʽ���ݹ�ʵ�֣�"); 
//      PrintListFromTailToHead a=new PrintListFromTailToHead();
      new PrintListFromTailToHead().printlistfromtailtohead(head);
//      ArrayList<Integer> s=a.printlistfromtailtohead(head);
      System.out.println();
      System.out.println();
//      System.out.println(s);
	}
	
}

//class ListNode  
//{  
//	int value;  
//    ListNode next;  
//  
//    public ListNode(int value) {  
//        this.value = value;  
//    }  
//
//    public void setNext(ListNode next) {  
//        this.next = next;  
//    }  
//
//}

