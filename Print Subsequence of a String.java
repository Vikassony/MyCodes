//Subsequence of a string of length n == pow(2,n)
import java.util.ArrayList;
import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> al = getS(str);
		for (String s : al)
			System.out.print(s + " ");
	}

	public static ArrayList<String> getS(String s) {
		if (s.length() == 0) {
			ArrayList<String> rr = new ArrayList<>();
			rr.add("");
			return rr;
		}
		char ch = s.charAt(0);
		String str = s.substring(1);
		ArrayList<String> rrs = getS(str);
		ArrayList<String> al = new ArrayList<String>();
		for (String s1 : rrs)
			al.add(ch + s1);
		for (String s1 : rrs)
			al.add("" + s1);
		return al;
	}
}
