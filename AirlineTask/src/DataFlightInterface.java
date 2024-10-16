
public interface DataFlightInterface {

	void flightData();
	
	// Local Schedule //
	int lfschedMon = 2;
	int lfschedTue = 3;
	int lfschedWed = 6;
	int lfschedThurs = 2;
	int lfschedFri = 1;
	int lfschedSat = 9;
	int lfschedSun = 8;
	
	// Local Flight Total
	int lfNum =  lfschedMon + lfschedTue + lfschedWed + lfschedThurs + lfschedFri + lfschedSat + lfschedSun;
	
	
	// International Schedule //
	int ifschedMon = 5;
	int ifschedTue = 7;
	int ifschedWed = 9;
	int ifschedThurs = 12;
	int ifschedFri = 6;
	int ifschedSat = 15;
	int ifschedSun = 8;
		
	// International Flight Total
	int ifNum =  ifschedMon + ifschedTue + ifschedWed + ifschedThurs + ifschedFri + ifschedSat + ifschedSun;
	
	// Schedule Both Inter. or Local
	int schedMon = lfschedMon + ifschedMon;
	int schedTue = lfschedTue + ifschedTue;
	int schedWed = lfschedWed + ifschedWed;
	int schedThurs = lfschedThurs + ifschedThurs;
	int schedFri = lfschedFri + ifschedFri;
	int schedSat = lfschedSat + ifschedSat ;
	int schedSun = lfschedSun + ifschedSun;
	
	// Week Schedule
	int schedWeek1 = lfNum + ifNum;
	int schedWeek2 =  101;
	int schedWeek3 = 143;
	int schedWeek4 =  89;

	// Totality of the flight between Local and Inter.
	int totalweekFlight = schedMon + schedTue + schedWed + schedThurs + schedFri + schedSat + schedSun;
	int totalmonthFlight =  schedWeek1 + schedWeek2 + schedWeek3 + schedWeek4;
}
