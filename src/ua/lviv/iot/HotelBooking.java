package ua.lviv.iot;

public class HotelBooking {

	public static void main(String[] args) {
		
		final int SIZE_OF_ARRAY = 4;
		
		Hotel.numberOfFloors = 10;

		Hotel firstHotel = new Hotel(10000, "Marriot", 2000, 5, 3000, "International", 400);

		System.out.println(firstHotel.toString());

		System.out.println("");

		Hotel secondHotel = new Hotel(5000, "Dnister", 1000, 4, 3000, "Lviv", 400);

		System.out.println(secondHotel.toString());

		System.out.println("");

		Hotel thirdHotel = new Hotel();

		System.out.println(thirdHotel.toString());

		System.out.println("");
		System.out.println("");

		System.out.println(Hotel.printStaticNumberOfFloors());

		System.out.println(firstHotel.printNumberOfFloors());

		System.out.println("");
		
		Hotel[] hotelArray = new Hotel[SIZE_OF_ARRAY];
		int index = 0;
		
		do {
			hotelArray[index] = new Hotel();
			index ++;
			
		} while(index < SIZE_OF_ARRAY);
		
		for(Hotel currentIndex: hotelArray) {
			System.out.println(currentIndex.toString() + "\n");
		}
	}

}
