import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashAndEquals {
	
	public static void main(String args[]) {
		Person p1=new Person("1","kishore");
		Person p2=new Person("2","kishore");
		Person p3=new Person("1","abi");
		
		Set<Person> personSet = new HashSet<>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		System.out.println(personSet.toString());

	}
}

class Person {
	
	String id;
	String name;
	
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Change ur condition depends on id or name
	@Override
	public int hashCode() {
		return Objects.hash( id);
	}
	
	// Change ur condition depends on id or name
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return  Objects.equals(id, other.id);
	}
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}