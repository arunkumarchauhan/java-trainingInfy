package assiSet9.queueInterfaceAssi2;

import java.util.ArrayDeque;
import java.util.Deque;

class Tester {

	public static Deque<Character> updateStack(Deque<Character> inputStack) {
		// Implement your logic here and change the return statement accordingly
		char a = inputStack.removeLast();
		char b = inputStack.removeLast();
		char c = inputStack.removeLast();
		inputStack.addFirst(a);
		inputStack.addFirst(b);
		inputStack.addFirst(c);
		return inputStack;
	}

	public static void main(String[] args) {

		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');

		Deque<Character> resultStack = updateStack(inputStack);

		System.out.println("The alphabets in updated stack are:");
		for (Character alphabet : resultStack)
			System.out.println(alphabet);
	}
}