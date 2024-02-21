import java.util.Scanner;

public class Main {
    //Recursive Exponential
    static void power() { // power function
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) { //power function loop
            result *= base;
        }

        System.out.println("Sonuç : " + result);//output
    }

    public static void main(String[] args) {

        power();

    }
}