package code;

public class T5 {
	 public static String longestPalindrome(String s) {
	       //���������s������
	       char[] str=new char[s.length()];
	       int begin,end,bi=0,ei=0,maxlen;
	       int curlen;
	       int[] pos=new int[2];//��¼���ĵ���ʼλ��
	       maxlen=0;
	       for(int i=0;i<str.length;i++)
	       {
	    	   str[i]=s.charAt(i);
	       }
	       for(begin=0;begin<str.length;begin++)//��ǰ����
	       {
	           bi=begin;
	           curlen=0;
	           for(end=str.length-1;end>begin;end--)//�Ӻ���ǰ��
	           {
	               if(str[end]-str[begin]==0)
	               {
	                   ei=end;
	                   break;
	               }
	               
	           }
	           
	        	   while(bi<ei)//�漰��������ż��������
		           {
		               if(str[bi]-str[ei]!=0)
		               {
		                   break;
		               }
		               bi++;
		               ei--;
		               
		           }
		           if(bi>=ei)
		                curlen=(end-begin)+1;
		           else
		                curlen=1;
	        	   
	          
	           if(maxlen<curlen)
	           {   maxlen=curlen;
	               pos[0]=begin;
	               pos[1]=end;
	           }
	           
	 }
	       return s.substring(pos[0],pos[1]+1);
	           
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(longestPalindrome("abb"));
	}

}
