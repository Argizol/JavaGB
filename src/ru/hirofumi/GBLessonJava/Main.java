package ru.hirofumi.GBLessonJava;

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

        Notebook.printFiltered("Asus");
        System.out.println();
        Notebook.printFiltered("Intel");
        System.out.println();
        Notebook.printFiltered("AMD");
        System.out.println();
        Notebook.printFiltered("31");
        System.out.println();
        Notebook.printFiltered("Linux");

    }
}


