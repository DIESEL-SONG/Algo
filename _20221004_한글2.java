package _1주차;

import java.util.Scanner;

public class _20221004_한글2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String input = sc.nextLine();
      
      char c = input.charAt(0);
      System.out.println(c-44031);
      
        //String으로 입력을 받고 그것을 char(character)타입으로 바꿔준 후
        //한글의 유니코드가 44302부터 시작이므로 44301을 빼준다
   }
}