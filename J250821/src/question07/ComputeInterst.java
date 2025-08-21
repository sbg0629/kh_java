package question07;

import java.time.Year;
import java.util.Scanner;

public class ComputeInterst {
public static void main(String[] args) {
	int principal;
	double rate;
	double balance;
	int year = 0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("원금을 입력하세요");
	principal = scanner.nextInt(); //원금 입력 받고 저장
	
	System.out.println("연 이율을 입력하세요");
	rate = scanner.nextDouble(); //연 이율 저장
	System.out.println("연수도  원리금");
	balance = principal;
	year +=1;
	
	while(true) {
		balance = balance * (1.0 + rate / 100.0); // 1년후원리금을계산한다		
		System.out.print(year);
		System.out.print("\t"+balance);
		if(balance<=principal*2) {
			year++;
		}else {		
			break;
		}
		System.out.println();
	}
	System.out.println("\n필요한 연도수" + year);
	scanner.close();
	
}
}

//do while문으로도 가능. 