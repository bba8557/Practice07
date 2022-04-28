package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강"); 혼자서는 사용할수없다
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출 - draw를 본인에 만들어줌
		sr1.draw();
		//sr1의 가로크기 출력 - 본인에 gs이 빠져있었다
		System.out.println(((Ractangle)sr1).getWidth());
	}
}

	
	