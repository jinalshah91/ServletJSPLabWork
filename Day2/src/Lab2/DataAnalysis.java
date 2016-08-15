package Lab2;

import java.util.Scanner;

/**
 * Created by jinashah on 8/3/2016.
 */
public class DataAnalysis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of data items. ");
		int number = sc.nextInt();
		int array[] = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Please enter " + (i+1) + " number: ");
			array[i] = sc.nextInt();
		}
		int sum = 0, min = array[0], max = 0;
		double mean = 0.0;
		for (int num : array) {
			sum += num;

			if (min > num) {
				min = num;
			}
			if (max < num) {
				max = num;
			}

		}
		mean = sum / number;

		System.out.println("Mean is: " + mean);
		System.out.println("Max is: " + max);
		System.out.println("Min is: " + min);

	}

}
