package javaExmple;

public class ArrayExm {

	public static void main(String[] args) {
		
		ArrayExm ll =new ArrayExm();
		ll.arraytest();
	}

	public void arraytest()
	{
		int a[] =new int[10];
	
			for(int count=0;count<a.length;count++)
			{
				a[count]=count+1;
				System.out.println(a[count]);
			}
			int [] b =myarray(a);
			for(int count=0;count<b.length;count++)
			{
				
				System.out.println(b[count]);
			}
	}
	public int[] myarray(int []b)
	{
		int c[] =new int[b.length];
		for(int count=0;count<c.length;count++)
		{
			c[count]=count*2;
			//System.out.println(c[count]);
		}
		return c;
	}
}
