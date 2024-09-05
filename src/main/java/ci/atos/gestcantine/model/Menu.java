package ci.atos.gestcantine.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_date")
    @Temporal(TemporalType.DATE)
    private Date creationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plat_id", referencedColumnName = "id")
    private Plat plat;

    // Getters and Setters
}