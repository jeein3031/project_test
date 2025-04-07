// Source code is decompiled from a .class file using FernFlower decompiler.
package project_test.jinstudy;

public class Calculat {
   public static void sum() {
      int sum = 0;

      for(int i = 1; i <= 100; ++i) {
         sum += i;
      }

      System.out.println("정답 =" + sum);
   }
   public static void even_odd_sum() {
      int total = 0;
      int total2 = 0;
      int i;
      for(i = 1; i <= 100; ++i) {
         if (i % 2 == 0) {
            total += i;
         }

         System.out.println("짝수합 = " + total);
      }
      for(i = 1; i <= 100; ++i) {
         if (i % 2 != 0) {
            total2 += i;
         }

         System.out.println("홀수합 = " + total2);
      }
   }
}
