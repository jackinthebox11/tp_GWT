package tpgwt.shared;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Heater")
public class Heater extends Device {

}
