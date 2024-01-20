package javase_8;

public class Emp {
	Integer eid;
	String name;
	public Emp(Integer eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + "]";
	}
	
	public boolean idCheck() {
		return eid>10;
	}
	
	public boolean nameCheck() {
		return name.startsWith("a");
	}
	 
	public  Integer test()
	{
		return eid+10;
	}
}
