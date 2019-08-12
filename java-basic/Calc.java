import java.util.Scanner;


class Calc{
    
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        int input1, input2 , result = 0;
        System.out.print("숫자입력1>");
        input1 = scan.nextInt();

        System.out.print("숫자입력2>");
        input2 = scan.nextInt();

        //result = input1 + input2;

       // System.out.println(String.format("%d + %d = %d", input1, input2, result));
        String op = null;
        System.out.print("연산종류 선택 +  , - ,  * , /  > ");
        op = scan.next();


        if(op.equals("+")){
            result = input1 + input2;
             System.out.println(String.format("%d + %d = %d", input1, input2, result));

        }else if(op.equals("-")){
             result = input1 - input2;
              System.out.println(String.format("%d - %d = %d", input1, input2, result));

        }else if(op.equals("*")){
             result = input1 * input2;
              System.out.println(String.format("%d * %d = %d", input1, input2, result));

        }else if(op.equals("/")){
             result = input1 / input2;
              System.out.println(String.format("%d / %d = %d", input1, input2, result));
        }else {
             result = input1 + input2;
              System.out.println(String.format("%d + %d = %d", input1, input2, result));
        }

        



    }
}