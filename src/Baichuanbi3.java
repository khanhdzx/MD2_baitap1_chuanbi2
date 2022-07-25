
import java.util.Scanner;

public class Baichuanbi3 {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a= input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 && b==0){
            System.out.println("no greatest common factor");
        }else if(a==0||b==0){
            System.out.println("great common factor:"+ Math.abs(a-b));
        } else{
            while (a!=b){
                if(a>b){
                    a=a-b;
                    System.out.println("a= " + a);
                }else{
                    b = b - a;
                    System.out.println("b = "+ b);
                }
            }
            System.out.println("greatest common factor: "+ a);
        }

    }

}