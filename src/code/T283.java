package code;

public class T283 {

	public static void main(String[] args) {
		int[] nums={0,1,0,0,1,3,5};
		moveZeroes(nums);
		System.out.println();

	}
	public static void moveZeroes(int[] nums) {
        int i,j;
        i=0;
        j=0;
     
        while(true)
        {
            while(i<nums.length&&nums[i]!=0)//��ͷ��ʼ�����ҵ�һ��0Ԫ��
            i++;
            j=i+1;//��i����һ��Ԫ�ؿ�ʼ��һ������Ԫ��
            while(j<nums.length&&nums[j]==0)
            j++;
            if(i<nums.length&&j<nums.length)
            {
                nums[i]=nums[j];
                nums[j]=0;
                
            }else{
                break;
            }
          
        }
        
    }

}
