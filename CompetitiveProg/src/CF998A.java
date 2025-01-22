import java.util.Scanner;

public class CF998A {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int[]arr=new int[4];
            for(int i=0;i<arr.length;i++){
                arr[i]=s.nextInt();
            }
            int x=arr[0]+arr[1];
            int y=arr[2]-arr[1];
            int z=arr[3]-arr[2];
            int count=1;
            if(x==y&&y==z){
                count=3;
            }else if(x==y||x==z||y==z){
                count=2;
            }else {
                count = 1;
            }
            System.out.println(count);
        }

    }
}
