package hotel.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import hotel.model.exceptions.DomainException;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		
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

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	//m�todo dura��o de dias
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
	}
	
	//updateDates
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("Room %d, check-in: %s, check-out: %s, %d nights", roomNumber,sdf.format(checkIn), sdf.format(checkOut), duration());
	}

}
