package hackerrank.hw5c8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class C8Q2Push {
	static class Loc {
		Integer x;
		Integer y;

		public Loc(Integer x, Integer y) {
			super();
			this.x = x;
			this.y = y;
		}

		public Loc(int[] locArray) {
			this.x = locArray[0];
			this.y = locArray[1];
		}

		@Override
		public int hashCode() {
			return x.hashCode() * 31 + y.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (!Loc.class.isInstance(obj))
				return false;
			Loc o2 = (Loc) obj;
			return x.equals(o2.x) && y.equals(o2.y);
		}

		int[] toLocArray() {
			return new int[] { x, y };
		}

		@Override
		public String toString() {
			return String.format("{%d, %d}", x, y);
		}
	}

	static int[][] offsets = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public static long[] routing(boolean[][] grid, int L, int C) {
		Queue<Loc> queue = new LinkedList<Loc>();
		long[][] routingMap = new long[L][C];
		routingMap[0][0] = 1;
		queue.add(new Loc(0, 0));
		long level = 0;
		Loc endLoc = new Loc(L - 1, C - 1);
		while (!queue.isEmpty()) {
			Set<Loc> prepareSet = new HashSet<Loc>();
			while (!queue.isEmpty()) {
				Loc poll = queue.poll();
				for (int[] o : offsets) {
					int tx = poll.x + o[0];
					int ty = poll.y + o[1];
					if (0 > tx || tx >= L || 0 > ty || ty >= C || !grid[tx][ty])
						continue;
					Loc tLoc = new Loc(tx, ty);
					if (routingMap[tx][ty] == 0)
						prepareSet.add(tLoc);
					if (prepareSet.contains(tLoc)) {
						routingMap[tx][ty] += routingMap[poll.x][poll.y];
						routingMap[tx][ty] %= 1E9 + 7;
					}
				}
			}
			level++;
			if (prepareSet.contains(endLoc))
				break;
			queue.addAll(prepareSet);
			prepareSet.clear();
		}
		if (routingMap[L - 1][C - 1] == 0)
			level = -1;
		return new long[] { routingMap[L - 1][C - 1], level };
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] configSplit = in.nextLine().split(" ");
		int L = Integer.parseInt(configSplit[0]);
		int C = Integer.parseInt(configSplit[1]);
		boolean[][] grid = new boolean[L][C];
		for (int i = 0; i < L; i++) {
			String nextLine = in.nextLine();
			for (int j = 0; j < C; j++) {
				grid[i][j] = nextLine.charAt(j) == 'o';
			}
		}

		long[] routing = routing(grid, L, C);
		System.out.println(routing[0]);
		System.out.println(routing[1]);
		in.close();
	}
}
