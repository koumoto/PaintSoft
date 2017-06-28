package com.bensemi.paintSoft.figure;

import com.bensemi.paintSoft.*;

public class Rect extends Figure{
	private int x1, y1, x2, y2;

	public Rect(int x1,int y1,int x2,int y2){
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public void draw(){
		DrawArea.bg.drawRect(x1, y1, x2-x1, y2-y1);
	}

	public void write(){
		System.out.println(this);
	}

	public String toString(){
		return  "Rect "+x1+" "+y1+" "+x2+" "+y2;
	}
}