package workToOffer;

/** 
* Created by zhanghuali on 2017Äê12ÔÂ1ÈÕ. 
*/
class NodeList{
	int value;
	NodeList next=null;
	
	public NodeList(int val) {
		// TODO Auto-generated constructor stub
		this.value=val;
	}
	public void setNext(NodeList next) {
		this.next=next;
	}
	public NodeList getNext() {
		return this.next;
		
	}
	public void setValue(int val)
	{
		this.value=val;
	}
	public int getValue()
	{
		return this.value;
	}
}
public class DeleteNodeList {
	public static void main(String[] args) {
		NodeList head=new NodeList(4);
//		NodeList one=new NodeList(6);
//		NodeList two=new NodeList(2);
//		NodeList three=new NodeList(9);
//		NodeList four=new NodeList(5);
//		head.setNext(one);
//		one.setNext(two);
//		two.setNext(three);
//		three.setNext(four);
//		four.setNext(null);
		head.setNext(null);
		DeleteNodeList deleteNodeList=new DeleteNodeList();
		head =deleteNodeList.deleteList(head, head);
		deleteNodeList.print(head);
	}
	
	
	public NodeList deleteList(NodeList head,NodeList position )
	{
		if(head==null||position==null)
		{
			return null ;//
		}
		if(position.getNext()!=null)
		{
			NodeList p=position.getNext();
			position.setValue(p.getValue());
			position.setNext(p.getNext());	
			return head;
		}else if (head==position) {
			head=null;  
			System.out.println(" null");//
			return head;//
		} else {
			NodeList currentNode=head;
			while(currentNode.getNext()!=position)
			{
				currentNode=currentNode.getNext();
			}
			currentNode.setNext(null);
			return head;//
		}
		
	}
	public void print(NodeList head) {
		NodeList current=head;
		while(current!=null)
		{
			System.out.print(current.getValue()+" ");
			current=current.getNext();
		}
		System.out.println();
	}
	

}
