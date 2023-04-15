import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long l=sc.nextLong();
        long r=sc.nextLong();
        long k=sc.nextLong();
        long[] a=new long[(int)n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long sum=0, c=0;
        for(int i=0;i<n;i++){
            if(a[i]<=r && a[i]>=l)
            {
                if((sum+a[i])>k)
             break;
             else
             {
                 sum+=a[i];
             c++;
             
             }
            }
        }
        System.out.println(c);
    }
}