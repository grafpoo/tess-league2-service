package io.tess.league2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "THING" )
public class Thing {
    public static final Thing DEFAULT_THING = new Thing(null, "thing", 11);

    public Thing (Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer size;
}
