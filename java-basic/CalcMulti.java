import java.util.Scanner;
class CalcMulti{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자입력1>");
        int n1 = scan.nextInt();

        System.out.print("숫자입력1>");
        int n2 = scan.nextInt();

        int multi = n1 * n2;


        System.out.println(String.format("%d x %d = %d", n1, n2, multi) );
        

    }
}
