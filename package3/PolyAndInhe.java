package package3;

public class PolyAndInhe {
	
	String city;
	String state;
	
	// Constructors
	public PolyAndInhe() {}
	public PolyAndInhe(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	

}
