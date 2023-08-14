/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusManagementSystem;

/**
 *
 * @author Abmhi
 */
class Booking {
     private int BookingId,PassengerMobile,SeatFare,BookedSeats;
    private String BusFrom,BusTo,BusNumber,DepartureTime,ReportingTime,seatNumber,PassengerName,Boarding,Condition,IssueDate,IssuedBy;
    
    public Booking(int BookingId,String BusFrom, String BusTo, String BusNumber, String DepartureTime, String ReportingTime, String seatNumber, String PassengerName, int PassengerMobile,String Boarding, String Condition, String IssueDate, String IssuedBy,int SeatFare,int BookedSeats) {
        this.BookingId = BookingId;
        this.BusFrom = BusFrom;
        this.BusTo = BusTo;
        this.BusNumber = BusNumber;
        this.DepartureTime = DepartureTime;
        this.ReportingTime = ReportingTime;
        this.seatNumber = seatNumber;
        this.PassengerName = PassengerName;
        this.PassengerMobile = PassengerMobile;
        this.Boarding = Boarding;
        this.Condition = Condition;
        this.IssueDate = IssueDate;
        this.IssuedBy = IssuedBy;
        this.SeatFare =SeatFare;
        this.BookedSeats=BookedSeats;
    }

    public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int BookingId) {
        this.BookingId = BookingId;
    }

    public int getPassengerMobile() {
        return PassengerMobile;
    }

    public void setPassengerMobile(int PassengerMobile) {
        this.PassengerMobile = PassengerMobile;
    }

    public String getBusFrom() {
        return BusFrom;
    }

    public void setBusFrom(String BusFrom) {
        this.BusFrom = BusFrom;
    }

    public String getBusTo() {
        return BusTo;
    }

    public void setBusTo(String BusTo) {
        this.BusTo = BusTo;
    }

    public String getBusNumber() {
        return BusNumber;
    }

    public void setBusNumber(String BusNumber) {
        this.BusNumber = BusNumber;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    public String getReportingTime() {
        return ReportingTime;
    }

    public void setReportingTime(String ReportingTime) {
        this.ReportingTime = ReportingTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }

    public String getBoarding() {
        return Boarding;
    }

    public void setBoarding(String Boarding) {
        this.Boarding = Boarding;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    public String getIssuedBy() {
        return IssuedBy;
    }

    public void setIssuedBy(String IssuedBy) {
        this.IssuedBy = IssuedBy;
    }
        public void setSeatFare(int SeatFare) {
        this.SeatFare = SeatFare;
    }
        public int getSeatFare() {
        return SeatFare;
    }

         public void setBookedSeats(int BookedSeats) {
        this.BookedSeats = BookedSeats;
    }
    public int getBookedSeats() {
       return BookedSeats;
    }
    
}
