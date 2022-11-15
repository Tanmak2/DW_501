package 자바1115;

public class 기초다지기 {

	public static void main(String[] args) {
		int money = 15000;
		int 잔수 = 0;
		int 남은돈 = 0;
		
		while(money > 5500) {
			money -= 5500;
			잔수++;
			남은돈 = money;
		}
		
		System.out.println("잔수 : "+잔수+" 남은돈 : "+남은돈);
		
		
		int n = 64;
		int k = 6;
		int result = 0;
		
		while(n > 0) {
			if(n >= 10) {
				n -= 10;
				result += 120000;
				k--;
			}
			if(n > 0 && n < 10) {
				n--;
				result += 12000;
			}
		}
		result += k * 2000;
		
		System.out.println("총 지불 금액 : "+result);
		
		String message = "happy birthday!";
		result = 0;
		
		result = message.length()*2;
		
		System.out.println("편지지의 최소 가로길이 : "+result);
		
		
		int[] array = {149, 180, 192, 170};
		int height = 167;
		int answer = 0;
		
		for(int i : array) {
			if(i > height) {
				answer++;
			}
		}
		
		System.out.println("머쓱이보다 키 큰 사람의 수 : "+answer);
	}

}
