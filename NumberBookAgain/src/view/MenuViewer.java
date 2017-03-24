package view;

import java.util.Scanner;

/**
 * Created by Jo_seungwan on 2017. 3. 24..
 */
public class MenuViewer {

    public static Scanner keyboard = new Scanner(System.in);

    public static void showMenu(){
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력\n2. 데이터 검색\n3. 데이터 삭제\n4. 프로그램 종료");
        System.out.print("선택 : ");
    }
}
