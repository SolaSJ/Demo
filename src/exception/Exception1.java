package exception;

public class Exception1 {
	public static void main(String[] args) {
		Exception1 ec = new Exception1();
		try {
			ec.run1(4, -1);
		} catch (FuShuException e2) {
			// TODO Auto-generated catch block
//			e2.printStackTrace();
			System.out.println(e2.getMessage());
			System.out.println(e2.getNum());
			
		}
		try {
			ec.invoking();//�����쳣
		} catch (Exception e1) {
			System.out.println(123);
			// e1.printStackTrace();�ڿ���̨���������ʾ
		}
		try {
			byte[] b = new byte[2];
			System.out.println(b[2]);
			// �����쳣�Ĳ��ֲ������л���˵�������
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("��������쳣������Խ��" + e);
			e.printStackTrace();

			ec.run(3, 0);// ���ﱨ��Ҳû��ִ��try����ֱ��ArithmeticException���������쳣������ִ������Ļ��ڡ�
		} catch (Exception e) {
			System.out.println("�ⲽҪ���");

		}
		System.out.println(2);
	}

	public int run(int a, int b) throws ArithmeticException {
		// �����쳣�������������߲����쳣��Ҳ���Զ���쳣����
		return a / b;
	}

	// ���ÿ��ܻ�����쳣�ķ���
	public void invoking() {
		run(3, 0);
	}

//	�Զ����쳣
	public int run1(int a, int b) throws FuShuException {
		if (b < 0) {
			throw new FuShuException("����Ϊ����",b);
		}
		return a / b;
	}
}
