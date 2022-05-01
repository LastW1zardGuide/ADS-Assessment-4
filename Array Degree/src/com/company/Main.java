package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static int pleaseWork(int[] nums) {
        Map<Integer, Integer> left = new HashMap();
        Map<Integer, Integer> right = new HashMap();
        Map<Integer, Integer> count = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        int otvet = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                otvet = Math.min(otvet, right.get(x) - left.get(x) + 1);
            }
        }
        return otvet;
    }

    public static void main(String[] args) {
        // Укажите массив ниже.....
        int[] arr={1,2,2,3,1,4,2};
        System.out.println("Массив изменить можно в коде");
        System.out.println("Наименьшая длина подмассива имеющая одинаковое число равно: "
                +pleaseWork(arr));
    }
}
