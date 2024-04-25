package com.example;

import java.util.Scanner;

public class Three {
  public static void main(String[] args) {
    try {
      System.out.println("请输入苹果的斤数:");
      Scanner scnApple = new Scanner(System.in);
      int amoutApple = scnApple.nextInt();
      if (amoutApple < 0) {
        System.out.println("苹果的斤数不能小于0");
        return;
      }

      System.out.println("请输入草莓的斤数:");
      Scanner scnStraw = new Scanner(System.in);
      int amoutStraw = scnStraw.nextInt();
      if (amoutStraw < 0) {
        System.out.println("草莓的斤数不能小于0");
        return;
      }

      System.out.println("请输入芒果的斤数:");
      Scanner scnMango = new Scanner(System.in);
      int amoutMango = scnMango.nextInt();
      if (amoutMango < 0) {
        System.out.println("芒果的斤数不能小于0");
        return;
      }

      System.out.println("共花费:" + (8 * amoutApple + 13 * amoutStraw * 0.8 + 20 * amoutMango) + "元");
    } catch (Exception e) {
      System.out.println("输入有误");
    }
  }
}
