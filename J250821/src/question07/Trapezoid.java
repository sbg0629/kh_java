package question07;

import java.util.Scanner;

public class Trapezoid {

	int down;
	int up;
	int height;
	
	public Trapezoid(int down, int up, int height) {
		super();
		this.down = down;
		this.up = up;
		this.height = height;
	}
	public double getArea() {
		return ((down+up)*height)/2;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(">>>");
		int down = scanner.nextInt();
		int up = scanner.nextInt();
		int higth = scanner.nextInt();
		
		Trapezoid tr = new Trapezoid(down, up, higth);
		System.out.println("사다리꼴의 면적은 = "+ tr.getArea());
		scanner.close();
}
}

 