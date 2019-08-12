import java.util.Scanner;

class WhatName{

    public static void main(String[] args){
        System.out.println("이름뭐야?");
        String name = "";

        
        //값입력
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
       
        System.out.println(String.format("이름은  %s 이다", name));
        System.out.print("몇살이야?");
        int age = 0;
        age = scanner.nextInt();
        System.out.print(String.format("%d 이다", age));




        
    }
}
