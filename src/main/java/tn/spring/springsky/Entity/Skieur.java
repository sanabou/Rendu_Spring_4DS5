package tn.spring.springsky.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    public Long numSkieur;

    @NonNull
    public String nomS;

    @NonNull
    public String prenomS;

    @Temporal(TemporalType.DATE)
    @NonNull
    public Date dateNaissance;

    @NonNull
    public String ville;

    @OneToMany(mappedBy = "skieur")
    public Set<Inscription> inscriptions;

    @ManyToMany(mappedBy = "skieurs")
    public Set<Piste> pistes;

    @OneToOne
    public Abonnement abonnement;
}
