import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the duration and Report Level: ");

        Duration duration= sc.nextLine();
        ReportLevel reportlevel=sc.nextLine();
        //creating object for report creation

        GenerateReportAtVariousLevels reportatvariousLevels= new GenerateReportAtVariousLevels();

        //generating report for each level and duration
        reportatvariousLevels.GenerateReportAtEachLevel();

        //generate report at specified duration and report level
        reportatvariousLevels.GenerateReportAtEachLevel(duration,reportlevel);

    }

}
