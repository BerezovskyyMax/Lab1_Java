package ua.lviv.iot;

public class Hotel {
	private int numberOfvisitorsPerYear;
	private String nameOfHotel;
	private int numberOfRooms;
	private int numberOfStars;
	private int numberOfStuff;
	public static int numberOfFloors;
	protected String countryWhereIsLocated;
	protected int pricePerNightInDollars;
	
	
	public Hotel(int numberOfvisitorsPerYear, String nameOfHotel, int numberOfRooms, int numberOfStars,
			int numberOfStuff, String countryWhereIsLocated, int pricePerNightInDollars) {
		this.numberOfvisitorsPerYear = numberOfvisitorsPerYear;
		this.nameOfHotel = nameOfHotel;
		this.numberOfRooms = numberOfRooms;
		this.numberOfStars = numberOfStars;
		this.numberOfStuff = numberOfStuff;
		this.countryWhereIsLocated = countryWhereIsLocated;
		this.pricePerNightInDollars = pricePerNightInDollars;
	}
	
	public Hotel(int numberOfvisitorsPerYear, String nameOfHotel, int numberOfRooms, int numberOfStars) {
		this(numberOfvisitorsPerYear, nameOfHotel, numberOfRooms, numberOfStars, 0, null, 0);
	}
	
	public Hotel() {
		this(0, "Unknown", 0, 0, 0, "Unknown", 0);
	}

	
	public int getNumberOfvisitorsPerYear() {
		return numberOfvisitorsPerYear;
	}
	public void setNumberOfvisitorsPerYear(int numberOfvisitorsPerYear) {
		this.numberOfvisitorsPerYear = numberOfvisitorsPerYear;
	}
	public String getNameOfHotel() {
		return nameOfHotel;
	}
	public void setNameOfHotel(String nameOfHotel) {
		this.nameOfHotel = nameOfHotel;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public int getNumberOfStars() {
		return numberOfStars;
	}
	public void setNumberOfStars(int numberOfStars) {
		this.numberOfStars = numberOfStars;
	}
	public int getNumberOfStuff() {
		return numberOfStuff;
	}
	public void setNumberOfStuff(int numberOfStuff) {
		this.numberOfStuff = numberOfStuff;
	}
	public int getPricePerNightInDollars() {
		return pricePerNightInDollars;
	}
	public void setPricePerNightInDollars(int pricePerNightInDollars) {
		this.pricePerNightInDollars = pricePerNightInDollars;
	}
	
	
	@Override
	public String toString() {
		return "***Hotel***\nnumberOfvisitorsPerYear: " + numberOfvisitorsPerYear + "; nameOfHotel: " + nameOfHotel
				+ "; numberOfRooms: " + numberOfRooms + "; numberOfStars: " + numberOfStars + "; numberOfStuff: "
				+ numberOfStuff + "; countryWhereIsLocated: " + countryWhereIsLocated + "; pricePerNightInDollars: "
				+ pricePerNightInDollars;
	}
	
	public String printNumberOfFloors() {
		return "Number of floors(non static) : " + Hotel.numberOfFloors;
	}
	
	public static String printStaticNumberOfFloors() {
		return "Number of floors(static) : " + Hotel.numberOfFloors;
	}
	
	public void resetValues(int numberOfvisitorsPerYear, String nameOfHotel, int numberOfRooms, int numberOfStars,
			int numberOfStuff, String countryWhereIsLocated, int pricePerNightInDollars) {
		this.numberOfvisitorsPerYear = numberOfvisitorsPerYear;
		this.nameOfHotel = nameOfHotel;
		this.numberOfRooms = numberOfRooms;
		this.numberOfStars = numberOfStars;
		this.numberOfStuff = numberOfStuff;
		this.countryWhereIsLocated = countryWhereIsLocated;
		this.pricePerNightInDollars = pricePerNightInDollars;
	}
	
}
