package finalsOOP;

import java.time.LocalDate;

public class EncapVar {
	
	private int fn;
	private String cn;
	private String cnat;
	private String cooo;
	private LocalDate cdd;
	
		EncapVar(int fn,String cn, String cnat, String cooo, LocalDate cdd) {
			this.fn = fn;
			this.cn = cn;
			this.cnat = cnat;
			this.cooo = cooo;
			this.cdd = cdd;
		}
		
		int getFlightNumber() {
			return fn;
		}
	
		String getCustomerName() {
			return cn;
		}
		
		String getCustomerNationality() {
			return cnat;
		}
				
		String getCustomerOrigin() {
			return cooo;
		}
		
		LocalDate getCustomerDate() {
			return cdd;
		}
}
