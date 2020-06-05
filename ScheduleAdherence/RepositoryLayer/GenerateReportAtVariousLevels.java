public class GenerateReportAtVariousLevels
{
    public void GenerateReportAtEachLevel()
    {
        //report generating
        //user level daily
        ScheduleAdherenceGenerateReport dailyUserLevel= new ScheduleAdherenceGenerateReport(Duration.DAILY,ReportLevel.USER);
        dailyUserLevel.generateReport();

        //Site level daily
        ScheduleAdherenceGenerateReport dailySiteLevel= new ScheduleAdherenceGenerateReport(Duration.DAILY,ReportLevel.SITE);
        dailySiteLevel.generateReport();

        //WorkGroup level daily
        ScheduleAdherenceGenerateReport dailyWorkGroupLevel= new ScheduleAdherenceGenerateReport(Duration.DAILY,ReportLevel.WORKGROUP);
        dailyWorkGroupLevel.generateReport();

        //Interval level daily
        ScheduleAdherenceGenerateReport dailyIntervalLevel= new ScheduleAdherenceGenerateReport(Duration.DAILY,ReportLevel.INTERVAL);
        dailyIntervalLevel.generateReport();

        //user level Weekly
        ScheduleAdherenceGenerateReport WeeklyUserLevel= new ScheduleAdherenceGenerateReport(Duration.WEEKLY,ReportLevel.USER);
        WeeklyUserLevel.generateReport();

        //Site level Weekly
        ScheduleAdherenceGenerateReport WeeklySiteLevel= new ScheduleAdherenceGenerateReport(Duration.WEEKLY,ReportLevel.SITE);
        WeeklySiteLevel.generateReport();

        //WorkGroup level Weekly
        ScheduleAdherenceGenerateReport WeeklyWorkGroupLevel= new ScheduleAdherenceGenerateReport(Duration.WEEKLY,ReportLevel.WORKGROUP);
        WeeklyWorkGroupLevel.generateReport();

        //Interval level Weekly
        ScheduleAdherenceGenerateReport WeeklyIntervalLevel= new ScheduleAdherenceGenerateReport(Duration.WEEKLY,ReportLevel.INTERVAL);
        WeeklyIntervalLevel.generateReport();

        //user level Monthly
        ScheduleAdherenceGenerateReport MonthlyUserLevel= new ScheduleAdherenceGenerateReport(Duration.MONTHLY,ReportLevel.USER);
        MonthlyUserLevel.generateReport();

        //Site level Monthly
        ScheduleAdherenceGenerateReport MonthlySiteLevel= new ScheduleAdherenceGenerateReport(Duration.MONTHLY,ReportLevel.SITE);
        MonthlySiteLevel.generateReport();

        //WorkGroup level Monthly
        ScheduleAdherenceGenerateReport MonthlyWorkGroupLevel= new ScheduleAdherenceGenerateReport(Duration.MONTHLY,ReportLevel.WORKGROUP);
        MonthlyWorkGroupLevel.generateReport();

        //Interval level Monthly
        ScheduleAdherenceGenerateReport MonthlyIntervalLevel= new ScheduleAdherenceGenerateReport(Duration.MONTHLY,ReportLevel.INTERVAL);
        MonthlyIntervalLevel.generateReport();
    }
    public void GenerateReportAtEachLevel(Duration duration,ReportLevel reportlevel)
    {
        ScheduleAdherenceGenerateReport MonthlyIntervalLevel= new ScheduleAdherenceGenerateReport(duration,reportlevel);
        MonthlyIntervalLevel.generateReport();
    }

}
