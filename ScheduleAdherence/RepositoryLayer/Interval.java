public class Interval
{
    //Start timeStamp of row
    public String StartTimeStamp;

    //End TimeStamp of row
    public String EndTimeStamp;

    //interval type of the row
    public String IntervalType;
    //constructor for creating the object
    Interval(String StartTimeStamp, String EndTimeStamp, String IntervalType)
    {
       this.StartTimeStamp=StartTimeStamp;
       this.EndTimeStamp=EndTimeStamp;
       this.IntervalType=IntervalType;
    }

}
