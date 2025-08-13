package chapter03;

public class Cylinder {
	public static void main(String[] args) {
		double r= 7;
		double h = 5;
		//원 기둥 부피 값을 받음
		double v = volume(r, h);
		System.out.println("반지름 "+r+"높이 "+h+"인 원기둥의 부피는: "+v);
	}
	
	public static double volume(double radius, double height) {
		return Math.PI*radius*radius*height; //원기둥 부피
	}
}
