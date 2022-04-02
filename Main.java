package basamakDegerleriToplama;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("sayýyý girin");
		int num=scanner.nextInt(),busNum=0,tempNumber=num,basValue=0,toplam=0;
		
		while(tempNumber!=0) {
			tempNumber/=10;			
			busNum++;			
		}
		tempNumber=num;
		System.out.println("sayý "+busNum+" basamaklý");
		while(tempNumber!=0) {
			basValue=tempNumber%10;			
			tempNumber/=10;
			toplam+=basValue;			
		}
		System.out.println(toplam);
	}

}
