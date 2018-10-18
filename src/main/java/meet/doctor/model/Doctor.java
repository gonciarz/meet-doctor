package meet.doctor.model;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.Set;

@Value
@Builder
public class Doctor {

    String id;

    String name;
    
    String district;

    String city;

    String country;

    @Singular
    Set<String> specializations;

}
