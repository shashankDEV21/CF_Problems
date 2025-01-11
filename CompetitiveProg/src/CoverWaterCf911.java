import java.util.Scanner;

public class CoverWaterCf911 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
          int n=s.nextInt();
          String str=s.next();
          int count=0,ans=0,v=0;
          for(int i=0;i<n;i++){
              char c=str.charAt(i);
              if(c=='.'){
                  count++;
                  v++;
              } else if (c=='#') {
                  count=0;
              }
              if(count==3){
                  ans=2;
                  break;
              }
          }
          if(ans==2){
              System.out.println(ans);
          }else{
              System.out.println(v);
          }
        }
    }
}

