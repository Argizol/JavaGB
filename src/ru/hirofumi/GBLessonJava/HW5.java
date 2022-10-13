package ru.hirofumi.GBLessonJava;

import java.util.ArrayList;
import java.util.HashMap;

public class HW5 {
	public static void createAndPrintPhonebook(String[] arr){
		HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
		ArrayList<String> phones = new ArrayList<>();
		for (String str: arr) {
			var temp = str.split("-");
			if(!phoneBook.containsKey(temp[0])){
				phones = new ArrayList<>();
				phones.add(temp[1]);
				phoneBook.put(temp[0], phones);

			} else if (phoneBook.containsKey(temp[0])){
				phones.add(temp[1]);
			}

		}
		System.out.println(phoneBook);
	}
}
