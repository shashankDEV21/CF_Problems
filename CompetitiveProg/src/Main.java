import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int n=s.nextInt();
        int w=s.nextInt();
       int res=(k*w*(w+1)-2*n)/2;
       if(res<0){
           System.out.println(0);
       }else
       System.out.println(res);
    }
}