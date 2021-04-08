package it.marczuk.babcia_zosia_cook_book.repository;

import it.marczuk.babcia_zosia_cook_book.model.Component;
import it.marczuk.babcia_zosia_cook_book.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepo extends JpaRepository<Component, Long> {

    void deleteByRecipe(Recipe recipe);
}
