public class Selection {
    public static void main(String[] args)
    {
        int arr[] = {18,4,5,66,1,33,4};
        selectionSort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static int[] selectionSort(int[] list)
    {
        int i,j,minValue,minIndex,temp=0;
        for (i=0;i<list.length;i++)
        {
            minValue = list[i];
            minIndex = i;
            for (j=i;j<list.length;j++)
            {
                if (list[j]<minValue)
                {
                    minValue =list[j];
                    minIndex =j;
                }

            }
            if (minValue<list[i]){
                temp=list[i];
                list[i]=minIndex;
                list[minIndex]=temp;

            }
        }
        return list;
    }
}
