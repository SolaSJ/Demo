
package com.rf.zzc.demo1;

public class Something {

	/*
	 * 字符集和编码： 字符集是字典而编码却是存储方式。 UTF-16 是用定长 16 位（2 字节）来表示的 Unicode 转换格式，通过代理对来访问 BMP
	 * 之外的字符编码。 UTF-16都是双字节，而UTF-8却是变字节，一般为1~6个字节（英文占一个字节，而中文占三个字节） UTF-16
	 * 虽然编码效率很高，但是对单字节范围内字符也放大了一倍，这无形也浪费了存储空间， 另外 UTF-16
	 * 采用顺序编码，不能对单个字符的编码值进行校验，如果中间的一个字符码值损坏，后面的所有码值都将受影响。而 UTF-8 这些问题都不存在。
	 * 
	 */

	// 内部类：内部类可以是静态static的，也可用public，default，protected和private修饰。

	// 成员内部类不能含有static的变量的和方法。因为是先创建外部类再创建内部类自己的。
	public class Outer {
		public void importent() {
			Outer o = new Outer();
			o.getInner().print("我是内部类调用的方法");
		}

		public Inner getInner() {
			return new Inner();
		}

		public class Inner {
			public void print(String s) {
				System.out.println(s);
			}
		}
	}

	// 局部内部类(是指内部类定义在方法和作用域内。)
	/*
	 * 作用在方法体内 public class Parcel4 { public Destination destination(String s) {
	 * class PDestination implements Destination（接口） { private String label;
	 * 
	 * private PDestination(String whereTo)（有参构造） { label = whereTo; }
	 * 
	 * public String readLabel() { return label; } } return new PDestination(s); }
	 * 
	 * public static void main(String[] args) { Parcel4 p = new Parcel4();
	 * Destination d = p.destination("Tasmania"); } }
	 */

	/*
	 * 定义在作用域的内部类 public class Parcel5 { private void internalTracking(boolean b) {
	 * if (b) { class TrackingSlip { private String id; TrackingSlip(String s) { id
	 * = s; } String getSlip() { return id; } } TrackingSlip ts = new
	 * TrackingSlip("slip"); String s = ts.getSlip(); } }
	 * 
	 * public void track() { internalTracking(true); }
	 * 
	 * public static void main(String[] args) { Parcel5 p = new Parcel5();
	 * p.track(); } }
	 */

	// 匿名内部类
	/*
	 * public class Outer { public static void main(String[] args) { Outer outer =
	 * new Outer(); Inner inner = outer.getInner("Inner", "gz");
	 * System.out.println(inner.getName());
	 * 
	 * 
	 * }
	 * 
	 * public Inner getInner(final String name, String city) { return new Inner() {
	 * 此处得到的Inner是已经实现了的接口的Inner，所以调用方法得到的是 private String nameStr = name;
	 * 
	 * public String getName() { return nameStr; } }; } }
	 * 
	 * //注释后，编译时提示类Inner找不到 interface Inner { 此处为接口，而且以后很多情况都会用到接口 String getName();
	 * }
	 */

	// hashcode是什么，以及什么是散列
	public void hash() {
		/*
		 * hashcode方法返回该对象的哈希码值。支持该方法是为哈希表提供一些优点，例如，java.util.Hashtable 提供的哈希表。
		 * 
		 * hashCode 的常规协定是： 在 Java 应用程序执行期间，在同一对象上多次调用 hashCode 方法时，必须一致地返回相同的整数，前提是对象上
		 * equals 比较中所用的信息没有被修改。从某一应用程序的一次执行到同一应用程序的另一次执行，该整数无需保持一致。 如果根据 equals(Object)
		 * 方法，两个对象是相等的，那么在两个对象中的每个对象上调用 hashCode 方法都必须生成相同的整数结果。 以下情况不 是必需的：如果根据
		 * equals(java.lang.Object) 方法，两个对象不相等，那么在两个对象中的任一对象上调用 hashCode
		 * 方法必定会生成不同的整数结果。但是，程序员应该知道，为不相等的对象生成不同整数结果可以提高哈希表的性能。 实际上，由 Object 类定义的
		 * hashCode 方法确实会针对不同的对象返回不同的整数。（这一般是通过将该对象的内部地址转换成一个整数来实现的，但是 JavaTM
		 * 编程语言不需要这种实现技巧。）
		 * 
		 * 当equals方法被重写时，通常有必要重写 hashCode 方法，以维护 hashCode 方法的常规协定，该协定声明相等对象必须具有相等的哈希码。
		 */
	}

	
}
