import java.util.Scanner;


class Calc{
    
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.print("숫자입력>");
        int input1 = scan.nextInt();

        System.out.print("숫자입력>");
        int input2 = scan.nextInt();

        int sum = input1 + input2;

        System.out.println(String.format("%d + %d = %d", input1, input2, sum));
        


    }
}