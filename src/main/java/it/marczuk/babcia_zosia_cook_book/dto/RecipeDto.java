package it.marczuk.babcia_zosia_cook_book.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDto {

    private String name;
    private String components;
    private String prepare;
}
