import java.util.Scanner;

public class Pipeline {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int ans=-1;
//        if(n<=k){
//            ans=1;
//        }
//        else{
            int l=0;
            int h=(k*(k-1))/2;
            while(l<=h){
                System.out.println("idhr1");
                int mid=(l+h)/2;
                if(n<=mid){
                    System.out.println("idhr2");
                    ans=mid;
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
        //}
        System.out.println(ans);
    }
}
