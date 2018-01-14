import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(f(n));
    }
    public static int f(int n){
        if (n == 0 || n ==1)
            return n+1;
        else
            return f(n-1) + f(n/2);
    }
}
