package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class SystemOUtIn {
	public static void main(String[] args) throws IOException {
		// PrintStream ps=System.out;
		// OutputStreamWriter ow=new OutputStreamWriter(ps);
		// BufferedWriter fw=new BufferedWriter(ow);
		// try {
		// fw.write("wwedfg");
		// fw.flush();
		// } catch (IOException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		//

		InputStream in = System.in;

		StringBuilder sb = new StringBuilder();

		while (true) {
			int a = in.read();

			if (a == '\r') {
				continue;
			}
			if (a == '\n') {

				String str = sb.toString();
				System.out.println(str);
				if ("end".equals(sb.toString())) {
					break;
				}
				int i = sb.length();
				sb.delete(0, i);

			} else {

//在这里必须加入else否则上面if (a == '\n')里面虽然做了判断和操作但是并没有删除\n，会被后面的sb.append((char) a)
//给加进去，每一行的开头都会被加入个\n。使得程序自动换行，所以else的操作为必须的。
				sb.append((char) a);
			}
			
		}
	}
}
