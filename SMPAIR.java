import java.util.*;
import java.io.*;
class Smallest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            ArrayList<Integer> na=new ArrayList<Integer>();
            for(int a=0;a<n;a++){
                for(int b=a+1;b<n;b++){
                    int s=arr[a]+arr[b];
                    na.add(s);
                }
            }
            Collections.sort(na);
            System.out.println(na.get(0));
     
       }
    }
}