package myJava;

public class NextBigNumber {
	public int nextBigNumber(int n)
    {
        int answer = n;        
        int numOf1 = 0;
        String bin = "";
        boolean flag = false;
        
        bin = Integer.toBinaryString(answer);
    
    	for(int i = 0; i < bin.length(); i++) {
    		if(bin.charAt(i) == '1') {
    			numOf1++;
    		}
    	}
    	
        while(!flag) {
        	int count = 0;
        	answer++;
        	
        	bin = Integer.toBinaryString(answer);
        	
        	for(int i = 0; i < bin.length(); i++) {
        		if(bin.charAt(i) == '1') {
        			count++;
        		}
        	}
        	
        	if(count == numOf1) {
        		flag = true;
        		break;
        	}
        }
        
        return answer;
    }
    public static void main(String[] args)
    {
        NextBigNumber test = new NextBigNumber();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}
