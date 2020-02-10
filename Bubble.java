public class Bubble {
    public static void main(String[] args)
    {
        int arr[] = {23,4,56,2,1,5,66,14};
        bubbleSort(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] bubbleSort(int[] list)
    {
        int i,j,temp=0;
        for (i=0;i<list.length-1;i++)
        {
            for (j=0;j<list.length-1-i;j++)
            {
                if (list[j]>list[j+1])
                {
                    temp = list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        return list;
    }
}
