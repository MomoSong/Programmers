package myJava;

public class NoOvertime {
	public int noOvertime(int no, int[] works) {
		int result = 0;
		// 야근 지수를 최소화 하였을 때의 야근 지수는 몇일까요?
		int temp = 0;
		int index = 0;
		
		while(no != 0) {
			temp = 0;
			for(int i = 0; i < works.length; i++) {
				if(temp <= works[i]) {
					temp = works[i];
					index = i;
				}
			}
			works[index]--;
			no--;
		}
		
		System.out.println("no: " + no);
		for(int i : works) {
			System.out.print("[" + i + "]");
		}
		
		for(int i = 0; i < works.length; i++) {
			result += (int)Math.pow(works[i], 2);
		}
		
		return result;
	}
	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int []test = {4,3,3};
		System.out.println(c.noOvertime(4,test));
	}

}
