package code;


public class Atoi {

	public static void main(String[] args) {
		Atoi atoi=new Atoi();
		System.out.println(atoi.myAtoi("  -1"));

	}
	 public int myAtoi(String str) {
	        if(null==str)
	        	return 0;
	        char cur='0',next='0';
	        int i,j=0;
	        int begin;
	        int sum=0;
	        int time=1;
	        int length=str.length();
	        int sign=0;
	    
	        //�ȶ��ַ�������Ԥ����ȥ��ǰ�����Ч0�Ϳո�ȷ����
	        
	        for(i=length-1;i>=0;i--)
	        {
	            cur=str.charAt(i);
	           
	            if(cur>=48&&cur<=57)
	            {
	                   j=length-i-1;
	                    while(j-->0)
	                    {
	                        time*=10;
	                    }
	                    sum+=(cur-48)*time;
	                    time=1;
	             
	            }else{//�ҵ���һ���������ַ�
	               break;
	            }
	            
	        }
	        //�����һ���������ַ�
	        
	        if(cur=='+')
	        {
	        	if(i>0){
	        		next=str.charAt(i-1);
	        		if(next=='+'){
	        			sign=1;
	        			begin=i-1;
	        		}
	        			
	        		else if(next=='-')
	        		{
	        			sign=0;
	        			begin=i-1;
	        		}
	        		else 
	        		{
	        			begin=i;
	        			sign=0;
	        		}
	        			
	        	}else {
	        		begin=0;
	        		sign=1;
	        	}
	   
	        }else if(cur=='-')
	        {
	        	if(i>0){
	        		next=str.charAt(i-1);
	        		if(next=='+')
	        		{
	        			sign=0;
	        			begin=i-1;
	        		}
	        			
	        		else if(next=='-')
	        		{
	        			sign=1;
	        			begin=i-1;
	        		}
	        		else {
	        			sign=0;
	        			begin=i;
	        		}
	        			
	        	}else 
	        	{  
	        		begin=0;
	        		sign=-1;
	        	}
	
	        }else if(cur==' '){
	        		begin=i;
	        		sign=1;
	        }else//�ȷ������ַǷ���
	        {
	        	 return 0;
	        	 
	        }
	        //���ʣ����ַ��Ƿ�ȷ������ַǷ���
	        for(j=0;j<begin;j++)
	        {	       
	        	if(str.charAt(j)!=' ')
	        	return 0;
	        }
	        
	        if(sign<0)
	              sum*=-1;
	        if(sign==0)
	             sum=0;
	        return sum;
	    }
	
	
}
