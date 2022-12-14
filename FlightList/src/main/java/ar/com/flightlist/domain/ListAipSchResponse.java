
package ar.com.flightlist.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class ListAipSchResponse {
    private List<AirportScheduleResponse> lista;
    
    public ListAipSchResponse(){
        this.lista = new ArrayList<>();
    }

}
