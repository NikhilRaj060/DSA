// "static void main" must be defined in a public class.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        for (int i=1 ; i<=n; i++) {
            for (int j=1 ; j<=i; j++) {
                if ( i % 2 == 0){
                    if ( j % 2 != 0){
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                } else {
                    if ( j % 2 != 0){
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}

/*

1
0 1
1 0 1
0 1 0 1


n = 4
i = 1 , st=1
i = 2 , st=2
i = 3 , st=3
i = 4 , st=4

*/