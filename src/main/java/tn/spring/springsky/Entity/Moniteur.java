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
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    public Long numMoniteur;

    @NonNull
    public String nomM;

    @NonNull
    public String prenomM;

    @Temporal(TemporalType.DATE)
    @NonNull
    public Date dateRecu;

    @OneToMany
    public Set<Cours> cours;
}
