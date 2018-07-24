package in.cdac.dac.onlinereservation.model;

import java.util.Date;

/**
 * Created by swati on 7/18/18.
 */
public class BookingRequest {
    private String hotelId;
    private Date from;
    private Date to;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
