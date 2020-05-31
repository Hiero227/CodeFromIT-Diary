package pokemon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Saver
{
	
	LocalDate date = LocalDate.now();	//Datum práve teï
	
	LocalDateTime time = LocalDateTime.now();	//Èas právì teï
	

	public int year = time.getYear();			//Rok, mìsíc, bla bla zapsání do intù
	public int month = time.getMonthValue();
	public int day = time.getDayOfMonth();
	public int hour = time.getHour();
	public int min = time.getMinute();
	public int sec = time.getSecond();

	public int lastyear;
	public int lastmonth;
	public int lastday;
	public int lasthour;
	public int lastmin;
	public int lastsec;

	public String last = "";
	public String line;
	
	public int timesExecuted;

	public void Log()
	{

		

		// *************************READING*************************

		Path path = Paths.get("log.txt");
		
		try (BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8")))
		{
			

			while ((line = br.readLine()) != null)
			{
				
				last = line;
			}

		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		path = Paths.get("timesExecuted.txt");
		try (BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8")))
		{
			
			timesExecuted = Integer.parseInt(br.readLine());

			

		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
		
		
		// *************************WRITING*************************

		File file = new File("timesExecuted.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false)))
		{
			
			timesExecuted += 1;
			bw.write(Integer.toString(timesExecuted));
			
		} catch (IOException e)
		{

			e.printStackTrace();
		}
		
		
		file = new File("log.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true)))
		{
			

			
			
			bw.append(year + "," + day + "," + month + "," + hour + "," + min + "," + sec + "\n");

		} catch (IOException e)
		{

			e.printStackTrace();
		}

	}

	// *************************WRITINGhesteg2*************************

	public String CalculateDifference()
	{
		String diff = "";
		String[] timeParts = last.split(",");
		
		if (last != null)
		{

			lastyear = Integer.parseInt(timeParts[0]);
			lastday = Integer.parseInt(timeParts[1]);
			lastmonth = Integer.parseInt(timeParts[2]);
			lasthour = Integer.parseInt(timeParts[3]);
			lastmin = Integer.parseInt(timeParts[4]);
			lastsec = Integer.parseInt(timeParts[5]);
		}
		
		System.out.println("Last program execution was: " + (Math.abs(year - lastyear)) + " years, "
				+ (Math.abs(month - lastmonth)) + " months, " + (Math.abs(day - lastday)) + " days, "
				+ (Math.abs(hour - lasthour)) + " hours, " + (Math.abs(min - lastmin)) + " minutes, "
				+ (Math.abs(sec - lastsec)) + " seconds ago");
		System.out.println("Program was executed " + timesExecuted + " times");
		return diff;
	}

}
