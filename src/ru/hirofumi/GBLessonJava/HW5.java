package ru.hirofumi.GBLessonJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HW5 {

	//	Task1
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
	public static HashMap<String, ArrayList<String>>
	createAndPrintPhonebook(
			String[] arr,
			HashMap<String, ArrayList<String>> phoneBook,
			ArrayList<String> phones) {

		for (String str : arr) {
			var temp = str.split(" ");
			if (!phoneBook.containsKey(temp[0])) {
				phones = new ArrayList<>();
				phones.add(temp[1]);
				phoneBook.put(temp[0], phones);

			} else if (phoneBook.containsKey(temp[0])) {
				phones.add(temp[1]);
			}
		}
		return phoneBook;
	}

	//	Task2
//Пусть дан список сотрудников:Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
// Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
// Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений.
	public static HashMap<String, Integer> countPersons(String[] arr) {
		HashMap<String, String> persons = new HashMap<>();
		HashMap<String, Integer> result = new HashMap<>();
		int count = 1;
		for (String str : arr) {
			var tmp = str.split(" ");
			persons.put(tmp[1], tmp[0]);
			if (persons.values().contains(tmp[0])) {
				result.put(tmp[0], Collections.frequency(persons.values(), tmp[0]));
			}
		}
		return result;
	}
}



