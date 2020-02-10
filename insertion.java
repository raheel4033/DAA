public class insertion {
    public static void main(String[] args) {
        int arr[] = {13, 4, 65, 3, 46, 45, 66};
        insertionSort(arr);
        int sort[] = arr;
        for (int i = 0; i < sort.length; i++)
        {
            System.out.println(sort[i]);
        }

    }
    public static int[] insertionSort(int[] list)
    {
        int i,j,key,temp;
        for(i=1;i<list.length;i++)
        {
            key = list[i];
            j = i-1;
            while (j>=0&&key<list[j]){
                temp=list[j];
                list[j]=list[j+1];
                list[j+1]=temp;
                j--;
            }
        }
        return list;
    }

}
