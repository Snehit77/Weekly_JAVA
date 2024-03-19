import java.util.Scanner;
public class Square {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.println("Input the length of a squares side ");
        float length=scan.nextFloat();

        float perimeter=4*length;
        float area=length*length;
        System.out.println("The Perimeter is " + perimeter + " and Area is " + area);
    }
}
