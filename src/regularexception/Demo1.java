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

	// 一般方法验证qq号码
	public static void checkqq(String str) {
		char[] a = str.toCharArray();
		int i = str.length();
		if (i >= 5 && i <= 13) {
			if (a[0] == '0') {
				System.out.println("首位数字不能为0");
			} else {
				for (char ch : a) {
					if (!(ch >= '0' && ch <= '9')) {
						System.out.println("输入 号码不能包含非数字");
						return;
					}
				}
				System.out.println("您输入的号码是" + str);
			}
		} else {
			System.out.println("您输入的号码位数不正确");
		}
	}

	// 用正则表达式验证qq号码
	public static void checkqq1(String str) {
		String regex = "[1-9]\\d{5,13}";
		// [1-9]第一个数字是0到9，第二个1到9用的\\d,第一个是用来转译的。{4,13}是代表个数至少4次最多13次
		if (str.matches(regex)) {
			System.out.println("您输入的 正好");    
		} else {
			System.out.println("您输入的不正确");
		}

	}

	// 正则表达式验证电话号码
	public static void checkqq2(String str) {
		String regex = "[1][34578]\\d{9}";// \\d{9}中{9}是拿来修饰\\d的，表示有9次
		if (str.matches(regex)) {
			System.out.println("您输入的是正确的");
		} else {

			System.out.println("您输入的是不正确的");
		}
	}

	// 正则表达式切割字符串
	public static void checkqq3() {
		String str = "zhang san zao zhang hao   a";
		String[] s = str.split(" ");// 切除后空格讲不再存在，其他同理。
		for (String st : s) {
			System.out.println(st);
		}
	}

	// 正则表达式切割字符串，高级版
	public static void splitDemo() {
		// String str = "zhangsan lisi wangwu";
		// String[] names = str.split(" +"); 表示遇到空格串就切割。
		// for(String name:names){
		// System.out.print(name);
		// }

		String str = "zhangsanyyyylisi888888wangwu";
		// String[] names = str.split("\\.");//.在正则中表示特殊符号，所以需要转译
		String[] names = str.split("(.)\\1+");
		// (.)代表一个组，里面的的.代表任意一个字符，而\\1表示和这个组相同的组，+表示一串连续的字符组串
		for (String name : names) {
			System.out.print(name);
		}

	}

	// replaceall例子
	public static void replaceallDemo() {
		String str = "asdfshhhhhhhdfgjhiheeeeejkojoi";
		String newstring = str.replaceAll("(.)\\1+", "$1");
		// String newstring=str.replaceAll("(.)\\1+", "");
		// ""表示用空去替代前面的的重复内容,在这里$1表示用这串相同字符组的第一个字符组去替换原来的一串，

		System.out.println(newstring);
	}

	// 电话号码中间4位用星号代替，划分为组来进行。
	public static void replaphonenum() {
		String s = "18280305934";
		String regex = "([1][34578][0-9])\\d{4}(\\d{4})";
		String news = s.replaceAll(regex, "$1****$2");
		System.out.println(news);
	}

	// 正则表达式中的获取。
	public static void getnum() {

		String str = "wo shi zhou da ye ,ni hao ma";
		String s = "\\b\\w{3}\\b";// 构建正则表达式。
		Pattern p = Pattern.compile(s);// pattern类来新建pattern对象，传入的是正则表达式，目的是正则表达式的实例化。
		Matcher m = p.matcher(str);// 利用正则表达式的实例来建立匹配器Matcher。传入的是str，目的是将str和正则表达式放入匹配器，
		boolean b = m.matches();// 在匹配器中进行正则表达式和str的匹配。得到的是一个布尔值。
		while (m.find()) {// m.find()返回的是一个布尔值，目的是判断str里还有没有匹配的字符。
			System.out.println(m.group());
			// m.group()返回的是一个数组里面的角标为0的string字符串，而这个数组就是前面所有匹配正则表达式发字符串所生成的字符型数组。
			System.out.println(b);
		}

	}

	// 去重
	public static void quchong() {
		String s = "我我...我我..我我...我我是.是是是.是...是在在...在在在.在在..这这...这这这里里里里..里学学习习";
		String regex = "(\\.)";
		String news = s.replaceAll(regex, "");
		String regex1 = "(.)\\1+";
		String news1 = news.replaceAll(regex1, "$1");
		System.out.println(news1);
	}

	// IP排序
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

	// IP排序2
	public static void ip2() {
		String str = "192.168.15.10  127.0.0.1  3.3.3.3  105.77.11.55";
		String str2 = "(\\d+)";

		String news0 = str.replaceAll(str2, "00$1");
		String news1 = news0.replaceAll("0*(\\d{3})", "$1");
		String[] s = str.split(" +");
		TreeSet<String> set = new TreeSet();
		for (int i = 0; i < 4; i++) {
			s[i]=s[i].replaceAll("0*(\\d+)", "$1");
			set.add(s[i]);

		}
		for (String k : set) {
			
			System.out.println(k);
			
			
		
		}

	}

	// 邮箱校准
	public static void email(String str) {
		String s = "\\w{5,15}@\\w{2,10}\\.com";
		if (str.matches(s)) {
			System.out.println("您输入的邮箱正确");
		} else {
			System.out.println("您输入的邮箱不正确");
		}
	}

}
