public class Quicksort {
    public static void quicksorting(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int piv =partition(arr,low,high);
            quicksorting(arr,low,piv-1);
            quicksorting(arr,piv+1,high);
        }
    }
    private static int partition(int[] arr,int low,int high)
    {
        int pivot=high;
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<arr[pivot]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int tep=arr[i+1];
        arr[i+1]=arr[pivot];
        arr[pivot]=tep;

        return i+1;

    }
    public static void main (String[] args)
    {
        int[] array ={5,1,3,4,7,2,6,9};
        quicksorting(array,0,array.length-1);
        for(int q:array)
        {
            System.out.print(q+"  ");
        }
        System.out.println();
    }
}
