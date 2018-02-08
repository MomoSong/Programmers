package myJava;

public class ReverseInt {
	public int reverseInt(int n){
		String str = "" + n;
		char[] chAr = str.toCharArray();
		char temp = ' ';
		
		for(int i = 0; i < chAr.length; i++) {
			for(int j = i; j < chAr.length; j++) {
				if(chAr[i] < chAr[j]) {
					temp = chAr[j];
					chAr[j] = chAr[i];
					chAr[i] = temp;
				}
			}
		}
	    
		String presult = new String(chAr);
		int result = Integer.parseInt(presult);
		
		return result;
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}
