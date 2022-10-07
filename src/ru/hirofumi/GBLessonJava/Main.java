package ru.hirofumi.GBLessonJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//  HW3
//        System.out.println(HW3.DeleteEvenNumbersFromList(new ArrayList<>(Arrays.asList(1, 2, 4, 4, 5, 8, 8, 8))));
//        System.out.println(Collections.max(new ArrayList<>(Arrays.asList(1, 2, 4, 4, 5, 8, 8, 8))));
//        System.out.println(Collections.min(new ArrayList<>(Arrays.asList(1, 2, 4, 4, 5, 8, 8, 8))));
//        System.out.println((HW3.CalculateMedianFromList(new ArrayList<>(Arrays.asList(1, 2, 4, 4, 5, 8, 8, 8)))));
//  HW4

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        System.out.println("List: " + linkedList);
        System.out.println("Reversed list: " + HW4.LinkedListReverse(linkedList));
        System.out.println("Reversed list: " + HW4.LinkedListReverseIterator(linkedList));
        System.out.println(HW4.CalculateSumOfLinkedListElements(linkedList));
        System.out.println();

    }
}
