package hr.springframework.recipeapp.domain;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    //Lob -> larger notes than 255 characters
    @Lob
    private String recipeNotes;

}
