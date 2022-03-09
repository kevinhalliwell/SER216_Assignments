/**
 * 
 */
package Week3;

/**
 * @author kevinhalliwell
 *
 */
public class Customer {
	
	/*
	 * Declare variables 
	 */
	String name;
	String streetAddress;
	String city;
	String state;
	String zip;
	int age;
	
	/**
	 * @param name
	 * @param streetAddress
	 * @param city
	 * @param state
	 * @param zip
	 * @param age
	 */
	public Customer(String name, String streetAddress, String city, String state, String zip, int age) {
		super();
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.age = age;
	}
	
	public Customer(){
		name = "";
		streetAddress = "";
		city = "";
		state = "";
		zip = "";
		age = 0;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the full address
	 */
	public String displayAddress(){
		String address = "";
		address = name + ", " + streetAddress + ", " + state + ", " + city + ", " + zip;
		return address;
	}
	
	/**
	 * @return the address to be printed on a label
	 */
	public String displayAddressLabel(){
		String address = "";
		address = name + "\n" + streetAddress + "\n" + city + ", " + state + " " + zip;
		return address;
	}

}
