package tn.spring.springsky.Entity;

import lombok.*;
import tn.spring.springsky.TypeCours.TypeCours;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    public Long numCours;

    @NonNull
    public int niveau;

    @NonNull
    public TypeCours typeCours;

    @NonNull
    public Support support;

    @NonNull
    public Float prix;

    @NonNull
    public int creneau;

    @OneToMany(mappedBy = "cours")
    public Set<Inscription> inscriptions ;
}
