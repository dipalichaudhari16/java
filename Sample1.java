import java.util.Scanner; 
class Node

{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Linkedlist
{
	Node head;
	public void insert(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public void search(int a)
	{
		int flag=0;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==a)
			{
				flag=1;
			}
			temp=temp.next;
		}
		if(flag==0)
		{
			System.out.println("Elements is not found");

		}
		else
		{
			System.out.println("Elements is found");
		}
		
	}
	public void delete(int data)
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		if (head.data == data)

		{
			head=head.next;
			System.out.println("Deleted"+data);
			return;
		}
		Node prev=head;
		while (prev.next != null && prev.next.data != data)
		{
			prev = prev.next;
		}
		if (prev.next == null) 
		{
		System.out.println(data + " not found");
		return;
    		}
		prev.next = prev.next.next;
    		System.out.println("Deleted " + data);
	}    
		
	public void show()
			{
				Node temp=head;
				while(temp!=null)
				{
					System.out.print(temp.data+"->");
					temp=temp.next;
				}
				System.out.print("Null");
			}
}
class Sample1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  

        Linkedlist l1 = new Linkedlist();
        l1.insert(4);
        l1.insert(5);
        l1.insert(6);
        l1.show();

        System.out.println("\nEnter element to search:");
        int a = sc.nextInt();   
        l1.search(a);
	System.out.println("Enter element to delete:");
        int key = sc.nextInt();  
	l1.delete(key);
	l1.show();
	sc.close(); 	
	}
}
