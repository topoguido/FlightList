
package ar.com.flightlist.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.ResponseBody;

@Data
public class AirportScheduleResponse {
    
    @JsonProperty("airline_iata")
    private String airline_iata;
    
    @JsonProperty("airline_icao")
    private String airline_icao;
    
    @JsonProperty("flight_iata")
    private String flight_iata;
    
    @JsonProperty("flight_icao")
    private String flight_icao;
    
    @JsonProperty("flight_number")
    private String flight_number;
    
    @JsonProperty("dep_iata")
    private String dep_iata;
    
    @JsonProperty("dep_icao")
    private String dep_icao;
    
    @JsonProperty("dep_terminal")
    private String dep_terminal;
    
    @JsonProperty("dep_gate")
    private String dep_gate;
    
    @JsonProperty("dep_time")
    private String dep_time;
    
    @JsonProperty("dep_time_utc")
    private String dep_time_utc;
    
    @JsonProperty("dep_estimated")
    private String dep_estimated;
    
    @JsonProperty("dep_estimated_utc")
    private String dep_estimated_utc;
    
    @JsonProperty("dep_actual")
    private String dep_actual;
    
    @JsonProperty("dep_actual_utc")
    private String dep_actual_utc;
    
    @JsonProperty("arr_iata")
    private String arr_iata;
    
    @JsonProperty("arr_icao")
    private String arr_icao;
    
    @JsonProperty("arr_terminal")
    private String arr_terminal;
    
    @JsonProperty("arr_gate")
    private String arr_gate;
    
    @JsonProperty("arr_baggage")
    private String arr_baggage = null;
    
    @JsonProperty("arr_time")
    private String arr_time;
    
    @JsonProperty("arr_time_utc")
    private String arr_time_utc;
    
    @JsonProperty("arr_estimated")
    private String arr_estimated;
    
    @JsonProperty("arr_estimated_utc")
    private String arr_estimated_utc;
    
    @JsonProperty("cs_airline_iata")
    private String cs_airline_iata = null;
    
    @JsonProperty("cs_flight_number")
    private String cs_flight_number = null;
    
    @JsonProperty("cs_flight_iata")
    private String cs_flight_iata = null;
    
    @JsonProperty("status")
    private String status;
    
    @JsonProperty("duration")
    private float duration;
    
    @JsonProperty("delayed")
    private String delayed = null;
    
    @JsonProperty("aircraft_icao")
    private String aircraft_icao;
    
    @JsonProperty("arr_time_ts")
    private float arr_time_ts;
    
    @JsonProperty("dep_time_ts")
    private float dep_time_ts;
    
    @JsonProperty("arr_estimated_ts")
    private float arr_estimated_ts;
    
    @JsonProperty("dep_estimated_ts")
    private float dep_estimated_ts;
    
    @JsonProperty("dep_actual_ts")
    private float dep_actual_ts;
    
}
