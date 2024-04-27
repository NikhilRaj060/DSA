
// "static void main" must be defined in a public class.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        for (int i=n ; i>=1; i--) {
            for (int j=1 ; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*

1 2 3 4
1 2 3
1 2
1


n = 4
i = 1 , st=4
i = 2 , st=2
i = 3 , st=3
i = 4 , st=4

*/