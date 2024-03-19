import java.util.Scanner;
public class MileToKm {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the value in miles");
        float mile=scan.nextFloat();

        double km=1.60935*mile;
        System.out.println("The value in kilometer is"+km);
    }
}
