import java.util.Scanner;

class RockPaperScissors{

    public static void main(String[] args){
        System.out.println("가위 바위 보!");
        int rps , com = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("1.가위  2.바위  3.보  4.랜덤");
        rps = scan.nextInt();



        //컴퓨터가 바위를 냈다
        if(rps == 1){
            //if(rps = 
            System.out.println("너는 졌다.");
        }else if(rps == 2){
            System.out.println( " 무승부. ");

        }else if(rps == 3){
            System.out.println("당신은 이겼습니다.");;


        }else{
            System.out.println("잘못된선택");
        }


    }
}