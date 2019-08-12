import java.util.Scanner;

class CalcDivision{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자입력1>");
        int n1 = scan.nextInt();
        System.out.print("숫자입력2>");
        int n2 = scan.nextInt();

        int div = n1/ n2;

        System.out.println(String.format("%d / %d = %d", n1, n2, div));



    }
}