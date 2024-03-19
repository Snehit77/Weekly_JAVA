import java.util.Scanner;
public class Fraction {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numerator");
        int num=scan.nextInt();

        System.out.println("Enter the denomirator");
        int denum=scan.nextInt();

        if (denum==0){
            System.out.println("Error Value zero");
        }
        float fraction=num/denum;
        System.out.println("The fractional value is " + fraction);
    }
}
