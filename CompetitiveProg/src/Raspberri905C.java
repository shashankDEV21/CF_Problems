import java.util.Scanner;

public class Raspberri905C {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int k=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            int a=1,min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                a=a*arr[i];
                int x=arr[i]%k;
                int y=arr[i]/k;

                    min=Math.min(min,(y+1)*k-arr[i]);

                //min=Math.min(min,Math.abs(k-arr[i]));
            }
            if(a%k==0){
                System.out.println(0);
            }else{
                System.out.println(min);
            }
        }
    }
}
