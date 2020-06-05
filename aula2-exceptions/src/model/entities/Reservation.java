package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	// mascara da data
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getcheckIn() {
		return checkIn;
	}
// deletar pois no UML existe um metodo para atualização de datas
//	public void setcheckIn(Date checkIn) {
//		this.checkIn = checkIn;
//	}
	public Date getcheckOut() {
		return checkOut;
	}
// deletar pois no UML existe um metodo para atualização de datas
//	public void setcheckOut(Date checkOut) {
//		this.checkOut = checkOut;
//	}
	
	// implementação do metodo duração de dias 
	public long duration(){
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // converte horas em dias 
	}
		
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;	
	}
	
	public String toString(){
		return  "Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
	}
}	
