package hackerrank.hw5c8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class C8Q13 {

	hpublic static long highestStack(int[][] boxes) {
		Arrays.sort(boxes, Collections.reverseOrder(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				int w = new Integer(o1[0]).compareTo(o2[0]);
				return w == 0 ? new Integer(o1[1]).compareTo(o2[1]) : w;
			}
		}));
		long[] highest = new long[boxes.length];
		for (int i = 0; i < highest.length; i++) {
			long temph = boxes[i][2];
			for (int j = 0; j < i; j++) {
				if (boxes[j][0] > boxes[i][0] && boxes[j][1] > boxes[i][1]) {
					long attemp = boxes[i][2] + highest[j];
					if (attemp > temph)
						temph = attemp;
				}
			}
			highest[i] = temph;
		}

		long r = 0;
		for (long h : highest) {
			if (h > r)
				r = h;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine().trim());
		int[][] boxes = new int[N][3];
		for (int i = 0; i < N; i++) {
			String[] split = in.nextLine().split(" ");
			for (int j = 0; j < split.length; j++) {
				boxes[i][j] = Integer.parseInt(split[j]);
			}
		}
		System.out.println(highestStack(boxes));
		in.close();
	}
}
