public class my_queue {
    int front = 0 ;
    int rear = 0 ;
    int size = 0 ;
    int max;
    int[] arr;
    my_queue(int size)
    {
        this.arr=new int[size];
        this.max=size;
    }

    public void enqueue(int value)
    {
        if(is_full())
            throw new RuntimeException("Queue is overfull..!");
        else
        {
            this.arr[rear] = value;
            rear=(rear+1)%this.max;
            size++;
        }
    }
    public int dequeue()
    {
        if(is_empty())
            throw new RuntimeException( "Queue is empty...!");
        else
        {
            int data = this.arr[front];
            front=(front+1)%this.max;
            size--;
            return data;
        }
            
    }
    public boolean is_full()
    {
        return size==this.max;
    }
    public boolean is_empty()
    {
        return size==0;
    }


}
