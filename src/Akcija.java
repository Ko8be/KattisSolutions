import java.util.Scanner;
import java.util.Arrays;

public class Akcija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        int sum = 0;

        for(int i = n - 1; i > n % 3; i-=3){
            sum += arr[i];
            sum += arr[i - 1];

        }

        for(int i=0;i<n % 3;i++)sum += arr[i];


        System.out.println(sum);


    }
}
