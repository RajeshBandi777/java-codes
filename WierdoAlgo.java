import java.util.*;

public class WierdoAlgo {

    static void elll(int n) {
        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.print(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("enter the numbers");
        int n = sc.nextInt();
        elll(n);   
    }
}
