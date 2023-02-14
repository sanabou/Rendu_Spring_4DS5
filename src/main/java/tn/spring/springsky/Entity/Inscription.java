package tn.spring.springsky.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    public Long numInscription;

    @NonNull
    public int numSemaine;

    @ManyToOne
    public Cours cours;

    @ManyToOne
    public Skieur skieur;
}
