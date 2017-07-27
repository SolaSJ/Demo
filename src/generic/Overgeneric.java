package generic;

public class Overgeneric<T> {
	private T b;

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}
	public static void main(String[] args) {
		
		Overgeneric<Boolean>o1=new Overgeneric<Boolean>();
		o1.setB(true);
		System.out.println(o1.getB());
		Overgeneric<Float>o2=new Overgeneric<Float>();
		o2.setB(1.2f);
		System.out.println(o2.getB());
		
		
	}
	

}
