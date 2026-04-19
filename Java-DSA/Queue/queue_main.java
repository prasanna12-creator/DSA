public class queue_main
{
    public static void main (String [] args)
    {
        System.out.println("hello world...!");
        my_queue queue=new my_queue(5);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(11);
        System.out.println(queue.dequeue());
        
    }
}
