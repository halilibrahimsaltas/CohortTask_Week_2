import java.util.Scanner;

public class Main {
    //Pattern of 5

    static int number (int inp) { //function
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: "); //İnput
        inp=input.nextInt();
        int t=inp;
        do { // loop
            System.out.print(t+" ");// output
            t -= 5;  //decrease
        } while (t > 0);{

        }
        if (t<=0){
            for(;t<=inp;t +=5){ //increase
                System.out.print(t +" ");// output
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        number(1);

    }
}