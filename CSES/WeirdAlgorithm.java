import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.print(n + " ");
        while (n > 1){
            if(n%2!=0)
                n = (3*n)+1;
            else 
                n>>=1;
            System.out.print(n + " ");
        }
    }
}
