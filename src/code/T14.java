package code;

public class T14 {

	public static void main(String[] args) {
		String[] strs={"abcd","abcf","abfred"};
		System.out.println(longestCommonPrefix(strs));

	}
	 public static String longestCommonPrefix(String[] strs) {
	        if(strs==null||strs.length==0)
	        return "";
	        int i=0;//����������еĳ���
	        char[] chars;//����¼����
	        int length=strs[0].length();//����¼����ĳ���
	        chars=new char[length];
	        int j=0;
	        for(j=0;j<length;j++)
	        {
	            chars[j]=strs[0].charAt(j);    
	           
	        }
	        i=length-1;
	        for(j=1;j<strs.length;j++)
	        {
	            for(int k=0;k<=i;k++)
	            {
	                if((strs[j].length()>k))
	                {
	                    if((strs[j].charAt(k)!=chars[k]))
	                    {
	                         i=k-1;
	                         break;
	                    }
	                   
	                }else{
	                   
	                    i=strs[j].length()-1;
	                }
	            }
	        }
	       
	       return new String(chars,0,i+1);
	        
	    }
}
