import java.util.Scanner;

class Calc_Minus{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자입력1>");
        int num1 = scan.nextInt();
        System.out.print("숫자입력2>");
        int num2 = scan.nextInt();

        int result = num1 - num2;

        System.out.println(String.format("%d - %d = %d",num1, num2, result ));


    }
}