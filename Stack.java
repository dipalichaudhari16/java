class Stack
{
    int maxSize;
    int StackArray[];
    int top;

    Stack(int size)
    {
        maxSize=size;
        StackArray=new int[maxSize];
        top=-1;
    }
    public void push(int value)
    {
        if(top==maxSize-1)
        System.out.println("Stack is Overflow");
        else
        {
            StackArray[++top]=value;
            System.out.println(value+"is pushed in stack");
        }
    }
    public int pop()
    {
        if(top==-1)
        {
        System.out.println("Stack is Underflow");
        return -1;
        }
        else
        {
            System.out.println(StackArray[top]+"is poped from stack");
            return StackArray[top--];
        }
    
    }
    public void display()
    {
        if(top==-1)
        System.out.println("Stack is empty");
        else
        {
            System.out.println("the elements are:");
            for(int i=0;i<top;i++)
            {
                System.out.println(StackArray[i]);

            }

        }
        }
}  
class StackDemo
{
    public static void main(String s[])
    {
        Stack Stack1=new Stack(5);
        Stack1.push(10);
        Stack1.push(20);
        Stack1.push(30);
        Stack1.push(40);
        Stack1.push(50);

        Stack1.display();

        Stack1.pop();
        Stack1.pop();
        Stack1.pop();
    }
    
}