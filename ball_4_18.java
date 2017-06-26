package tw.aaa.myproject.test;

import java.util.Scanner;

public class ball_4_18 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		long b;
		float c;
		System.out.println("請輸入半徑：");
		b=a.nextInt();
		c=(float)(b*b*b*4/3.0*3.14159);
		System.out.println("球體積為："+c);
	}

}
