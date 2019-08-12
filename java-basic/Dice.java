
import java.util.Scanner;
import java.util.Random;


class Dice{
    // 주사위를 던져서 
    // 홀수 짝수 맞추기
    // 컴이 던져서 얻은값은 3 
    // 사용자는 "홀" , "짝" 선택 \
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
    int dice = ran.nextInt(6)+1;
    String result;

    if(dice % 2 == 0){
        result = "짝";
    }else{
        result = "홀";
    }
    System.out.println(String.format("랜덤수: %d" , dice));

    System.out.println("주사위는 던져졌습니다.");
    System.out.println(" 홀수: '홀'    짝수: '짝' ");
    String choice = scan.next();


    if(choice.equals(result)){
        System.out.println("맞췄습니다");
    }
    else{
        System.out.println("틀렸습니다.");
    }


    }
    



}