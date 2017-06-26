package tw.aaa.myproject.test;

import java.util.Scanner;

public class day_4_19 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int b,c,d;
		System.out.println("請輸入天數：");
		b=a.nextInt();
		c=b/7;
		d=b%7;
		System.out.println(c+"周"+d+"天");
	}

}
