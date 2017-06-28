package com.bensemi.paintSoft;

import com.bensemi.paintSoft.figure.*;
import java.util.*;
import java.io.*;

public class FileOperate {
	static FigureList fileRead(File file) throws IOException{
		 FigureList list = new FigureList();
		 if(file == null) return list;
		 BufferedReader din = new BufferedReader(new FileReader(file));
		 String s;
		 while((s = din.readLine()) != null){
			StringTokenizer st = new StringTokenizer(s, " ");
			String array[] = new String[5];
			for(int i = 0; i < 5; i++){
				array[i] = st.nextToken();
			}
				int x1 = Integer.parseInt(array[1]);
				int y1 = Integer.parseInt(array[2]);
				int x2 = Integer.parseInt(array[3]);
				int y2 = Integer.parseInt(array[4]);
				if(array[0].equals("Line")){
					Line line = new Line(x1, y1, x2, y2);
					list.add(line);
					line.draw();
				}else if (array[0].equals("Rect")){
					Rect rect = new Rect(x1, y1, x2, y2);
					list.add(rect);
					rect.draw();
			 	}else if(array[0].equals("Oval")){
					Oval oval = new Oval(x1, y1, x2, y2);
					list.add(oval);
					oval.draw();
				}
				list.addFileReadElements();
		 }
		 din.close();
		 return list;
	}
	static void fielWrite(FigureList list, File file) throws IOException{
		//listの内容をファイルに書き込み
		if(file == null) return;
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		Iterator<Figure> iterator = list.getList().iterator();
		while(iterator.hasNext()) {
			Figure fig =  iterator.next();
			bw.write(fig.toString());
			bw.newLine();
		}
		bw.close();
	}
}