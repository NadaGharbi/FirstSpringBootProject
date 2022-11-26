package com.example.firstspringbootproject.DAO.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter //generer ts les getters // grace a lombok
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor //contructor par defaut
@AllArgsConstructor // constructor parametré
@RequiredArgsConstructor //constructor personnalisé qui contient les attributs avec annotation @nonNull // je ne peux faire qu'un seul
@Builder // construire les constructors SUR LE CHAMP QUAND j'en ai besoin
@FieldDefaults(level = AccessLevel.PRIVATE) //si ts les attributs sont private je peux travailler avec/ sinn travailler avec methode traditionnelle

@Table(name = "T_Contrat") //personnaliser le nom de l'entité dans la BD //grace a hibernate
public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") //personnaliser le nom de l'attribut dans la BD + possibilité d'ajouter des contraintes
    long idContrat;

    @Temporal(TemporalType.DATE)
    @Column(name = "ddebut")
    @NonNull
    Date dateDebutC;

    @Temporal(TemporalType.DATE)
    @Column(name = "dfin")
    @NonNull
    Date dateFinC;

    //@Enumerated(EnumType.ORDINAL) //int
    @Enumerated(EnumType.STRING) //chaine de caractere
    Specialite specialite;

    boolean archive;
    float montantC;
    //un attribut qui existe dans l'entité (monde objet) mais je ne veux pas l'avoir dans la base (monde relationnel)
    /*@Transient
    float salaire;*/

    @ManyToOne
    Etudiant etudiant;
}
