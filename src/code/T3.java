package code;

public class T3 {
	 int[] news=new int[2];//���浱ǰ���ظ��Ӵ�����ʼ�±�
     int[] logests=new int[2];//���浱ǰ����ظ��Ӵ�����ʼ�±�
  public int lengthOfLongestSubstring(String s) {
     if(s==null||s.length()==0)
      return 0;
     
      int start,end,flag;//flag ��ʾ�����ظ�
      int length=s.length();
      start=0;
      end=0;
      news[0]=start;
      news[1]=end;
      for(end=1;end<length;end++)
      {
          flag=0;//��ʾ���ظ�
          int j;
          for(j=news[0];j<=news[1];j++)//�鿴�����ظ�������start��end
          {
              if(s.charAt(j)==s.charAt(end))//˵�����ظ�������start
              {
                  start=j+1;
                  flag=1;
                  break;
              }
              
          }
          if(flag==0)
          {
              news[1]=end;
              if((logests[1]-logests[0])<(news[1]-news[0]))//���news��logests��
              {
                  logests[0]=news[0];
                  logests[1]=news[1];
                  
              }
          }else{//������ظ�����start����Ȼ��ʱ��end-start�����news[1]-news[0]��
              start=j+1;
              news[0]=start;
              news[1]=end;
              
          }
      }
      return logests[1]-logests[0]+1;
      
  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
