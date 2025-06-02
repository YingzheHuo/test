package org.example;

import java.util.List;

// 传入List<String> 会报错
public class PrintUtils {
    public static void printList(List<? extends Number> list) {
        for (Number number: list) {
            System.out.println(number);
        }
    }
}
