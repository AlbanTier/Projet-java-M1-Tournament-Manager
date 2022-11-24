package ila.project.tournament_manager.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Tournoi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private Date date;
    private String type;
    private String description;
    private String etat;
    private Int nbParticipants;
}
