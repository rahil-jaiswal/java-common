import java.time.Instant;
import java.time.OffsetDateTime;

public class TimeConversion
{
    private static Long getEpochMillis(String timeStamp){
        Long epochTime;
        if(timeStamp.indexOf('Z')>0)
		 epochTime = Instant.parse(timeStamp.substring(0,timeStamp.indexOf('Z')+1)).toEpochMilli()/1000;
		else
		 epochTime = OffsetDateTime.parse(timeStamp).toEpochSecond();
		return epochTime; 
	}

	public static void main(String[] args) throws Exception{
		System.out.println("Hello World");
		String s1 = new String("2022-08-18T22:28:23.881881Z[Etc/UTC]");
		System.out.println("Hello, World! "+s1+"  "+getEpochMillis(s1));
		String s2 = new String("2022-08-19T03:58:23+05:30");
		System.out.println("Hello, World! "+s2+"  "+getEpochMillis(s2));
		
	}
}

