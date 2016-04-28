package code;

import dataStruct.TreeNode;

public class T337_2 {
	 public int rob(TreeNode root) {
	       int[] rest=dfs(root);
	       return Math.max(rest[0],rest[1]);
	        
	    }
	    public int[] dfs(TreeNode root)
	    {
	        if(root==null)
	        return new int[2];
	        int[] left=dfs(root.left);
	        int[] right=dfs(root.right);
	        int[] rst=new int[2];//����״̬��¼����¼��rst[0]��ʾ���ٵ�ǰ�ڵ㣬[1]��ʾ�����ٵ�ǰ�ڵ㣻
	        //״̬ת�Ʒ���
	        rst[0]=root.val+left[1]+right[1];
	        rst[1]=Math.max(left[0],left[1])+Math.max(right[1],right[0]);
	        return rst;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
