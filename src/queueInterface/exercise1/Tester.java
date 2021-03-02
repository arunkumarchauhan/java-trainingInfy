package queueInterface.exercise1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

class Tester {

	public static Deque<Object> mergeQueue(Deque<Integer> intQueue, Deque<Character> charQueue) {
		// Implement your logic here and change the return statement accordingly
		int longQueSize = intQueue.size() > charQueue.size() ? intQueue.size() : charQueue.size();

		Deque<Object> queue = new ArrayDeque();

		Iterator cque = charQueue.iterator();
		Iterator ique = intQueue.iterator();
		int i = 0;
		while (i < longQueSize) {
			if (ique.hasNext())
				queue.add(ique.next());
			if (cque.hasNext())
				queue.add(cque.next());

			i++;
		}

		return queue;
	}

	public static void main(String[] args) {

		Deque<Integer> integerQueue = new ArrayDeque<Integer>();
		integerQueue.add(3);
		integerQueue.add(6);
		integerQueue.add(9);

		Deque<Character> characterQueue = new ArrayDeque<Character>();
		characterQueue.add('a');
		characterQueue.add('e');
		characterQueue.add('i');
		characterQueue.add('o');
		characterQueue.add('u');
		characterQueue.add('b');

		Deque<Object> mergedQueue = mergeQueue(integerQueue, characterQueue);

		System.out.println("The elements in the merged queue are:");
		for (Object element : mergedQueue)
			System.out.println(element);

	}
}