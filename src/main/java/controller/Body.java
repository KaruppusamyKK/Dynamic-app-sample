package controller;
import controller.Body;
public class Body {
	
	private int id;
	private String name;
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
	public Body() {

	}
	@Override
	public String toString() {
		return "Body [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	

	

}
