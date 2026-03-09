package lang.immutable.address;

public class ImmutableAddress {
	
	// 그냥 변하지 않게 Final 로 정의 하면 
	private final String value;
	
	public ImmutableAddress(String value) {
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value.toString();
	}
	
	
}
