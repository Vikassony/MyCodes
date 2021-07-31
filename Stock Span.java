import java.util.Scanner;
import java.util.Stack;

class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int res[] = calculateSpan(a);
		for (int i = 0; i < n; i++)
			System.out.print(res[i] + " ");
	}

	public static int[] calculateSpan(int price[]) {
		int res[] = new int[price.length];
		Stack<Integer> s = new Stack<>();
		res[0] = 1;
		s.push(0);
		for (int i = 1; i < price.length; i++) {
			while (s.size() > 0 && price[i] > price[s.peek()]) {
				s.pop();
			}
			if (s.isEmpty()) {
				res[i] = i + 1;
			} else {
				res[i] = i - s.peek();
			}
			s.push(i);

		}
		return res;
	}
}
