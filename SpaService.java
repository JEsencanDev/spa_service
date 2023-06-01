// Joey Esencan, Chapter 3 exercises, 5/11/2023

public class SpaService
{
	// Instance Variables and Data Fields
	private String serviceDescription;
	private double price;

	// New Constructor method for SpaService class
	public SpaService()
	{
		serviceDescription = "Basic Service";
		price = 15.99;
	}

	// Definition of the setServiceDescription(); method
	public void setServiceDescription(String service)
	{	
		serviceDescription = service;
	} //End of setServiceDescription()

	//Definition of setPrice(); method

	public void setPrice(double servicePrice)
	{	
		price = servicePrice;
	} //End of setPrice()

	// Definition of getServiceDescription()
	public String getServiceDescription()
	{
		return serviceDescription;
	} //End of getServiceDescription()

	// Definition of getPrice() method
	public double getPrice()
	{
		return price;
	} //End of getPrice() method

} // End of class