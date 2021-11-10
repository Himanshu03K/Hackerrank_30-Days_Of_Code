import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String S= sc.nextLine();
        n= n+4;
        d= d+ 4.0;
        String S1 = "HackerRank ";
        S = S1 + S;
        System.out.println(n+"\n"+d+"\n"+S);
    }
}
