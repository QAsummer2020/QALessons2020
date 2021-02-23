package org.itstep.selenium.Lesson7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) throws InterruptedException {

//        Scanner scanner = new Scanner(System.in);
//        int res = 0;
//        System.out.println("Enter a = ");
//        byte a = scanner.nextByte();
//        System.out.println("Enter b = ");
//        byte b = scanner.nextByte();
//        System.out.println("Enter operation = ");
//        String op = scanner.next();
//        switch (op.charAt(0)) {
//            case '+':
//                res = a + b;
//                break;
//            case '-':
//                res = a - b;
//                break;
//            case '*':
//                res = a * b;
//                break;
//            case '/':
//                if (b != 0)
//                    res = a / b;
//                else
//                    System.out.println("Делить на 0 нельзя");
//
//                break;
//
//        }
//        System.out.println(res);
///////////////////////////////////////////////////////

//        Scanner scanner = new Scanner(System.in);
//        int res = 0;
//        System.out.println("Enter a = ");
//        String temp = scanner.next();
//        int a = Integer.parseInt(temp);
//        System.out.println("Enter b = ");
//        byte b = scanner.nextByte();
//        System.out.println("Enter operation = ");
//        String op = scanner.next();
//        switch (op.charAt(0)) {
//            case '+':
//                res = a + b;
//                break;
//            case '-':
//                res = a - b;
//                break;
//            case '*':
//                res = a * b;
//                break;
//            case '/':
//                if (b != 0)
//                    res = a / b;
//                else
//                    System.out.println("Делить на 0 нельзя");
//
//                break;
//
//        }
//        System.out.println(res);
//    }

//        Scanner scanner = new Scanner(System.in);
//        int res = 0;
//        int a = 0;
//        byte b = 0;
//        System.out.println("Enter a = ");
//        try {
//            a = scanner.nextInt();
//        } catch (InputMismatchException exception) {
//            System.out.println("Программа выбросила  исключение");
//
//        }
//        System.out.println("Enter b = ");
//        try {
//             b = scanner.nextByte();
//        }catch (InputMismatchException exception){
//            System.out.println("Программа выбросила  исключение");
//        }
//        System.out.println("Enter operation = ");
//        String op = scanner.next();
//        switch (op.charAt(0)) {
//            case '+':
//                res = a + b;
//                break;
//            case '-':
//                res = a - b;
//                break;
//            case '*':
//                res = a * b;
//                break;
//            case '/':
//                if (b != 0)
//                    res = a / b;
//                else
//                    System.out.println("Делить на 0 нельзя");
//
//                break;
//
//        }
//        System.out.println(res);
//    }

        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int a = 0;
        byte b = 0;
        try {
            System.out.println("Enter a = ");
            a = scanner.nextInt();
            System.out.println("Enter b = ");
            b = scanner.nextByte();
            System.out.println("Enter operation = ");
            String op = scanner.next();
            switch (op.charAt(0)) {
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '*':
                    res = a * b;
                    break;
                case '/':
                    res = a / b;
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка");
        }
        System.out.println("Программа отработала, результат = " + res);


//        try {
//            Thread.sleep(5000);
//
//        } catch(InterruptedException e) {
//                e.printStackTrace();
//        } catch (Exception e){
//            e.printStackTrace();
//        }

        Thread.sleep(1000);
    }
}
