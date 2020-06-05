import java.util.*;
import java.nio.*;
import java.nio.file.*;
public class uploadFileToDataBase
{
    //type of file to be uploaded
    private ScheduleType scheduletype;

    uploadFileToDataBase(ScheduleType scheduletype)
    {
        this.scheduletype=scheduletype;
    }
    //uploading the planned schedule file into the database
   public void uploadFile()
   {
       switch (scheduletype)
       {
           //uploading the  planned schedule file to the database
           case PLANNEDSCHEDULE:
           {
               try
               {
                   //extracting information from the file
                   List <String> lines=Files.readAllLines(Paths.get("C:\\Users\\nnitku\\IdeaProjects\\ScheduleAdherence\\src\\PlannedScheduleData.csv"));

                   for(String line : lines)
                   {
                       line =line.replace("\"","");
                       String [] result=line.split(" ");

                       //for each row of plannned schedule file create an object of schedulerow type
                       Interval interval=new Interval(result[3],result[4],result[5]);
                       ScheduleRow scheduleRow=new ScheduleRow(result[0],result[1],result[2],interval);

                       //insert into table of databse

                   }


               }
               catch(Exception e)
               {
                   System.out.println(e);
               }


           }//uploading the Actual Scheule File
           case ACTUALSCHEDULE:
           {
               try
               {//extracting information from the file row wise
                   List <String> lines=Files.readAllLines(Paths.get("C:\\Users\\nnitku\\IdeaProjects\\ScheduleAdherence\\src\\ActualSchduleData.csv"));

                   for(String line : lines)
                   {
                       line =line.replace("\"","");
                       String [] result=line.split(" ");
                       //for each row of actual schedule table create an object of scheduleRow type
                       Interval interval=new Interval(result[3],result[4],result[5]);
                       ScheduleRow scheduleRow=new ScheduleRow(result[0],result[1],result[2],interval);

                       //insert into table

                   }

               }
               catch(Exception e)
               {
                   System.out.println(e);
               }


           }

       }

   }

}
