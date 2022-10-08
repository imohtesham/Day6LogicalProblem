import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter minimum number : ");
        int min = scan.nextInt();
        System.out.println("Enter maximum number : ");
        int max = scan.nextInt();
        isPerfectNumber(min,max);
    }
    public static void isPerfectNumber(int min, int max)
    {
        int num = 0;
        for(num=min;num <= max;num++)
        {
            int sum =0;
            for (int i=1;i < num;i++)
            {
                if ( num % i == 0)
                {
                    sum = sum + i;
                }
            }
            if (sum == num)
            {
                System.out.println(num + " is a Perfect Number");
            }
        }
    }
}
