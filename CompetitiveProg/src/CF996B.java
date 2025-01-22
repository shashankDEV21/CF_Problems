import java.util.Scanner;

public class CF996B {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = s.nextInt();
            }
            int i=0;
            boolean flag=false;
            for ( i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    int k = b[i] - a[i];
                    while (k-- > 0) {
                        a[i] += 1;
                        for (int j = 0; j < n; j++) {
                            if (j != i) {
                                if (a[j] <= 0) {
                                    System.out.println("No");
                                    flag=true;
                                    break;
                                }

                                a[j] -= 1;
                            }
                        }

                    }
                } else {
                    continue;
                }
            }
            if(!flag){
                System.out.println("Yes");
            }
        }

    }
}
