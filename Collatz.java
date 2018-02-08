package myJava;

public class Collatz {
	public int collatz(int num) {
		int answer = num;
		int count = 0;

		while (answer != 1) {
			if (answer % 2 == 0) {
				answer /= 2;
			} else {
				answer = answer * 3 + 1;
			}
			
			count++;
			if(count >= 500) {
				count = -1;
				break;
			}
		}

		return count;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}
