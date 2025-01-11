import java.util.Scanner;

public class RemoveCharacters905B {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int k=s.nextInt();
            String str=s.next();
            int v=n-k;
            if(v==1){
                System.out.println("Yes");
            }else{
                int arr[]=new int[26];
                for(int i=0;i<n;i++) {
                    int ind = str.charAt(i) - 97;
                    arr[ind] += 1;
                }

                    for(int i=0;i<26;i++){
                        if(arr[i]==0){
                            continue;
                        }
                        int ans=Math.min(v,(arr[i]/2)*2);
                        v=v-ans;
                        arr[i]=arr[i]-ans;
                        if(v%2!=0&&arr[i]>0){
                        v--;
                        }
                    }
                    if(v==0){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }

            }

        }
    }
}
