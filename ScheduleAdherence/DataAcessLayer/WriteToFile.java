import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile
{

            try

    {
        FileWriter myWriter = new FileWriter("C:\\Users\\nnitku\\IdeaProjects\\ScheduleAdherence\\src\\output.csv");
        myWriter.write("");
        myWriter.close();
    }
            
            catch (IOException e)
            {
                System.out.println(e);

            }

    }



