
public class linkedlist {
    node head ;
    public void add(int i) {
         node newnode =new node(i);
         node current =head;
         if(current==null)
            head= newnode;
         else
            {
                while(current.next!=null)
                {
                    current=current.next;
                }
                current.next=newnode;
            }
    }
    public void printvalues()
    {
        node current=head;
        while(current!=null)
        {
            System.out.print(current.value+"  ");
            current=current.next;
        }
        System.out.println();
    }
    public void addatfirst(int data)
    {
        node newnode = new node(data);
        newnode.next=head;
        head=newnode;
    }
    public void remove(int data)
    {
        node current=head;
        while(current.next!=null && current.next.value!=data)
        {
            current=current.next;
        }
        if(current.next!=null){
            current.next=current.next.next;
        }
    }

}
