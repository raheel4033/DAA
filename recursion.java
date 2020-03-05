import java.util.Scanner;
import java.lang.String;

public class recursion {
    public static void TOH(int n,char start,char aux,char end)
    {
        if(n==1)
        {
            System.out.println("Disk:"+n+" start:"+start+" to"+" end:"+end);
        }
        else
        {
            TOH(n-1,start,end,aux);
            System.out.println("Disk:"+n+" start:"+start+" to"+" end:"+end);
            TOH(n-1,aux,start,end);

        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the number of disks:");
        int disk =scan.nextInt();
        TOH(disk,'S','A','E');

    }

}
