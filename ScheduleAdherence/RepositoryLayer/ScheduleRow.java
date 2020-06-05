public class ScheduleRow
{
    //userid of User
      public String UserId;

    //WorkGroup of User
       public  String WorkGroup;

       // Site of User
       public String Site;

       //time interval and Interval type
       public Interval interval;

       //constructor for creating oblect

       ScheduleRow(String UserId,String Site, String WorkGroup,Interval interval)
       {
           this.UserId=UserId;
           this.Site=Site;
           this.WorkGroup=WorkGroup;
           this.interval=interval;
       }


}
