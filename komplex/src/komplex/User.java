package komplex;

public class User {

	private String name;
	private Boolean enabled;
	private String neptunkod;
	public User(String name, Boolean enabled, String neptunkod) {
		super();
		this.name = name;
		this.enabled = enabled;
		this.neptunkod = neptunkod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getNeptunkod() {
		return neptunkod;
	}
	public void setNeptunkod(String neptunkod) {
		this.neptunkod = neptunkod;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", enabled=" + enabled + ", neptunkod=" + neptunkod + "]";
	}
	
	
	
	
	
	
}
