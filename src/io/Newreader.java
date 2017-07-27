package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Newreader {
	private FileReader file;

	public static void lastread() {
		FileReader fr = null;

		try {
			fr = new FileReader("src/io/copy.txt");
			Newreader nr = new Newreader();
			String st;
			while ((st = nr.look(fr)) != null) {
				System.out.println(st);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String look(FileReader file) throws IOException {
		StringBuilder sb = new StringBuilder();

		int a;
		char c = '\r';
		char d = '\n';
		while ((a = file.read()) != -1) {
			if (c == (char) a) {
				continue;
			}
			if (d == (char) a) {
				return sb.toString();
			}
			sb.append((char) a);
		}
		if (sb.length() > 0) {
			return sb.toString();
		}

		return null;

	}

	public static void main(String[] args) {
		lastread();
		gjhjh();
	}

	public static void gjhjh() {
		FileWriter fr = null;
		try {
			fr = new FileWriter("src/io/hao.txt",true);
			fr.write("�����¹�");
			fr.write("�ݹ鲻�ƺ��");
			fr.flush();
			fr.append("�ͷ���涨���ŷ��");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fr != null) {

				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
