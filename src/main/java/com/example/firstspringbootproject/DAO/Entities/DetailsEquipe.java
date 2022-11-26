package com.example.firstspringbootproject.DAO.Entities;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

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
public class DetailsEquipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long idDetailsEquipe;

    @NonNull
    int salle;
    @NonNull
    String thematique;

    @OneToOne(mappedBy = "detailsEquipe") //si on ne met pas mappedby on va avoir deux relations unidirectionnelles entre Equipe et DetailsEquipe
    Equipe equipe;
}
