import java.util.HashSet;
import java.util.Scanner;

public class BinarySearch
{
	static void bubbleSort(int a[])
	{
		int temp;
		for (int k=0;k<a.length;k++)
		{
			for(int j=k+1;j<a.length;j++)
			{
				if(a[k]>a[j])
				{
				temp=a[k];
				a[k]=a[j];
				a[j]=temp;
				}
			}
		}
	}
	static int binarySearch(int a[],int left,int right,int x)
	{
		int mid=0;
		while(left<=right)
		{
		mid=(left+right)/2;
		if(a[mid]==x)
		{
			return mid;
		}
		else
			if(a[mid]>x)
			{
				right=mid-1;
			}
		else
			{
				left=mid+1;
			}
			
			}
			return-1;
	}
		public static void main(String []args)
		{
			Scanner sc=new Scanner(System.in);
			int a[]=new int [7];
			System.out.println("\n Enter the array");
			
			
			for(int i=0;i<a.length;i++)
			{
				 a[i]=sc.nextInt();
			} 
			System.out.println("Your entered array is");
			
		
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+"\t");
			
			}
			bubbleSort(a);
			System.out.println("\n Your sorted array is");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+"\t");
			}
			HashSet<Integer> set = new HashSet<>();
			
			for(int num : a)
				{
				set.add(num);
				}
				System.out.println("\n array elements without dupalicate values");
			for(int num : set)
				{
					System.out.println	(num +"\t");
				}
				System.out.println("\n Enter the element");
				int x =sc.nextInt();
			
				
				int n=a.length;
				int result=binarySearch(a,0,n-1,x);
				if (result == -1)
				{
					System.out.println(x+"\t Element is not found");
					
				}
				else
				{
					System.out.println(x+"\t Element is found");
				}
			}
		}


