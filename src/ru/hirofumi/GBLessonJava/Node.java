package ru.hirofumi.GBLessonJava;

public class Node {
	int data;       // целочисленные данные
	Node next;      // указатель на следующий узел

	public Node(int data)
	{
		// устанавливаем данные в выделенном узле и возвращаем их
		this.data = data;
		this.next = null;
	}
}
