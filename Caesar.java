package myJava;

public class Caesar {
	String caesar(String s, int n) {
		String result = "";
		// 함수를 완성하세요.
		String A1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String a1 = "abcdefghijklmnopqrstuvwxyz";

		char[] A2 = A1.toCharArray();
		char[] a2 = a1.toCharArray();
		char[] s1 = s.toCharArray();

		if (n > A1.length()) {
			n = n % A1.length();
		}

		for (int i = 0; i < s1.length; i++) {
			if (s1[i] == ' ')
				result += " ";

			if (s1[i] >= 'A' && s1[i] <= 'Z') {
				for (int j = 0; j < A2.length; j++) {
					if (s1[i] == A2[j]) {
						if (j + n >= A2.length) {
							result += A2[n - (A2.length - j)];
						}else {
							result += A2[j+n];
						}
					}
				}
			}
			
			if (s1[i] >= 'a' && s1[i] <= 'z') {
				for (int j = 0; j < a2.length; j++) {
					if (s1[i] == a2[j]) {
						if (j + n >= a2.length) {
							result += a2[n - (A2.length - j)];
						}else {
							result += a2[j+n];
						}
					}
				}
			}

		}

		return result;
	}

	public static void main(String[] args) {

		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}
