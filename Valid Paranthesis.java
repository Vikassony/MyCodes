import java.util.Scanner;
import java.util.Stack;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(check(s));
	}

	public static boolean check(String s) {
		if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
			return false;
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			} else if (st.empty()==false&& check1(st, s.charAt(i)))
				st.pop();
			else
				return false;
		}

		return st.isEmpty();
	}

	public static boolean check1(Stack<Character> s, char c) {
		if (c == ')' && s.peek() == '(')
			return true;
		else if (c == ']' && s.peek() == '[')
			return true;
		else if (c == '}' && s.peek() == '{')
			return true;
		return false;
	}
}
