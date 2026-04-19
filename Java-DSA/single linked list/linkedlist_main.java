public class linkedlist_main{
    public static void main(String[] args){
        linkedlist lists = new linkedlist();

        lists.add(54);
        lists.add(10);
        lists.add(21);
        lists.printvalues();
        System.out.println("inserting the node value at first :");
        lists.addatfirst(14);
        lists.addatfirst(33);
        lists.printvalues();
        System.out.println("after removal of a node 10 :");
        lists.remove(10);
        lists.printvalues();

    } 
}