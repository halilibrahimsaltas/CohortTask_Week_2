import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter value : ");
        int N = inp.nextInt();
        System.out.print("print : ");

        printLoopLow(N, N);

    }

    static int printLoopLow(int nLow,int nUp) {
        System.out.print(nLow + " ");
        if (nLow > 0) {
            nLow -= 5;
            return printLoopLow(nLow, nUp);
        } else {
            return printLoopUp(nLow, nUp);
        }
    }

    static int printLoopUp(int nLow,int nUp) {
        if (nLow < nUp) {
            nLow += 5;
            System.out.print(nLow + " ");
            return printLoopUp(nLow, nUp);
        }
        else
            return nLow;
    }
}
