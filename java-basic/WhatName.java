import java.util.Scanner;

class WhatName{

    public static void main(String[] args)
    {
        System.out.println("이름뭐야?");
        String name = "";

        
        //값입력
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
       
        System.out.println("이름은 " + name +  "이다");
        System.out.print("몇살이야?");
        int age = 0;
        age = scanner.nextInt();
        System.out.print(age + "살 이야");




        
    }
}
