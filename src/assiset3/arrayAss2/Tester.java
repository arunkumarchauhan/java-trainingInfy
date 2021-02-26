package assiset3.arrayAss2;

import java.util.Arrays;

public class Tester {
	static double[] findDetailsStream(double salary[]) {
		double result[] = { 0.0, 0.0, 0.0 };
		result[0] = Arrays.stream(salary).sum() / salary.length;
		result[1] = Arrays.stream(salary).filter(sal -> sal > result[0]).count();
		result[2] = Arrays.stream(salary).filter(sal -> sal < result[0]).count();
		return result;
	}

	static double[] findDetails(double salary[]) {
		double result[] = { 0.0, 0.0, 0.0 };

		for (double sal : salary)
			result[0] += sal;

		result[0] /= salary.length;

		double avgSal = result[0];
		for (double sal : salary) {
			if (sal > avgSal)
				result[1]++;
			else if (sal < avgSal)
				result[2]++;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
		double[] details = findDetails(salary);

		System.out.println("Average salary: " + details[0]);
		System.out.println("Number of salaries greater than the average salary: " + details[1]);
		System.out.println("Number of salaries lesser than the average salary: " + details[2]);
	}

}
