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
        int st = 1 , sp = n - 1;
        for (int i=1 ; i<=n; i++) {
            for (int j=1 ; j<=sp; j++) {
                System.out.print(" ");
            }
            for (int j=1 ; j<=st; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}

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
        int sp = n - 1; // sp =3
        for (int i=1 ; i<=n; i++) { //i =1
            for (int j=1 ; j<=n; j++) {
                if ( j <= sp) {
                    System.out.print(" ");
                } else {
                    System.out.print(i+" ");
                }
            }
            sp--;
            System.out.println();
        }
    }
}

/*

   1
  2 2
 3 3 3
4 4 4 4

n = 4
i = 1 , st=1 , sp=3
i = 2 , st=2 , sp=2 
i = 3 , st=3 , sp=1 
i = 4 , st=4 , sp=0 

*/