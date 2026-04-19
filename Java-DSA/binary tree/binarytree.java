
public class binarytree
{
    treenode root;
    public void insert(int value)
    {
        root = insertrec(root,value);
    }
    public treenode insertrec(treenode root,int value)
    {
        if (root==null)
            root= new treenode(value);
        else if(value<root.data)
            root.leftnode=insertrec(root.leftnode,value);
        else if(value>root.data)
            root.rightnode=insertrec(root.rightnode,value);
        return root;
    }
    // there are three types of traversal methods are in-order ,pre-order and post-order .
    public void in_order()
    {
        in_order_rec(root);
    }
    public void in_order_rec(treenode root)
    {
        if(root!=null)
        {
            in_order_rec(root.leftnode);
            System.out.print(root.data+" ");
            in_order_rec(root.rightnode);
        }
    }
    public void pre_order()
    {
        pre_order_rec(root);
    }
    public void pre_order_rec(treenode root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            pre_order_rec(root.leftnode); 
            pre_order_rec(root.rightnode);
        }
    }
    public void post_order()
    {
        post_order_rec(root);
    }
    public void post_order_rec(treenode root)
    {
        if(root!=null)
        {
            post_order_rec(root.leftnode);
            post_order_rec(root.rightnode);
            System.out.print(root.data+" ");
        }
    }
}
