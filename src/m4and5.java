import java.util.Scanner;
public class m4and5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the limit of iteration?");
        int limit=scan.nextInt();
        for (int i=1; i<=limit;i*=4){
            System.out.println("Power of 4  "+i);
        }
        for (int i=1; i<=limit;i*=5){
            System.out.println("Power of 5  "+i);
        }
    }
}
