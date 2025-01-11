import java.util.HashMap;
import java.util.Scanner;

public class hamburgers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int[] ing=new int[3];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='B'){
                ing[0]+=1;
            }else if(str.charAt(i)=='S'){
                ing[1]+=1;
            }else{
                ing[2]+=1;
            }
        }
        int[] arr=new int[3];
        for (int i=0;i<3;i++){
            arr[i]=s.nextInt();
        }
        int[] brr=new int[3];
        for (int i=0;i<3;i++){
            brr[i]=s.nextInt();
        }

    double tot=s.nextInt();
        int exta=Math.max(0,ing[0]-arr[0]);
//        for (int i=0;i<3;i++){
//            System.out.println(ing[i]);
//            //brr[i]=s.nextInt();
//        }
        double ans=0;
        int i=0;

while(tot>=0){
    if(i==3){
        ans+=1;
        i=0;
    }
    if(ing[i]>arr[i]){
        int k=(ing[i]-arr[i])*brr[i];
        if(tot>=k){
            tot-=k;
            arr[i]=0;
            i+=1;
            //continue;
        }else{
            break;
        }
    }else{
    arr[i]=arr[i]-ing[i];
    i+=1;
    }
}
        System.out.println(ans);
    }
}
