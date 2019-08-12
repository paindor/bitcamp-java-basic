import java.util.Scanner;
import java.util.Random;

class RockPaperScissors{

    public static void main(String[] args){
        System.out.println("가위 바위 보!");
        int rps , com = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        com = random.nextInt(3) +1;

        System.out.println("1.가위  2.바위  3.보  4.랜덤");
        rps = scan.nextInt();
        if(rps == 4)
        {
            rps = random.nextInt(3)+1;

        }



        //컴퓨터가 바위를 냈다
        
        if(rps == 1){
             System.out.println("당신: 가위");
            if(com == 1){
                System.out.println("com: 가위");
                System.out.println(" 무승부 ");
            }else if(com == 2){
                 System.out.println("com: 바위");
                 System.out.println("너의 패배");
            }else{
                 System.out.println("com 보");
                 System.out.println("당신의 승리.");
            }
            //if(rps = 
          
        }else if(rps == 2){
             System.out.println("당신: 바위");
             if(com == 1){
                  System.out.println("com: 가위");
                  System.out.println("당신의 승리");

            }else if(com == 2){
                 System.out.println("com: 바위");
                 System.out.println(" 무승부 ");

            }else{
                 System.out.println("com: 보");
                 System.out.println("너의 패배");
                
            }
           

        }else if(rps == 3){
             System.out.println("당신: 보");
             if(com == 1){
                  System.out.println("com: 가위");
                  System.out.println("너의 패배");

            }else if(com == 2){
                 System.out.println("com: 바위");
                 System.out.println("당신의 승리.");

            }else{
                 System.out.println("com: 보");
                 System.out.println(" 무승부 ");
                
            }
            ;


        }else{
            System.out.println("잘못된선택");
        }


    }
}