package com.vivek.Pk;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class CompositeKey {
     private Integer id;
     private long prn;
}
