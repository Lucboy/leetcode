package code;

import java.util.Random;

public class T1 {

	public static void main(String[] args) {
		int[] array=new int[3];
		//[2,1,9,4,4,56,90,3]
		array[0]=3;
		array[1]=2;
		array[2]=4;
//		array[3]=4;
//		array[4]=4;
//		array[5]=56;
//		array[6]=90;
//		array[7]=3;
		//mid3(array,0,2);
		//insert(array);
		//qsort(array,0,2);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println(twoSum(array,6)[0]+"  "+twoSum(array,6)[1]);
		
	}
	public static void qsort(int[] array,int left,int right)
	{
		if(left+2>right)//������鳤��С��3��ʵ�в�������
		{
			insert(array);
		}else{
			
			int povit=mid3(array,left,right);//�ҵ���ŦԪ��
			
			int temp;
			int i=left;
			int j=right-1;
			while(true)
			{
				while(array[++i]<povit)
					;
				while(array[--j]>povit)
					;
				if(i<j)
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}else{
					break;
				}
			}
			temp=array[i];
			array[i]=povit;
			array[right-1]=temp;//��povit���õ���ȷ��λ��
			qsort(array,left,i-1);
			qsort(array,i+1,right);
			
			
		}
		
	}
	public static int mid3(int[] array,int left,int right)
	{
		int center=(left+right)/2;
		int temp;
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i]+" ");
//		}
//		System.out.println();
		if(array[left]>array[center])
		{
			temp=array[center];
			array[center]=array[left];
			array[left]=temp;
		}
		if(array[center]>array[right])
		{
			temp=array[center];
			array[center]=array[right];
			array[right]=temp;
			
		}
		if(array[center]<array[left])
		{
			temp=array[center];
			array[center]=array[left];
			array[left]=temp;
		}
//		
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i]+" ");
//		}
		temp=array[right-1];
		array[right-1]=array[center];
		array[center]=temp;
		return array[right-1];
		
	}
	public static void insert(int[] array)
	{
		if(array!=null){
			int temp;
			int i, j;
			for(i=1;i<array.length;i++)
			{ 
				temp=array[i];
				for(j=i;j>0&&array[j-1]>temp;j--)
				{
					
						array[j]=array[j-1];
							
					
				}
				array[j]=temp;
			}
		}
		
	}
	public static int[] twoSum(int[] array,int target)
	{
		if(array==null)
			return null;
			qsort(array,0,array.length-1);
			int left=0;
			int right=array.length-1;
			int center;
			int nums[]=new int[2];
			while(left+1<=right)//���ﱣ֤center>=1;
			{
				center=(left+right)/2;
				//����Ϊ�˱�������Խ�粻Ҫʹ��center��center-1
				if(array[center]<=target&&array[center+1]>=target)//�ҵ���λ��
				{
					right=center;
					break;
					
				}else if(array[center+1]<target)
				{
					left=center+1;
					if(left>=right)
					{
						break;
					}
						
				}else if(array[center]>target)
				{
					right=center;
					if(right<=left)
					{
						break;
					}
				}
			}
			System.out.println("right="+right);
			int index1,index2;
			for(int i=0;i<=right;i++)//��ȷ���ķ�Χ����
			{
				index1=array[i];
				for(int j=i+1;j<=right;j++)
				{
					index2=array[j];
					if(index1+index2==target)
					{
						nums[0]=i+1;
						nums[1]=j+1;
						System.out.println(i+"  "+j);
						System.out.println(index1+"  "+index2);
						
					}
						
				}
			}
			return nums;
		
		
		
	}
	

}
