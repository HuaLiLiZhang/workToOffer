package workToOffer;
/** 
* @author zhanghuali: 
* @version ����ʱ�䣺2017��11��26�� ����9:45:30  
*/
public class ListNode  
{  
	int value;  
    ListNode next;  
  
    public ListNode(int value) {  
        this.value = value;  
    }  
  
    public ListNode(int value, ListNode next) {  
        this.value = value;  
        this.next = next;  
    }  
  
    public void setValue(int value) {  
        this.value = value;  
    }  
  
    public void setNext(ListNode next) {  
        this.next = next;  
    }  
  
    public int getValue() {  
        return this.value;  
    }  
  
    public ListNode getNext() {  
        return this.next;  
    } 
    
}
