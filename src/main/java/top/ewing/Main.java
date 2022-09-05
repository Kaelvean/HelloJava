package top.ewing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        if (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println("你的名字是：" + str);
        }
        System.out.println("Hello world!\n你好世界！");
        scanner.close();
    }
}