package com.example.firstspringbootproject.DAO.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter //generer ts les getters // grace a lombok
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor //contructor par defaut
@AllArgsConstructor // constructor parametré
@RequiredArgsConstructor //constructor personnalisé qui contient les attributs avec annotation @nonNull // je ne peux faire qu'un seul
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long idEquipe;

    @NonNull
    String nomEquipe;

    @Enumerated(EnumType.STRING)
    Niveau niveau;

    @OneToOne
    DetailsEquipe detailsEquipe;

    @ManyToMany
    List<Etudiant> etudiants;
}
