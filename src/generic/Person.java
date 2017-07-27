package generic;

public class Person implements Comparable<Person> {
	private int age;
	@Override
	public String toString() {
		return "     " + " name=" + name ;
	}

	private String name;
	
	public Person(int belong, String name) {
		super();
		this.age = belong;
		this.name = name;
	}

	public int getBelong() {
		return age;
	}

	public void setBelong(int belong) {
		this.age= belong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		int num1=this.name.compareTo(o.getName());
		if(this.age==(o.age)){
			return num1;
		}else if(this.age>(o.age)){
			return 1;
		}else{
			return -1;
		}
	
	}

	

}
