package com.javaex.ex02;

public abstract class Bird {
	
	//필드
	private String name;
	
	//생성자
	
	//메소드 - gs
	//=============get================
	public String getName() {
		return name;
	}
	
	//=============set=================
	public void setName(String name) {
		this.name = name;
	}
	
	//메소드 - 일반
	public abstract void sing();

	public abstract void fly();

	public abstract void showName();

}
