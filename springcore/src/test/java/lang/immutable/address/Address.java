package lang.immutable.address;

public class Address {
	private String value;
	public Address(String value) {
		this.value = value;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value.toString();
	}
	
	
}
