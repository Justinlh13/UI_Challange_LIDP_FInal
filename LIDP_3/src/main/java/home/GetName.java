package home;

public class GetName {

	// Get package name
	Package pack = getClass().getPackage();

	String packageName = pack.getName();

	// getters and setters for name of package
	public String getpackageName() {
		return packageName;
	}

	public void setGetName(String packageName) {

		this.packageName = packageName;
	}

}
