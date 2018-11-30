package home.Models;

//Customer Class in models
public class Customer {
	// variables for name and age
	private String name;
	private Integer age;

	// getters and setters for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getter and setter for age
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	// converts age and name to string values
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

}
