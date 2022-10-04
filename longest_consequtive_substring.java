import java.util.*;

public class longest_consequtive_substring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        int count=1;
        int maxx=0;
        Arrays.sort(a);
        for (int i = 0; i < n-1; i++) {
            if(a[i]+1 == a[i+1]){
                count++;
                maxx=Math.max(maxx,count);
            }
            else  
              count=1;
        }
        System.out.println(maxx);
    }
}
