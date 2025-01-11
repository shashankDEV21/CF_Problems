import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int x=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            int max=arr[0];
            for(int i=1;i<n;i++){
                max=Math.max(arr[i]-arr[i-1],max);
            }
            max=Math.max(2*(x-arr[n-1]),max);
            System.out.println(max);
        }
    }
}
