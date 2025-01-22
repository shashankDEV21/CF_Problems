import java.util.Scanner;

public class CF996A {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int a=s.nextInt();
            int b=s.nextInt();
            if(Math.abs(a-b)%2==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
