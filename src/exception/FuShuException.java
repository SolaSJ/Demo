package exception;

public class FuShuException extends Exception {
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public FuShuException(){
		
	}
	public FuShuException(String str) {
		super(str);
	}
	public FuShuException(String str,int num) {
		super(str);
		this.num=num;
	}
}
