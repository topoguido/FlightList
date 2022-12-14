
package ar.com.flightlist.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class AirportScheduleRequest {
    
    private String apiKey;
    private String departureIata;
    private String departureIcao;
    private String arriveIata;
    private String arriveIcao;
    private String airlineIcao;
    private String airlineIata;
    
    @Override
    public String toString(){
        return "departureIata: " + departureIata  
                + ", departureIcao: " + departureIcao 
                + ", arriveIata: " + arriveIata
                + ", arriveIcao: " + arriveIcao
                + ", airlineIcao: " + airlineIcao
                + ", airlineIata: " + airlineIata;
    }
    
}
