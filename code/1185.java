import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String date = Integer.toString(year).concat(String.format("%02d",month)).concat(String.format("%02d",day));
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date dDate = new Date();
        try{
            dDate = dateFormat.parse(date);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dDate);
        
        int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
        String answer = "";
        
        switch(dayNum){
            case 1:
                answer = "Sunday";
                break;
            case 2:
                answer = "Monday";
                break;
            case 3:
                answer = "Tuesday";
                break;
            case 4:
                answer = "Wednesday";
                break;
            case 5:
                answer = "Thursday";
                break;
            case 6:
                answer = "Friday";
                break;
            case 7:
                answer = "Saturday";
                break;
            
        }
        
        return answer;
    }
}
