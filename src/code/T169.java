package code;

public class T169 {

	 public int majorityElement(int[] nums) {
	        int pre=nums[0];//��¼֮ǰ���ֹ�������
	        int count=1;//��¼���ֵĴ���
	        for(int i=1;i<nums.length;i++)
	        {
	            if(nums[i]==pre)
	                count++;
	            else{
	                count--;
	                if(count==0){
	                pre=nums[i];
	                count++;
	                    
	                }
	            }
	            
	        }
	        
	        return pre;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
