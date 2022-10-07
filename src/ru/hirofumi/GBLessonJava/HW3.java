package ru.hirofumi.GBLessonJava;

import java.util.ArrayList;
import java.util.List;

public class HW3 {

	public static List<Integer> DeleteEvenNumbersFromList(ArrayList<Integer> list){
		for (int i = list.size() - 1; i > 0; i--) {
			if (list.get(i) % 2 == 0) list.remove(i);
		}
		return list;
	}
	public static int CalculateMedianFromList(ArrayList<Integer> list){
		int result = 0;
		for (int num: list) result += num;

		return (int) (result * 0.5);
	}
}
