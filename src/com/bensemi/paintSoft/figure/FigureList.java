package com.bensemi.paintSoft.figure;

import java.util.*;

public class FigureList{
	private int fileReadElements = 0; //ファイルから読み込んだ要素数
	private ArrayList<Figure> list = new ArrayList<Figure>();
	public void add(Figure figure){
		list.add(figure);
	}

	public ArrayList<Figure> getList(){
		return list;
	}

	public void clear(){
		list.clear();
	}

	public void oneDelete(){
		if(list.size() == 0) return;
		list.remove(list.size()-1);
	}

	public String toString(){
		String retval ="";
		for(int i = 0; i< list.size(); i++){
			Figure fig = list.get(i);
			retval += fig.toString() + "\n";
		}
		return retval;
	}

	public void draw(){
		for(int i = 0; i< list.size(); i++){
			Figure fig = list.get(i);
			fig.draw();
		}
	}

	public void addFileReadElements(){
		fileReadElements++;
	}

	public int getFileReadElements(){
		return fileReadElements;
	}

	public int getSize(){
		return list.size();
	}
}