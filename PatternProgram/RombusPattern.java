// "static void main" must be defined in a public class.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int st = 4, sp = 0 ;
        for (int i=1 ; i<=n; i++) { //1
            for (int j=1 ; j<=sp; j++) {
                System.out.print(" ");
            }
            for (int j=1 ; j<=st; j++) {
                System.out.print("*");
            }
            sp++;
            System.out.println();
        }
    }
}

/*


****
 ****
  ****
   ****
    ****


n = 4
i = 1 , st=4 , sp=0 
i = 2 , st=4 , sp=1
i = 3 , st=4 , sp=2
i = 4 , st=4 , sp=3

*/