package code;

public class T278 {

	public static void main(String[] args) {
		
		System.out.println(firstBadVersion(2126753390));
	}
	public static int firstBadVersion(int n) {
        //���ֲ���
        
        long mid;
        long left=1;
        long right=n;
        boolean badmid=false;
        while(left<=right)
        {
             mid=(left+right)/2; ///ʮ��ע������Ҫ��ֹleft+right�����int
             System.out.println(mid);
             if((badmid=isBadVersion(mid))&&!isBadVersion(mid-1))
             {
                 return (int)mid;
             }
             if(!badmid)
             {
                 left=mid+1;
             }
             else
             {
                 right=mid-1;
             }
        }
               
        return 0;
       
    }
	 public static boolean isBadVersion(long x)
	 {
		 if(x>=1702766719)
			 return true;
		 else 
			 return false;
	 }
}
