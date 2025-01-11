import java.util.Scanner;

public class sumRiddle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            long n=s.nextLong();
            long l,r;
            r=n;
            l=-(n-1);
            System.out.println(l+" "+r);
        }
    }
}
