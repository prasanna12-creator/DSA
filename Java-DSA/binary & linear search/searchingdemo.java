public class searchingdemo {
    public static void main(String[] args){

        int[] aray={12,33,44,55,66,77,78,79,80};
        int target = 466;
        int a =linearsrch(aray,target);
        System.out.println("array length "+aray.length);
        if(a!=-1)
            System.out.println("the target element is found in linear search "+a);
        else 
            System.out.println("the target is not found");
        int b =binarysrch(aray,target);
        if(b!=-1)
            System.out.println("the target element is found in binary search "+b);
        else 
            System.out.println("the target is not found");
         int c =recursivebin(aray,target,0,aray.length-1);
        if(b!=-1)
            System.out.println("the target element is found in recrsive search "+c);
        else 
            System.out.println("the target is not found");

    }

     public static int linearsrch(int[] array,int target)
        {
            for(int i=0;i<array.length;i++){
                if (array[i]==target)
                    return i;
            }
            return -1;
        }

     public static int binarysrch(int[] array,int target){
        int left=0,right=array.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if (array[mid]==target)
                return mid;
            else if (array[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
       }

     public static int recursivebin(int[] arr,int target , int left,int right)
       {
       if (left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                return recursivebin(arr, target, mid+1, right);
            else
                return recursivebin(arr,target,left,mid-1);   
        }
        else 
            return -1;
    }   
}
