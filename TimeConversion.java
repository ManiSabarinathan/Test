import java.util.StringTokenizer;

public class TimeConversion {
	public static void main(String ...strings ) {
		TimeConversion ref = new TimeConversion();
		String inputDate="06:40:03AM";
		String newDate = ref.dateCal(inputDate);
		System.out.println("newDate==> " + newDate);
		
		 
	}
	
	
	public String dateCal(String inputDate) {

		
		String hourString="";
		String returnDate="";
		
		//Split the string
		StringTokenizer tok = new StringTokenizer(inputDate,":");
		int hour = Integer.parseInt(tok.nextToken());
		
		String min = tok.nextToken();
		String secWithAMPM = tok.nextToken();
			
		//Split AM/PM from the seconds using Regular express
		String part[] = secWithAMPM.split("(?<=\\d)(?=\\D)");
		
		if(hour>0 && hour<12) {
			if(part[1].equals("PM")) {
				hour+=12;	
				hourString=""+hour;		
			} else  {
				hourString="0"+hour;
			}
				
			returnDate=hourString +":" +min+":"+part[0];
		}
		
		if(hour==12) {
			if(part[1].equals("AM"))
			{
				hourString="00";				
			}else {
				hourString="12";				
			}
			returnDate=hourString +":" +min+":"+part[0];
		}
		return returnDate;		
		
	}
	
}
