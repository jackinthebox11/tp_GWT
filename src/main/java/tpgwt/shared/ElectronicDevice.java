package tpgwt.shared;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Electronic")
public class ElectronicDevice extends Device {

}
