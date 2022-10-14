package ru.hirofumi.GBLessonJava;

public class Main {

    public static void main(String[] args) {
//        HW5
//        Task1

//        String[] arr = {"Вася 1231", "Вася 1111",
//                        "Игорь 11131", "Игорь 1231",
//                        "Игорь 1231", "Игорь 1231",
//                        "Игорь 1231", "Игорь 1231",
//                        "Игорь 1231", "Игорь 1231",
//                        "Петя 44431", "Петя 1231"};
//        System.out.println(HW5.createAndPrintPhonebook(arr));
//        Task 2
        var names = new String[]{"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"};
        System.out.println("Посчитанные без сортировки " + HW5.countPersons(names));
        System.out.println("Посчитанные с сортировкой " + HW5.sortedTreeByValue(HW5.countPersons(names)));
    }

}


