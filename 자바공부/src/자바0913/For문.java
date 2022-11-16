package 자바0913;

import java.util.Scanner;

public class For문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.println("값은 "+num);
		
		int x = 0;
		while(true) {
			if(num >= 3 && num <= 1000) {
				x++;
				if(num % x == 1) {
					System.out.println("가장 작은 자연수 => "+x);
					break;
				}
			}
			else {
				System.out.println("3~1000 숫자중 입력하세요");
				break;
			}
		}
		int sum = 0;
		for(int j = 3; j<=6; j++) {
			sum += j;
		}
		System.out.println("더한 값은 => "+sum);
	}

}
