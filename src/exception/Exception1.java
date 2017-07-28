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
			ec.invoking();//处理异常
		} catch (Exception e1) {
			System.out.println(123);
			// e1.printStackTrace();在控制台输出错误提示
		}
		try {
			byte[] b = new byte[2];
			System.out.println(b[2]);
			// 出现异常的部分不会运行或者说跳过输出
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("程序出现异常，数组越界" + e);
			e.printStackTrace();

			ec.run(3, 0);// 这里报错。也没有执行try所以直接ArithmeticException（算术）异常，不会执行下面的环节。
		} catch (Exception e) {
			System.out.println("这步要输出");

		}
		System.out.println(2);
	}

	public int run(int a, int b) throws ArithmeticException {
		// 声明异常，待方法调用者捕获异常，也可以多个异常并列
		return a / b;
	}

	// 调用可能会出现异常的方法
	public void invoking() {
		run(3, 0);
	}

//	自定义异常
	public int run1(int a, int b) throws FuShuException {
		if (b < 0) {
			throw new FuShuException("除数为负数",b);
		}
		return a / b;
	}
}
