import java.util.Scanner;

public class Copyright {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj poziom piramidy: ");
        n = sc.nextInt();

        char sign=169;
        for(int i=0; i<n-1; i++) {
            System.out.print(" ");
        }
        System.out.println(sign);
        for(int k=0;k<n-2;k++) {
            for(int i=(n-k-2); i>0; i--) {
                System.out.print(" ");
            }
            System.out.print(sign);
            for(int i=0; i<(2*k)+1;i++) {
                System.out.print(" ");
            }
            System.out.println(sign);

        }
        for(int k=0; k<n; k++) {
            System.out.print(sign+" ");
        }


    }

}
