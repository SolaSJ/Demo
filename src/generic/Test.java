package generic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {

		TreeSet<Person> tr = new TreeSet();
		tr.add(new Student(1, "zhang1"));
		tr.add(new Worker(2, "zhang2"));
		tr.add(new Student(1, "zhang3"));
		tr.add(new Worker(2, "zhang4"));
		tr.add(new Student(1, "zhang5"));
		tr.add(new Worker(2, "zhang6"));
		compare(tr);
		int[] arr = { 11, 12, 7, 2, 78, 9, 21 };
		System.out.println(halfsearch(arr, 12));
		System.out.println(Arrays.toString(chose(arr)));
	}

	public static void compare(TreeSet<Person> tr) {
		Iterator<Person> it = tr.iterator();
		int a = 0;
		while (it.hasNext()) {
			Person t = it.next();
			if (t.getBelong() != a) {
				a = t.getBelong();
				System.out.println(t.getClass().getSimpleName());
			}
			System.out.println(t + "\t");
		}

	}

	public static int halfsearch(int[] arr, int a) {
		Arrays.sort(arr);
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		while (arr[mid] != a) {
			if (arr[mid] < a) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
			if (min > max) {
				return -1;
			}
			mid = (min + max) / 2;
		}
		return mid;
	}

	public static int[] chose(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] > arr[j]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

		return arr;
	}

}
