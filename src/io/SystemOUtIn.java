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

//������������else��������if (a == '\n')������Ȼ�����жϺͲ������ǲ�û��ɾ��\n���ᱻ�����sb.append((char) a)
//���ӽ�ȥ��ÿһ�еĿ�ͷ���ᱻ�����\n��ʹ�ó����Զ����У�����else�Ĳ���Ϊ����ġ�
				sb.append((char) a);
			}
			
		}
	}
}
