package com.company;

public class Main {

    public static void print(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println();
    }


    public static void bubbleSort(String[] args) {
        for (int j = 0; j < args.length; j++) {
            for (int i = j + 1; i < args.length; i++) {
                if (args[i].compareTo(args[j]) < 0) {
                    String temp = args[j];
                    args[j] = args[i];
                    args[i] = temp;
                }
            }
        }
    }


    public static void main(String[] args)
    {
        String[] stroka = {"букварь", "азбука", "дерево", "гранит", "вода"};

        bubbleSort(stroka);
        print(stroka);

    }
}
