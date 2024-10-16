package finalsOOP1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class G_ArrivalDate extends F_ArrivalTime {

	@Override
	public int calculateDistance() {
		return super.calculateDistance();
	}

	@Override
	public String calculateArrivalTime() {
		return super.calculateArrivalTime();
	}

	public LocalDate calculateArrivalDate() {
		String[] timeParts = depTime.split(":");
		int hour = Integer.parseInt(timeParts[0]);
		int minute = Integer.parseInt(timeParts[1].substring(0, 2));
		boolean isPM = depTime.toUpperCase().endsWith("PM");

		if (isPM && hour != 12) {
			hour += 12;
		} else if (!isPM && hour == 12) {
			hour = 0;
		}

		LocalTime parsedTime = LocalTime.of(hour, minute);
		LocalDateTime departureDateTime = LocalDateTime.of(depDate, parsedTime);

		int distance = calculateDistance();
		int kmPerHour = 800;
		double flightHoursDecimal = (double) distance / kmPerHour;

		// Calculate flight hours and remaining minutes
		int flightHours = (int) flightHoursDecimal;
		int remainingMinutes = (int) ((flightHoursDecimal - flightHours) * 60);

		LocalDateTime arrivalDateTime = departureDateTime.plusHours(flightHours).plusMinutes(remainingMinutes);

		return arrivalDateTime.toLocalDate();
	}

}