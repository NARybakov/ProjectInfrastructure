package rybakov.locality.service.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "infrastructure")


public class Infrastructure implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_infrastructure")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "square_meters")
    private int square;

    @Column(name="floors")
    private int floors;

    @Column(name = "persons")
    private int persons;

    @ManyToOne (cascade = CascadeType.MERGE)
    @JoinColumn(name="localoty_id")
    private Locality locality;



}
