package oop.sample;
import java.util.*;
import java.lang.*;

public class Tv {
	//속성
	// -color
	// -power
	// -channer
	
	//기능
	// - 전원 on/off
	// - channel 변경
	
	public String color  = "빨강색"; //1.
	// ^	 클래스변수		^
	boolean power = false; //상태가 두개
	int channel;
	
	
	public void setColor(String color) {
		this.color = color;
		System.out.println(color);//3.
	}
	public String getColor() {
		return color; //color값으로 리턴해준다
		
	}
	
	
	
	//기능 구현
	public void power() {
		power = !power; //power에 !power대입.
		if(power) {
			System.out.println("전원이 켜졌습니다.");
		}
		else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	public void channelUp() {
		++channel;
		if(channel > 120) {
			channel = 0; //채널을 업 시켜 120다음은 한바퀴 돌아서 0 
		}
		System.out.println("현재 채널은" + channel + "입니다.");
	}
	public void channelDown() {
		--channel;
		if(channel < 0) {
			channel = 120;//채널을 다운시켜 0다음은 한바퀴 돌아서 120 
		}
		System.out.println("현재 채널은" + channel + "입니다.");
	}
	public void setChannel(int channel1) {
		if(channel1>120 || channel<0) {
			channel = channel;
		}
		else {
			channel = channel1;
		}
		System.out.println("현재 채널은" + channel + "입니다.");
	}
	
	public void showChannel() {
		System.out.println("현재 채널은" + channel + "입니다.");

	}
}