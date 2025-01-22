import java.util.Arrays;
import java.util.Scanner;

public class CF723A {
    public static void main(String[] args) {
        int arr[]=new int[3];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<3;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int a=arr[0],b=arr[1], c=arr[2];
        System.out.println(c-a);
//        int mid=(a+b)/2;
//       // System.out.println(arr[0]+" "+ arr[2]);
//        int sum=0;
//        for (int i = 0; i < 3; i++) {
//            sum+=Math.abs(arr[i]-mid);
//        }
//        System.out.println(sum);
    }
}
