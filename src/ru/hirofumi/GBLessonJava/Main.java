package ru.hirofumi.GBLessonJava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Task1. Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
*/
        String dir = System.getProperty("user.dir");
        String[] filesArray = HW2.GetFiles(dir);
        HW2.Task1(filesArray);
        System.out.println("Список файлов текущего каталога сохранен.");

/*Task2. Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
1 Расширение файла: txt
2 Расширение файла: pdf
3 Расширение файла:
4 Расширение файла: jpg
*/
        HW2.Task2(filesArray);
    }
}
