

public class stack_main
{
    public static void main (String[] args){
    stack nums = new stack();
    nums.push(10);
    nums.push(12);
    nums.push(14);
    nums.push(15);
    nums.push(18);
    nums.push(20);
    nums.push(22);
    nums.peek();
    nums.showall();
    nums.pop();
    nums.showall();
    nums.push(24);
    nums.showall();
}
}