package code;

import code.T21.ListNode;

public class T19 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        return null;
        int length=0;//������
        ListNode pos=head;
       
        while(pos!=null)
        {
            length++;
            pos=pos.next;
            
        }
        if(length-n<0)//��ô�г�������
        {
            return null;
        }
        if(length-n==0)//ɾ����һ���ڵ�
        {
            head=head.next;
           return head;
        }
        pos=head;
        for(int i=1;i<length-n;i++)
        {
            pos=pos.next;
        }
       
        pos.next=pos.next.next;
        return head;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
