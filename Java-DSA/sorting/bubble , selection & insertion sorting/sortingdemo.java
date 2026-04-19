public class sortingdemo 
{
    public static void main(String[] args)
    {
        int[] array={87,12,76,34,56,1,7};
        System.out.println("Unsorted array :- ");
        for(int j:array)
        {
            System.out.print(j+"  ");
        }
        System.out.println("\nBubble sorting :-");
        int[] sortedarray=bubblesort(array);
        for(int i:sortedarray)
        {
            System.out.print(i+"  ");
        }
        int[] aray={87,12,76,34,56,1,7,53};
         System.out.println("\nSelection sorting :-");
        int[] sorted=selectionsort(aray);
        for(int i:sorted)
        {
            System.out.print(i+"  ");
        }
        int[] test={6,1,5,2,8,9,11,3};
        System.out.println("\nInsertion sorting :-");
        int[] insertiontest=insertionsort(test);
        for(int t:insertiontest)
        {
            System.out.print(t+"  ");
        }

    }
    public static int[] sort(int[] array)
    {
        int n=array.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                c++;
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Loop count : "+c);
        return array;
 
    }
    public static int[] bubblesort(int[] array)
    {   
        int temp=0,c=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                c++;
                if(array[j]>array[j+1])
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            for(int q:array)
            {
                System.out.print(q+"  ");
            }
            System.out.println();
        }
        System.out.println("Loop count : "+c);
        return array;
    } 
    public static int[] selectionsort(int[] array)
    {
       int c=0,temp=0,minidx=0;
        for(int i=0;i<array.length;i++)
        {
           
            minidx=i;
            for(int j=i+1;j<array.length;j++)
            {
                c++;
                if(array[minidx]>array[j])
                    minidx=j;
            }
            temp=array[i];
            array[i]=array[minidx];
            array[minidx]=temp;
            for(int k:array)
            {
                System.out.print(k+"  ");
            }
            System.out.println();
        }
        System.out.println("Loop count : "+c);
        return array;
    }
            // test={6,1,5,2,8,9,11,3};
    private static int[] insertionsort(int[] array)
    {
        int c=0;
        for(int i=1;i<array.length;i++)
        {
            int j=i-1;
            int key=array[i];
            while(j>=0 && array[j]>key)
            {
                c++;
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
             for(int k:array)
            {
                System.out.print(k+"  ");
            }
            System.out.println();
        }
        System.out.println("Loop count : "+c);
        return array;
    }
}
