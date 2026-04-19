public class stack
{
    private int[] array=new int[6];
    int top,size;
    stack()
    {
        size=array.length;
        top=-1;
    }
    public void push(int value)
    {
        if(top<size-1)
            array[++top]=value;
        else
            System.out.println("the stack is overflowing...");
    }
    public void pop()
    {
        if (top>-1)
             System.out.println(array[top--]);
        else
            System.out.println("stack is empty");
    }
    public void peek()
    {
        System.out.println(array[top]);
    }
    public void showall()
    {
        for(int i=0;i<=top;i++)
            {
                System.out.print(array[i]+" ");
            }
            System.out.println();
    }
}