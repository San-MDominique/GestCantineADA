package ci.atos.gestcantine.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "plat")
public class Plat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "summary")
    private String summary;

    @OneToOne(mappedBy = "plat")
    private Menu menu;

    // Getters and Setters
}