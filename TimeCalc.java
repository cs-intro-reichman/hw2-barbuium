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
         
                String formattedTime = String.format("%02d:%02d", newHours, newMinutes);
                System.out.println(formattedTime);
    }
}
