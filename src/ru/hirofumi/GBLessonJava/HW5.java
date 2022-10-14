package ru.hirofumi.GBLessonJava;

import java.util.*;

public class HW5 {

	//	Task1
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
	public static HashMap<String, ArrayList<String>> createAndPrintPhonebook(String[] arr) {
		HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
		ArrayList<String> phones = new ArrayList<>();
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
		HashMap<String, Integer> countedName = new HashMap<>();
		for (String str : arr) {
			var tmp = str.split(" ");
			persons.put(tmp[1], tmp[0]);
			countedName.put(tmp[0], Collections.frequency(persons.values(), tmp[0]));
		}
		return countedName; //возвращаем коллекцию с ключ = имя, значение = количество вхождений имени в коллекцию
	}
	public 	static TreeMap<Integer, ArrayList<String>> sortedTreeByValue(HashMap<String, Integer> countedName){

		TreeMap<Integer, ArrayList<String>> result = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer key1, Integer key2) {
				return Integer.compare(key2, key1);
			}
		});
		ArrayList<String> names = new ArrayList<>();

		for (int i = 0; i < countedName.size(); i++) {
			if(!result.containsKey(countedName.values().toArray()[i])){
				names = new ArrayList<>();
				names.add((String) countedName.keySet().toArray()[i]);
				result.put((Integer) countedName.values().toArray()[i], names);
			}else names.add((String) countedName.keySet().toArray()[i]);
		}
		return result;
	}
}




