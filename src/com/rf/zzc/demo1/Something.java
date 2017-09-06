
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
	
	//局部内部类(是指内部类定义在方法和作用域内。)
	/*	作用在方法体内
	 * public class Parcel4 { 
	    public Destination destination(String s) { 
	        class PDestination implements Destination（接口） { 
	            private String label; 
	 
	            private PDestination(String whereTo)（有参构造） { 
	                label = whereTo; 
	            } 
	 
	            public String readLabel() { 
	                return label; 
	            } 
	        } 
	        return new PDestination(s); 
	    } 
	 
	    public static void main(String[] args) { 
	        Parcel4 p = new Parcel4(); 
	        Destination d = p.destination("Tasmania"); 
	    } 
	} */
	
	
	/*定义在作用域的内部类
	 * public class Parcel5 { 
	    private void internalTracking(boolean b) { 
	        if (b) { 
	            class TrackingSlip { 
	                private String id; 
	                TrackingSlip(String s) { 
	                    id = s; 
	                } 
	                String getSlip() { 
	                    return id; 
	                } 
	            } 
	            TrackingSlip ts = new TrackingSlip("slip"); 
	            String s = ts.getSlip(); 
	        } 
	    } 
	 
	    public void track() { 
	        internalTracking(true); 
	    } 
	 
	    public static void main(String[] args) { 
	        Parcel5 p = new Parcel5(); 
	        p.track(); 
	    } 
	} */
	
	//匿名内部类
	/*
	 * public class Outer { 
	    public static void main(String[] args) { 
	        Outer outer = new Outer(); 
	        Inner inner = outer.getInner("Inner", "gz"); 
	        System.out.println(inner.getName()); 
	     
	        
	    } 
	 
	    public Inner getInner(final String name, String city) { 
	        return new Inner() {  此处得到的Inner是已经实现了的接口的Inner，所以调用方法得到的是
	            private String nameStr = name; 
	 
	            public String getName() { 
	                return nameStr; 
	            } 
	        }; 
	    } 
	} 
	 
	//注释后，编译时提示类Inner找不到 
	 interface Inner { 此处为接口，而且以后很多情况都会用到接口
	    String getName(); 
	}   
	*/
	
}
