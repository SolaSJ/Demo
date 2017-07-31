package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Begin {
	public static void main(String[] args) {
		FileInputStream fir;
		FileOutputStream fos;
		try {
		fir=new FileInputStream("C:\\Users\\admin\\Desktop\\赵雷 - 成都.mp3");
		MybufferedReader m=new MybufferedReader(fir);
		fos=new FileOutputStream("C:\\Users\\admin\\Desktop\\赵雷1 - 成都.mp3");
		int a=0;
		try {
			while((a=m.myread(fir))!=-1){
				fos.write(a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
