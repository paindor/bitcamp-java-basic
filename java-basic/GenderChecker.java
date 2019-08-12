import java.util.Scanner;

/*
다음은 우리나라 주민번호 체계입니다.
9 : 1800 ~ 1899년에 태어난 남성
0 : 1800 ~ 1899년에 태어난 여성
1 : 1900 ~ 1999년에 태어난 남성
2 : 1900 ~ 1999년에 태어난 여성
3 : 2000 ~ 2099년에 태어난 남성
4 : 2000 ~ 2099년에 태어난 여성
5 : 1900 ~ 1999년에 태어난 외국인 남성
6 : 1900 ~ 1999년에 태어난 외국인 여성
7 : 2000 ~ 2099년에 태어난 외국인 남성
8 : 2000 ~ 2099년에 태어난 외국인 여성
*/
class GenderChecker{
    public static void main(String[] args){

        String ssn  = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("주민등록번호 입력>");
        ssn = scan.next();

        String num = ssn.substring(7,8);
        //System.out.println(num);
        if(num.equals("9")){
            System.out.println("1800 ~ 1899년에 태어난 남성");
        }else if(num.equals("0")){
            System.out.println("1800 ~ 1899년에 태어난 여성");
        }else if(num.equals("1")){
            System.out.println("1900 ~ 1999년에 태어난 남성");
        }else if(num.equals("2")){
             System.out.println("1900 ~ 1999년에 태어난 여성");   
        }else if(num.equals("3")){
            System.out.println("2000 ~ 2099년에 태어난 남성");
        }else if(num.equals("4")){
            System.out.println("2000 ~ 2099년에 태어난 여성");
        }else if(num.equals("5")){
            System.out.println("1900 ~ 1999년에 태어난 외국인 남성");
        }else if(num.equals("6")){
            System.out.println("1900 ~ 1999년에 태어난 외국인 여성");
        }else if(num.equals("7")){
            System.out.println("2000 ~ 2099년에 태어난 외국인 남성");
        }else if(num.equals("8")){
            System.out.println("2000 ~ 2099년에 태어난 외국인 여성");
        }


    }
}