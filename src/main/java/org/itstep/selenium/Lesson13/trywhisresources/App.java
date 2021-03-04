package org.itstep.selenium.Lesson13.trywhisresources;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //        try {
//            scanner = new Scanner(System.in);
//            System.out.println("Введите число");
//            int i = scanner.nextInt();
//        } catch (InputMismatchException e) {
//            e.printStackTrace();
//        } finally { //выполняется в любом случае
//            if (scanner != null) {
//                scanner.close();
//            }
//        }


        //try с ресурсами не требует finally
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число");
            int i = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
