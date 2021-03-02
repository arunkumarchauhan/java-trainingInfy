package queueInterface.exercise2;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub

		return o1 > o2 ? o1 : o2;
	}

}

public class Tester {

	public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
		// Implement your logic here and change the return statement accordingly
		int min = Integer.MAX_VALUE;
		int count = 0;
		for (Integer i : inputStack)
			if (i < min) {
				min = i;
			}
		for (Integer i : inputStack)
			if (i == min) {
				count++;
			}
		Iterator<Integer> it = inputStack.iterator();
		Deque<Integer> stack = new ArrayDeque<Integer>();
		while (it.hasNext()) {
			int x = it.next();
			if (x == min)
				it.remove();
		}

		for (int i = 0; i < count; i++)
			inputStack.addLast(min);

		return inputStack;
	}

	public static void main(String[] args) {

		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);

		Deque<Integer> updatedStack = changeSmallest(inputStack);

		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}