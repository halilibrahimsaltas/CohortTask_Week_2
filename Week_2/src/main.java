import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int q = input.nextInt();

        for (int i = 0; i < q; i++) {
            int n = input.nextInt();
            int[] list = new int[n];
            int leap = input.nextInt();
            for (int p = 0; p < n; p++) {
                int t = input.nextInt();
                list[p] = t;
            }
            if (canWin(list, leap)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean canWin(int[] list, int leap) {
        return canWinHelper(list, leap, 0);
    }

    private static boolean canWinHelper(int[] list, int leap, int index) {
        if (index < 0 || list[index] == 1) {
            return false;
        }
        if (index >= list.length - 1 || index + leap >= list.length) {
            return true;
        }

        list[index] = 1; // Mark as visited
        return canWinHelper(list, leap, index + 1) ||
                canWinHelper(list, leap, index - 1) ||
                canWinHelper(list, leap, index + leap);
    }
}