import java.util.Scanner;
public class Linear {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int n=7;
    int arr[] = {12,455,56,3,4,55,656,455};

    System.out.println("Enter the values to be search...");
    int src =sc.nextInt();
    int i;
    for (i=0;i<n;i++)
    {
        if (arr[i]==src)
        {
            System.out.println(src+"  is found & position is :"+(i+1));
            break;
        }
    }
    if (i==n){
        System.out.println(src+" Not found");
    }

    }
}
