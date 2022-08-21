package com.RamizNasirovJava;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            String tasksText = "1) Составить алгоритм: если введенное число больше 7, то вывести “Привет”\n" +
                    "2) Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\"\n" +
                    "3) Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3\n" +
                    "0) Завершить приложение \n";
            System.out.print(tasksText);
            Tasks tasks = new Tasks();
            tasks.Task4();
        }
    }


        class Tasks{

            public void task1(){
                Scanner in = new Scanner(System.in);
                System.out.print("Введите число\n");
                while (!in.hasNextInt()) {
                    System.out.println("Вы ввели не число. Повторите");
                    in.next();
                }
                int checkNumber = in.nextInt();
                if(checkNumber>7){
                    System.out.print("Привет\n");
                }
            }

            public void Task2(){
                Scanner in = new Scanner(System.in, "Cp866");
                System.out.print("Введите имя\n");
                String checkName = in.nextLine();
                String comparingName = "Вячеслав";
                if(checkName.equalsIgnoreCase(comparingName)){
                    System.out.print("Привет, Вячеслав\n");
                }
                else {
                    System.out.print("Нет такого имени\n");
                }
            }

            public void Task3(){
                Scanner in = new Scanner(System.in);
                System.out.print("Введите числа через пробел\n");
                String checkStr = in.nextLine();
                String strArr[] = checkStr.split(" ");
                int numArr[] = new int[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    if(strArr[i].matches("[-+]?\\d+")){
                        numArr[i] = Integer.parseInt(strArr[i]);
                        if(numArr[i]%3==0){
                            System.out.println(numArr[i]);
                        }
                    }
                }
            }

            public void Task4(){
                Scanner in = new Scanner(System.in);
                System.out.print("Введите номер задачи: \n");
                while (!in.hasNextInt()) {
                    System.out.println("Вы ввели не число. Повторите");
                    in.next();
                }
                int taskNumber = in.nextInt();
                if(taskNumber==1){
                    task1();
                }
                else if(taskNumber==2){
                    Task2();
                }
                else if(taskNumber==3){
                    Task3();
                }
                else if(taskNumber==0){
                    System.exit(0);
                }
                else{
                    System.out.print("Такой задачи не существует\n");
                }
                System.out.print("\n-------------------------------------------------------------- \n");
                Task4();

            }
        }


