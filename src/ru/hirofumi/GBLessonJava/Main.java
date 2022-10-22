package ru.hirofumi.GBLessonJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Notebook.list.add(new Notebook("SuperNote", Notebook.CpuVendors.AMD,
                Notebook.Vendors.Asus, Notebook.Color.black, Notebook.OS.WithoutOS));
        Notebook.list.add(new Notebook("23", Notebook.CpuVendors.Intel,
                Notebook.Vendors.Asus, Notebook.Color.black, Notebook.OS.WithoutOS));
        Notebook.list.add(new Notebook("31", Notebook.CpuVendors.AMD,
                Notebook.Vendors.MSI, Notebook.Color.red, Notebook.OS.Windows));
        Notebook.list.add(new Notebook("fdhfh", Notebook.CpuVendors.AMD,
                Notebook.Vendors.Lenovo, Notebook.Color.black, Notebook.OS.WithoutOS));
        Notebook.list.add(new Notebook("1133", Notebook.CpuVendors.AMD,
                Notebook.Vendors.Asus, Notebook.Color.green, Notebook.OS.DOS));
        Notebook.list.add(new Notebook("14213", Notebook.CpuVendors.AMD,
                Notebook.Vendors.Asus, Notebook.Color.blue, Notebook.OS.Linux));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметр для поиска (OS, производитель ноутбука," +
                "процессора, цвет, название модели)");
        String name = scanner.nextLine();
        Notebook.printFiltered(name);
    }
}


