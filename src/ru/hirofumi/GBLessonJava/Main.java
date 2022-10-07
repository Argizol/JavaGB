package ru.hirofumi.GBLessonJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(HW3.DeleteEvenNumbersFromList(new ArrayList<>(Arrays.asList(1, 2, 4, 4, 5, 8, 8, 8))));
        System.out.println(Collections.max(new ArrayList<>(Arrays.asList(1, 2, 4, 4, 5, 8, 8, 8))));
        System.out.println(Collections.min(new ArrayList<>(Arrays.asList(1, 2, 4, 4, 5, 8, 8, 8))));
        System.out.println((HW3.CalculateMedanFromList(new ArrayList<>(Arrays.asList(1, 2, 4, 4, 5, 8, 8, 8)))));
    }
}
