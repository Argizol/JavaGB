package ru.hirofumi.GBLessonJava;

import java.util.ArrayList;

public class Notebook {
	private String name;
	private String vendor;
	private String cpuVendor;
	private String color;
	private String osName;
	public static ArrayList<Notebook> list = new ArrayList<>();

	public enum Vendors{
		Asus,
		MSI,
		Lenovo
	}
	public enum CpuVendors{
		Intel,
		AMD
	}
	public enum Color{
		red,
		green,
		blue,
		black
	}
	public enum OS{
		Windows,
		Linux,
		DOS,
		WithoutOS
	}

	public Notebook(String name, CpuVendors cpuVendors, Vendors vendor, Color color, OS osName) {
		this.name = name;
		this.vendor = vendor.toString().toLowerCase();
		this.cpuVendor = cpuVendors.toString().toLowerCase();
		this.color = color.toString().toLowerCase();
		this.osName = osName.toString().toLowerCase();
	}

	public static void printFiltered(String name){
		ArrayList<Notebook> filteredList = new ArrayList<>();
		for (Notebook obj: list) {
			if(obj.getName().equals(name.toLowerCase())){
				filteredList.add(obj);
			}
			else if(obj.getColor().equals(name.toLowerCase())){
				filteredList.add(obj);
			}
			else if(obj.getCpuVendor().equals(name.toLowerCase())){
				filteredList.add(obj);
			}
			else if(obj.getOsName().equals(name.toLowerCase())){
				filteredList.add(obj);
			}
			else if(obj.getVendor().equals(name.toLowerCase())) {
				filteredList.add(obj);
			}
		}
		if (filteredList.size() == 0){
			System.out.println("Подходящих моделей не найдено");
			return;
		}
		System.out.println(filteredList);
	}

	@Override
	public String toString() {
		return "Notebook{" +
				"name='" + name + '\'' +
				", vendor='" + vendor + '\'' +
				", cpuVendor='" + cpuVendor + '\'' +
				", color='" + color + '\'' +
				", osName='" + osName + '\'' +
				'}' + '\n';
	}

	public String getName() {
		return name;
	}

	public String getVendor() {
		return vendor;
	}

	public String getCpuVendor() {
		return cpuVendor;
	}

	public String getColor() {
		return color;
	}

	public String getOsName() {
		return osName;
	}
}
