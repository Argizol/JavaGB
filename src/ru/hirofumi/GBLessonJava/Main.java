package ru.hirofumi.GBLessonJava;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        HW5
//        Task1
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        ArrayList<String> phones = new ArrayList<>();
        String[] arr = {"Вася 1231", "Вася 1111",
                        "Игорь 11131", "Игорь 1231",
                        "Игорь 1231", "Игорь 1231",
                        "Игорь 1231", "Игорь 1231",
                        "Игорь 1231", "Игорь 1231",
                        "Петя 44431", "Петя 1231"};
        System.out.println(HW5.createAndPrintPhonebook(arr,phoneBook,phones));
//        Task 2
        var names = new String[]{"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"};
        System.out.println(HW5.countPersons(names));
    }

}


