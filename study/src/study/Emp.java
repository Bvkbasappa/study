package study;

import java.util.Comparator;

public class Emp implements Comparable<Emp>{

	private int id;
	private String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean equals(Object o)
	{
		if(o==null|| getClass()!=o.getClass()) {
			return false;
		}
		if(o==this)
		{return true;}
		Emp e=(Emp)o;
		return (this.getId()==e.getId());
		
	}
	public int hashCode() 
	{
	return id;	
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Emp o) {
		
		return this.id-o.id;
	}
	public static Comparator<Emp> nameemp=new Comparator<Emp>()
	{
		@Override
		public int compare(Emp e1,Emp e2)
		{
			return e1.getName().compareTo(e2.getName());
		}
	};
}
