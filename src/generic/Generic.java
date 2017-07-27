package generic;

public class Generic {
	private Object b;

	public Object getB() {
		return b;
	}

	public void setB(Object b) {
		this.b = b;
	}

	public static void main(String[] args) {
		Generic g = new Generic();
		g.setB(new Boolean(true));
		System.out.println(g.getB());
		g.setB(new Float(1.2f));
		Float f = (Float) g.getB();
		System.out.println(f);

	}

}
