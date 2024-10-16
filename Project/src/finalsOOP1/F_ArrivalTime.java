package finalsOOP1;

import java.time.LocalDate;
import java.time.LocalTime;

public class F_ArrivalTime extends E_Distance {

	@Override
    public String calculateArrivalTime() {
        String[] timeParts = depTime.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1].substring(0, 2));
        boolean isPM = depTime.toUpperCase().endsWith("PM");

        if (isPM && hour != 12) {
            hour += 12;
        } else if (!isPM && hour == 12) {
            hour = 0;
        }

        int distance = calculateDistance();
        int kmPerHour = 800;
        int flightHours = distance / kmPerHour;
        int remainingKm = distance % kmPerHour;

        LocalTime parsedTime = LocalTime.of(hour, minute);
        LocalTime arrivalTime = parsedTime.plusHours(flightHours).plusMinutes(remainingKm * 60 / kmPerHour);

        // Adjusting the arrival hour for AM or PM
        int arrivalHour = arrivalTime.getHour();
        String amOrPm = "AM";
        if (arrivalHour >= 12) {
            amOrPm = "PM";
            if (arrivalHour > 12) {
                arrivalHour -= 12;
            }
        }

        // Formatting the arrival time with AM or PM
        String formattedArrivalTime = String.format("%d:%02d %s", arrivalHour, arrivalTime.getMinute(), amOrPm);

        return formattedArrivalTime;
    }

	@Override
	public int calculateDistance() {
		return super.calculateDistance();
	}

	@Override
	LocalDate calculateArrivalDate() {
		return null;
	}

}