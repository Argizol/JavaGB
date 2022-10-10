package ru.hirofumi.GBLessonJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class HW4 {

	public static LinkedList<Integer> LinkedListReverse(LinkedList<Integer> linkedList){
		var arr = linkedList.toArray();
		LinkedList<Integer> reversedLinkedList = new LinkedList<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			reversedLinkedList.add((Integer) arr[i]);
		}
		return reversedLinkedList;
	}

	public static int CalculateSumOfLinkedListElements(LinkedList<Integer> linkedList){
		int result = 0;
		ListIterator<Integer> iteratorInt = linkedList.listIterator();
		while (iteratorInt.hasNext()){
			result += iteratorInt.next();
		}
		return result;
	}
	public static LinkedList<Integer> LinkedListReverseIterator(LinkedList<Integer> linkedList){
		LinkedList<Integer> reversedLinkedList = new LinkedList<>();
		ListIterator<Integer> iteratorInt = linkedList.listIterator();
		while(iteratorInt.hasNext()){
			iteratorInt.next();
		}
		while(iteratorInt.hasPrevious()){
			reversedLinkedList.add(iteratorInt.previous());
		}
		return reversedLinkedList;
	}
}
