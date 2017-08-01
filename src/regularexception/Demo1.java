package regularexception;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	public static void main(String[] args) {
		// checkqq("a0123456");
		// checkqq1("123456789");
		// checkqq2("18280305934");
		// checkqq3();
		// splitDemo();
		// replaceallDemo();
		// replaphonenum();
		// getnum();
		// quchong();
		ip2();

		String str = "yfcvy67@147.com";
		email(str);
	}

	// һ�㷽����֤qq����
	public static void checkqq(String str) {
		char[] a = str.toCharArray();
		int i = str.length();
		if (i >= 5 && i <= 13) {
			if (a[0] == '0') {
				System.out.println("��λ���ֲ���Ϊ0");
			} else {
				for (char ch : a) {
					if (!(ch >= '0' && ch <= '9')) {
						System.out.println("���� ���벻�ܰ���������");
						return;
					}
				}
				System.out.println("������ĺ�����" + str);
			}
		} else {
			System.out.println("������ĺ���λ������ȷ");
		}
	}

	// ��������ʽ��֤qq����
	public static void checkqq1(String str) {
		String regex = "[1-9]\\d{5,13}";
		// [1-9]��һ��������0��9���ڶ���1��9�õ�\\d,��һ��������ת��ġ�{4,13}�Ǵ����������4�����13��
		if (str.matches(regex)) {
			System.out.println("������� ����");    
		} else {
			System.out.println("������Ĳ���ȷ");
		}

	}

	// ������ʽ��֤�绰����
	public static void checkqq2(String str) {
		String regex = "[1][34578]\\d{9}";// \\d{9}��{9}����������\\d�ģ���ʾ��9��
		if (str.matches(regex)) {
			System.out.println("�����������ȷ��");
		} else {

			System.out.println("��������ǲ���ȷ��");
		}
	}

	// ������ʽ�и��ַ���
	public static void checkqq3() {
		String str = "zhang san zao zhang hao   a";
		String[] s = str.split(" ");// �г���ո񽲲��ٴ��ڣ�����ͬ��
		for (String st : s) {
			System.out.println(st);
		}
	}

	// ������ʽ�и��ַ������߼���
	public static void splitDemo() {
		// String str = "zhangsan lisi wangwu";
		// String[] names = str.split(" +"); ��ʾ�����ո񴮾��и
		// for(String name:names){
		// System.out.print(name);
		// }

		String str = "zhangsanyyyylisi888888wangwu";
		// String[] names = str.split("\\.");//.�������б�ʾ������ţ�������Ҫת��
		String[] names = str.split("(.)\\1+");
		// (.)����һ���飬����ĵ�.��������һ���ַ�����\\1��ʾ���������ͬ���飬+��ʾһ���������ַ��鴮
		for (String name : names) {
			System.out.print(name);
		}

	}

	// replaceall����
	public static void replaceallDemo() {
		String str = "asdfshhhhhhhdfgjhiheeeeejkojoi";
		String newstring = str.replaceAll("(.)\\1+", "$1");
		// String newstring=str.replaceAll("(.)\\1+", "");
		// ""��ʾ�ÿ�ȥ���ǰ��ĵ��ظ�����,������$1��ʾ���⴮��ͬ�ַ���ĵ�һ���ַ���ȥ�滻ԭ����һ����

		System.out.println(newstring);
	}

	// �绰�����м�4λ���ǺŴ��棬����Ϊ�������С�
	public static void replaphonenum() {
		String s = "18280305934";
		String regex = "([1][34578][0-9])\\d{4}(\\d{4})";
		String news = s.replaceAll(regex, "$1****$2");
		System.out.println(news);
	}

	// ������ʽ�еĻ�ȡ��
	public static void getnum() {

		String str = "wo shi zhou da ye ,ni hao ma";
		String s = "\\b\\w{3}\\b";// ����������ʽ��
		Pattern p = Pattern.compile(s);// pattern�����½�pattern���󣬴������������ʽ��Ŀ����������ʽ��ʵ������
		Matcher m = p.matcher(str);// ����������ʽ��ʵ��������ƥ����Matcher���������str��Ŀ���ǽ�str��������ʽ����ƥ������
		boolean b = m.matches();// ��ƥ�����н���������ʽ��str��ƥ�䡣�õ�����һ������ֵ��
		while (m.find()) {// m.find()���ص���һ������ֵ��Ŀ�����ж�str�ﻹ��û��ƥ����ַ���
			System.out.println(m.group());
			// m.group()���ص���һ����������ĽǱ�Ϊ0��string�ַ�����������������ǰ������ƥ��������ʽ���ַ��������ɵ��ַ������顣
			System.out.println(b);
		}

	}

	// ȥ��
	public static void quchong() {
		String s = "����...����..����...������.������.��...������...������.����..����...��������������..��ѧѧϰϰ";
		String regex = "(\\.)";
		String news = s.replaceAll(regex, "");
		String regex1 = "(.)\\1+";
		String news1 = news.replaceAll(regex1, "$1");
		System.out.println(news1);
	}

	// IP����
	public static void ip() {
		String str = "192.168.15.10  127.0.0.1  3.3.3.3  105.77.11.55";

		String[] s = str.split(" +");
		String[] s00 = s[0].split("\\.");
		String[] s11 = s[1].split("\\.");
		String[] s22 = s[2].split("\\.");
		String[] s33 = s[3].split("\\.");
		int i0 = Integer.parseInt(s00[0]);
		int i1 = Integer.parseInt(s11[0]);
		int i2 = Integer.parseInt(s22[0]);
		int i3 = Integer.parseInt(s33[0]);
		int[] a = { i0, i1, i2, i3 };
		Arrays.sort(a);
		String[] arr = { a[0] + "", a[1] + "", a[2] + "", a[3] + "" };
		for (int k = 0; k < 4; k++) {
			for (int n = 0; n < 4; n++) {
				if (arr[k].equals(s[n].split("\\.")[0])) {
					System.out.println(s[n]);
				}
			}
		}
	}

	// IP����2
	public static void ip2() {
		String str = "192.168.15.10  127.0.0.1  3.3.3.3  105.77.11.55";
		String str2 = "(\\d+)";

		 str = str.replaceAll(str2, "00$1");
		str = str.replaceAll("0*(\\d{3})", "$1");
		System.out.println(str);
		String[] s = str.split(" +");
		TreeSet<String> set = new TreeSet();
		for (int i = 0; i < 4; i++) {
			set.add(s[i]);
		}

		for (String k : set) {
			
			System.out.println(k.replaceAll("0*(\\d+)", "$1"));
			
			
		
		}

	}

	// ����У׼
	public static void email(String str) {
		String s = "\\w{5,15}@\\w{2,10}\\.com";
		if (str.matches(s)) {
			System.out.println("�������������ȷ");
		} else {
			System.out.println("����������䲻��ȷ");
		}
	}

}
