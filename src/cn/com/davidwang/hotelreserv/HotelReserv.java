/**
 * 
 */
package cn.com.davidwang.hotelreserv;
/**
 * @author DavidWang
 *
 */
public class HotelReserv {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		IHotelReservManager hotelReservManager = new HotelReservManager();
		hotelReservManager.OutputHints();
		
		while (true){
			if(hotelReservManager.GetInput()){
				if(hotelReservManager.GetCheapestHotel()){
					hotelReservManager.OutputResult();
				}
			}
		}
	}

	

}
