import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,s=0,ele;
        n = sc.nextInt();
        for(int i=0;i<n-1;i++){
            ele = sc.nextInt();
            s+=ele;
        }
        System.out.print(n*(n+1)/2-s);
    }
}
