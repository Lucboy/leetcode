package code;

public class T326 {
	 public static boolean isPowerOfThree(int n) {
	        if(n==0||n==1)
	        return true;
	        int factor=0;
	        int next=n;
	        while(next>=3){
	        	factor=0;
	            while(next>=3)
	            {
	                 int divid=1;
	                 long temp=3;
	               
	                 //���ֲ��ң��ҳ���λ��λ��
	                 while((temp<<1)<next)
	                 {
	                	 temp<<=1;
	                	 divid<<=1;
	                 }
	                 next-=temp;
	                 factor+=divid;

	         }
	         if(next!=0)//������ܱ�3����
	        	 return false;
	        next=factor;
	      }
	        if(next==1)
	            return true;
	        else
	            return false;
	       
	        
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(T326.isPowerOfThree(17));

	}

}
