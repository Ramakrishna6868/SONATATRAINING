package javaindebuggingmode;

import java.util.ArrayList;
import java.util.List;

public class FindMinMaxInListEx3 {


	public static Integer findMin(List<Integer> list)
	{
		Integer min = Integer.MAX_VALUE;

		for (Integer i : list) {

			if (min > i) {
				min = i;
			}
		}

		return min;
	}

	public static Integer findMax(List<Integer> list)
	{
		Integer max = Integer.MIN_VALUE;

		for (Integer i : list) {

			if (max < i) {
				max = i;
			}
		}

		return max;
	}

	public static void main(String[] args)
	{

		List<Integer> list = new ArrayList<>();

		list.add(44);
		list.add(11);
		list.add(22);
		list.add(33);

		System.out.println("Min: " + findMin(list));
		System.out.println("Max: " + findMax(list));
	}
}
