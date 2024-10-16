package finalsOOP1;

import java.time.LocalDate;

public class C_EncapDatabase {

    private int cfn;
    private String cn;
    private String cnat;
    private String cooo;
    private static LocalDate cdd;
    private static String cdt;
    private static String cdair;
    private static String cdarr;

    C_EncapDatabase(int cfn, String cn, String cnat, String cooo, LocalDate cdd, String cdt, String cdair, String cdarr) {
        this.cfn = cfn;
        this.cn = cn;
        this.cnat = cnat;
        this.cooo = cooo;
        C_EncapDatabase.cdd = cdd;
        C_EncapDatabase.cdt = cdt;
        C_EncapDatabase.cdair = cdair;
        C_EncapDatabase.cdarr = cdarr;
    }

    int getFlightNumber() {
        return cfn;
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

    public static LocalDate getCustomerDate() {
        return cdd;
    }

    static String getCustomerTime() {
        return cdt;
    }

    static String getCustomerAirport() {
        return cdair;
    }

    static String getCustomerArrival() {
        return cdarr;
    }
 
}
