package code;

//����Ҫע�ⷭתһ�������п��ܳ���int�Ŀɱ�ʾ��Χ
public class T7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(-2147483647);

	}
	 public static long reverse(int x) {
		 
		        String digits=x+"";
		        char[] nums=digits.toCharArray();
		        char[] rst=new char[nums.length];
		        int i;
		      
		        if(nums[0]>=48&&nums[0]<=57)//��һ��������
		        {
		             for(i=nums.length-1;i>=0;i--)
		             {
		                rst[nums.length-i-1]=nums[i];
		             }
		        }else{
		             rst[0]=nums[0];
		             for(i=nums.length-1;i>0;i--)
		             {
		                rst[nums.length-i]=nums[i];
		             }
		            
		            
		        }
		        
		        
		        digits=String.valueOf(rst);
		        //����Ҫ���Ƿ�ת���ܳ���int�ı�ʾ��Χ���ȷŵ�long�����ڱȽ�
		        long number=Long.parseLong(digits);
		        if(number<-2147483648||number>2147483647)//out of range
		             return 0;
		        else 
		            return (int)number;
		        
		        
		        
		    }
	        
	    

}
