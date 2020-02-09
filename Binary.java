import java.util.Scanner;
public class Binary {
    //binary search always work on a sorted list
    public static int[] list = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search:");
        int n = sc.nextInt();
        if (binarySearch(list,n))
        {
            System.out.println("Found...");
        }
        else
        {
            System.out.println("Not Found...");
        }
    }

    private static boolean binarySearch(final int[] array, final int search) {
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (array[middle] < search) {
                first = middle + 1;
            } else if (array[middle] == search) {
                return true;
            } else
            {
                last =middle+1;
            }
            middle=(first+last)/2;
        }
        return false;

    }
}
