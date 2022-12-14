package ar.com.flightlist.FlightList;

import ar.com.flightlist.domain.AirportScheduleResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.google.gson.Gson;
import java.net.URL;
import util.CallHttp;
import org.json.*;


@SpringBootApplication
public class FlightListApplication{

        private static final Logger log = LoggerFactory.getLogger(FlightListApplication.class);
        private String url = "https://airlabs.co/api/v9/schedules?dep_iata=EZE&api_key=c1b831f9-9830-4b89-9618-44a3436f1bd4";
        
//        @Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}   
        
	public static void main(String[] args) {
		SpringApplication.run(FlightListApplication.class, args);
	}
          
        @Bean
        public CommandLineRunner run() throws Exception {
            return args ->{
                RestTemplate restTemplate = new RestTemplate();
                //ResponseEntity<AirportScheduleResponse> response = restTemplate.getForEntity(url, AirportScheduleResponse.class);
                //AirportScheduleResponse[] response = restTemplate.getForObject(url, AirportScheduleResponse[].class);
//                System.out.println(restTemplate.getForObject(url, AirportScheduleResponse.class) );
//                ArrayList listResponse = new Gson().fromJson(restTemplate.getForObject(url, AirportScheduleResponse.class).toString(), ArrayList.class);
//                if( response.getStatusCode().equals(HttpStatus.OK) ){
//                    System.out.println(response.getBody().toString());
//                } else {
//                    System.out.println("Sin body");
//                }
                
                CallHttp callHttp = new CallHttp();
                String str = callHttp.llamadoHttpGet(new URL(url));
                 //ArrayList listResponse = new Gson().fromJson(callHttp.llamadoHttpGet(new URL(url)), ArrayList.class);

                JSONObject json = new JSONObject(str);
                JSONArray json2 = (JSONArray ) json.get("response");
                
                for(int i = 0; i < json2.length(); i++){
                    AirportScheduleResponse aip = new Gson().fromJson(json2.get(i).toString(), AirportScheduleResponse.class);
                    System.out.println("aip = " + aip);
                }
                

            };
    }
        
}
