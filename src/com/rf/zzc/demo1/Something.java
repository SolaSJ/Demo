
package com.rf.zzc.demo1;

public class Something {

	/*
	 * �ַ����ͱ��룺 �ַ������ֵ������ȴ�Ǵ洢��ʽ�� UTF-16 ���ö��� 16 λ��2 �ֽڣ�����ʾ�� Unicode ת����ʽ��ͨ������������� BMP
	 * ֮����ַ����롣 UTF-16����˫�ֽڣ���UTF-8ȴ�Ǳ��ֽڣ�һ��Ϊ1~6���ֽڣ�Ӣ��ռһ���ֽڣ�������ռ�����ֽڣ� UTF-16
	 * ��Ȼ����Ч�ʺܸߣ����ǶԵ��ֽڷ�Χ���ַ�Ҳ�Ŵ���һ����������Ҳ�˷��˴洢�ռ䣬 ���� UTF-16
	 * ����˳����룬���ܶԵ����ַ��ı���ֵ����У�飬����м��һ���ַ���ֵ�𻵣������������ֵ������Ӱ�졣�� UTF-8 ��Щ���ⶼ�����ڡ�
	 * 
	 */

	// �ڲ��ࣺ�ڲ�������Ǿ�̬static�ģ�Ҳ����public��default��protected��private���Ρ�

	// ��Ա�ڲ��಻�ܺ���static�ı����ĺͷ�������Ϊ���ȴ����ⲿ���ٴ����ڲ����Լ��ġ�
	public class Outer {
		public void importent() {
			Outer o = new Outer();
			o.getInner().print("�����ڲ�����õķ���");
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

	// �ֲ��ڲ���(��ָ�ڲ��ඨ���ڷ������������ڡ�)
	/*
	 * �����ڷ������� public class Parcel4 { public Destination destination(String s) {
	 * class PDestination implements Destination���ӿڣ� { private String label;
	 * 
	 * private PDestination(String whereTo)���вι��죩 { label = whereTo; }
	 * 
	 * public String readLabel() { return label; } } return new PDestination(s); }
	 * 
	 * public static void main(String[] args) { Parcel4 p = new Parcel4();
	 * Destination d = p.destination("Tasmania"); } }
	 */

	/*
	 * ��������������ڲ��� public class Parcel5 { private void internalTracking(boolean b) {
	 * if (b) { class TrackingSlip { private String id; TrackingSlip(String s) { id
	 * = s; } String getSlip() { return id; } } TrackingSlip ts = new
	 * TrackingSlip("slip"); String s = ts.getSlip(); } }
	 * 
	 * public void track() { internalTracking(true); }
	 * 
	 * public static void main(String[] args) { Parcel5 p = new Parcel5();
	 * p.track(); } }
	 */

	// �����ڲ���
	/*
	 * public class Outer { public static void main(String[] args) { Outer outer =
	 * new Outer(); Inner inner = outer.getInner("Inner", "gz");
	 * System.out.println(inner.getName());
	 * 
	 * 
	 * }
	 * 
	 * public Inner getInner(final String name, String city) { return new Inner() {
	 * �˴��õ���Inner���Ѿ�ʵ���˵Ľӿڵ�Inner�����Ե��÷����õ����� private String nameStr = name;
	 * 
	 * public String getName() { return nameStr; } }; } }
	 * 
	 * //ע�ͺ󣬱���ʱ��ʾ��Inner�Ҳ��� interface Inner { �˴�Ϊ�ӿڣ������Ժ�ܶ���������õ��ӿ� String getName();
	 * }
	 */

	// hashcode��ʲô���Լ�ʲô��ɢ��
	public void hash() {
		/*
		 * hashcode�������ظö���Ĺ�ϣ��ֵ��֧�ָ÷�����Ϊ��ϣ���ṩһЩ�ŵ㣬���磬java.util.Hashtable �ṩ�Ĺ�ϣ��
		 * 
		 * hashCode �ĳ���Э���ǣ� �� Java Ӧ�ó���ִ���ڼ䣬��ͬһ�����϶�ε��� hashCode ����ʱ������һ�µط�����ͬ��������ǰ���Ƕ�����
		 * equals �Ƚ������õ���Ϣû�б��޸ġ���ĳһӦ�ó����һ��ִ�е�ͬһӦ�ó������һ��ִ�У����������豣��һ�¡� ������� equals(Object)
		 * ������������������ȵģ���ô�����������е�ÿ�������ϵ��� hashCode ����������������ͬ����������� ��������� �Ǳ���ģ��������
		 * equals(java.lang.Object) ����������������ȣ���ô�����������е���һ�����ϵ��� hashCode
		 * �����ض������ɲ�ͬ��������������ǣ�����ԱӦ��֪����Ϊ����ȵĶ������ɲ�ͬ�������������߹�ϣ������ܡ� ʵ���ϣ��� Object �ඨ���
		 * hashCode ����ȷʵ����Բ�ͬ�Ķ��󷵻ز�ͬ������������һ����ͨ�����ö�����ڲ���ַת����һ��������ʵ�ֵģ����� JavaTM
		 * ������Բ���Ҫ����ʵ�ּ��ɡ���
		 * 
		 * ��equals��������дʱ��ͨ���б�Ҫ��д hashCode ��������ά�� hashCode �����ĳ���Э������Э��������ȶ�����������ȵĹ�ϣ�롣
		 */
	}

	
}
