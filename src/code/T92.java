package code;

import code.T21.ListNode;

public class T92 {
	//����β�巨
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null)
            return head;
        if(m>=n)
            return head;
        //�������һ��ͷ��㣬��ֹ��head��ʼ��ת���������
        ListNode newhead=new ListNode(0);
        newhead.next=head;
        //��ת�� m+1 �� n+1 
        ListNode begin,cur,p,plast;
        int i=1;
        p=newhead;
        while(i++<m)
        {
            if(p==null)
                return head;
            p=p.next;
            
        }
        begin=p;
        plast=begin.next;
        p=begin.next;
        begin.next=null;
        i=m+1;
        while(i++<=n+1)
        {
            if(p==null)
                return head;
            cur=p;
            p=p.next;
            cur.next=begin.next;
            begin.next=cur;
        }
        plast.next=p;
        return newhead.next;
        
        
        
        
    }

}
