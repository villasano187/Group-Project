


public class Address
{
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String country;
	private int zip;
	
	
	public Address(String s1, String s2, String inputCity, String inputState, String cntry, int z)
	{
		street1 = s1;
		street2 = s2;
		city = inputCity;
		state = inputState;
		zip = z;
		country = cntry;
	}
	
	public Address(String s1, String c, String st, String cn, int z)
	{
		street1 = s1;
		city = c;
		state = st;
		country = cn;
		zip = z;
	}
	
	public Address(Address input)
	{
		street1 = input.street1;
		street2 = input.street2;
		city = input.city;
		state = input.state;
		country = input.country;
		zip = input.zip;
	}
	
	public String toString()
	{
		if(street2 == null)
		{
			return (street1+ "\n" + city + ", " + state + ", " + zip + "\n" + country);
		}
		else
		{
			return (street1 + "\n" + street2 + "\n" + city + ", " + state + ", " + zip + "\n" + country);
		}
	}
	
	public void changeStreet1(String input)
	{
		street1 = input;
	}
	
	public void changeStreet2(String input)
	{
		street2 = input;
	}
	
	public void changeState(String input)
	{
		state = input;
	}
	
	public void changeZip(int input)
	{
		zip = input;
	}
	
	public void changeCountry(String input)
	{
		country = input;
	
	}
	
	public String getStreet1()
	{
		return street1;
	}
	
	public String getStreet2()
	{
		return street2;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public int getZip()
	{
		return zip;
	}
	
}
	