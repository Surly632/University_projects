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
class User {
    private int ScheduleId,TotalSeats,SeatFare,DriverNumber;
    private String BusFrom,BusTo,BusTime,Offday,BusNumber,Condition,Boarding;
    
    public User(int ScheduleId,String BusFrom,String BusTo, String BusTime,String Offday,String BusNumber,int TotalSeats,int DriverNumber,int SeatFare,String Condition,String Boarding)
    {
       this.ScheduleId=ScheduleId;
       this.BusFrom = BusFrom;
       this.BusTo = BusTo;
       this.BusTime=BusTime;
       this.Offday = Offday;
       this.BusNumber=BusNumber;
       this.TotalSeats=TotalSeats;
       this.DriverNumber= DriverNumber;
       this.SeatFare= SeatFare;
       this.Condition=Condition;
       this.Boarding=Boarding;
    }
    
    public int getScheduleID(){
        return ScheduleId;
    }
    
        public String getBusFrom(){
        return BusFrom;
    }
        
        public String getBusTo(){
        return BusTo;
    }
        
        public String getBusTime (){
        return BusTime;
    }
        public String getOffday(){
        return Offday;
    }
        
        public String getBusNumber(){
        return BusNumber;
    }
        
        public int getTotalSeats(){
        return TotalSeats;
    }
        
        public int getDriverNumber(){
        return DriverNumber;
    }
        
         public int getSeatFare(){
        return SeatFare;
    }
         
       public String getCondition(){
        return Condition;
    }
       
       public String getBoarding()
       {
           return Boarding;
       }
  }
    
    

