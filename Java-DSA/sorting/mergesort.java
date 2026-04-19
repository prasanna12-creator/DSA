public class mergesort 
{
    public static void main (String[] args)
    {
        int[] array = {8,1,7,2,6,3,5,4,9};
        System.out.println("the original array :");
        for(int i:array)
        {
            System.out.print(i+"  ");
        }
        System.out.println();
        mergesorting(array,0,array.length-1);
        System.out.println("The sorted array :");
        for (int j:array)
        {
            System.out.print(j+"  ");
        }
        System.out.println();     
    }
    private static void mergesorting(int[] array, int left, int right) 
    {
        
        if(left<right)
        {
            int mid=(left+right)/2;
            mergesorting(array,left,mid);
            mergesorting(array,mid+1,right);
            merge(array,left,right,mid);
        }
       
    }
    private static void merge(int[] array, int left, int right,int mid) 
    {
        int m1=mid-left+1;
        int m2=right-mid;
       int[] n1 = new int[m1];
       int[] n2 = new int[m2];

       for(int z=0;z<m1;z++)
       {
        n1[z]=array[z+left];
       }
       for(int x=0;x<m2;x++)
        {
            n2[x]=array[x+mid+1];
        }
        int j=0,k=left,i=0;
        
        while(i<m1 && j<m2)
        {
            if(n1[i]<=n2[j])
                {
                    array[k]=n1[i];
                    i++;
                }
            else
                {
                    array[k]=n2[j];
                    j++;
                }   
                k++;
        }
        while(i<m1)
        {
            array[k]=n1[i];
            i++;
            k++;
        }
        while(j<m2)
        {
            array[k]=n2[j];
            k++;
            j++;
        }
    }
}
