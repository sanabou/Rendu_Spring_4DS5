package tn.spring.springsky.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    public Long numPiste;

    @NonNull
    public String nomPiste;

    @NonNull
    public String Couleur;

    @NonNull
    public int longeur;

    @NonNull
    public int pente;

    @ManyToMany
    public Set<Skieur> skieurs;
}
