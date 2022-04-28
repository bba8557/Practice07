package com.javaex.ex01;

public class Ractangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	//메소드 - gs
	//====================get====================
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	//====================set====================
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}	

	//메소드 - 일반
	public void draw(){
		System.out.println("[사각형]#면색:" +fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
	/*상속받는곳에 showInfo를 만들지 않았기에 오버라이딩을 할수 없어 오류가발생했다
	public void showInfo(){ 
		System.out.println("[사각형]#면색:" +fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
	*/
	
}


