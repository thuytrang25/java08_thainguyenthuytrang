package common;

public enum CirclePosition {
	INSIDE("Trong đường tròn"),
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");

	public String value;

	CirclePosition(String value) {
		System.out.println("value:" + value);
		this.value = value;
	}

}
