public class tree_main
{
    public static void main(String [] args)
    {
        binarytree tree = new binarytree();
        tree.insert(55);
        tree.insert(44);
        tree.insert(66);
        tree.insert(33);
        tree.insert(22);
        tree.insert(77);
        tree.in_order();
        System.out.println();
        tree.pre_order();
        System.out.println();
        tree.post_order();
    }
}