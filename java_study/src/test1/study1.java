package test1;
import java.util.Scanner;

public class study1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int num;
		num = sc.nextInt();
		byte b = sc.nextByte();
		short s = sc.nextShort();
		long l = sc.nextLong();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		boolean bool = sc.nextBoolean();
		char ch = sc.nextLine().charAt(0);
		*/
		
//		int kor, mat, eng;
//		kor = sc.nextInt();
//		mat = sc.nextInt();
//		eng = sc.nextInt();
//		
//		System.out.println("총점 : "+(kor+mat+eng)+" "+"평균 : "+(kor+mat+eng)/3);
//		
		int[] score = new int[5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		
		System.out.println(score[0]);
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		String[] name = new String[3];
		
		for(int i=0; i<name.length; i++) {
			System.out.print("이름입력 : ");
			name[i] = sc.nextLine();
		}
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
	}
}
