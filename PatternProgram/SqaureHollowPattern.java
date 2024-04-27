// Solution 1

// "static void main" must be defined in a public class.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int st = n, sp = (n * 2) - 1;
        for (int i=1 ; i<=n; i++) {
            if ( i == 1 || i == n) {
                for (int j=1 ; j<=st; j++) {
                    System.out.print("* ");
                }
            } 
            else {
             for (int j=1 ;j <= sp;j++) {
                if ( j==1 || j==sp) {
                        System.out.print("*");
                } else {
                        System.out.print(" ");
                    }
                }   
            }
            System.out.println();
        }
    }
}

/*

*****
*   *
*   *
*   *
*   *
*****

n=5
i=0 ,st=5, sp=0
i=1 ,st=2, sp=3
i=3 ,st=2, sp=3
i=4 ,st=2, sp=3
i=5 ,st=2, sp=3
i=1 ,st=5, sp=0

*/

// Solution 2

// "static void main" must be defined in a public class.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int st = n;
        // sp = (n * 2) - 1;
        for (int i=1 ; i<=n; i++) {
            for (int j=1 ; j<=st; j++) {
                if ( i == 1 || i == n) {
                    System.out.print("* ");
                }  else if (i == n) {
                    System.out.print("*");
                } else {
                    if ( j == 1) {
                        System.out.print("* ");
                    } else if (j== n) {
                        System.out.print("*");
                    } else {
                        System.out.print("  ");
                    }
                }
            } 
            System.out.println();
        }
    }
}

/*

*****
*   *
*   *
*   *
*   *
*****

n=5
i=0 ,st=5, sp=0
i=1 ,st=2, sp=3
i=3 ,st=2, sp=3
i=4 ,st=2, sp=3
i=5 ,st=2, sp=3
i=1 ,st=5, sp=0


*/