public class TimeCalc {
    public static void main(String[] args) {

                String time = args[0]; 
                int minutesToAdd = Integer.parseInt(args[1]);
                 
                 String[] timeParts = time.split(":");
                 int hours = Integer.parseInt(timeParts[0]);
                 int minutes = Integer.parseInt(timeParts[1]);
                int totalMinutes = (hours * 60) + minutes;
                
                totalMinutes += minutesToAdd; 
                 int newHours = (totalMinutes / 60) % 24;  
                 int newMinutes = totalMinutes % 60;  
         
                 if (newHours > 12) {
                        newHours -= 12;
                      }
                String formattedHours;
                      if (newMinutes < 10) {
                         formattedHours = "0" + newHours;
                        } else {
                            formattedHours = String.valueOf(newHours); 
                        }
        
                String formattedMinute;
                      if (newMinutes < 10) {
                          formattedMinute = "0" + newMinutes;  
                      } else {
                          formattedMinute = String.valueOf(newMinutes); 
                      }
                      System.out.println(formattedHours + ":" + formattedMinute);
    }
}
