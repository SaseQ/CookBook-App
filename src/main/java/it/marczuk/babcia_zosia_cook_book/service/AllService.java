package it.marczuk.babcia_zosia_cook_book.service;

import it.marczuk.babcia_zosia_cook_book.dto.RecipeDto;
import it.marczuk.babcia_zosia_cook_book.model.Recipe;

import java.util.List;

public interface AllService {

//    Recipe Service
    List<Recipe> getRecipeByTitle(String title);

    List<Recipe> getAllRecipes();

    void deleteRecipe(Long id);

    Recipe getRecipeById(Long id);

//    Component Service
    void deleteComponents(Recipe recipe);

//    All Service
    void addAllRecipe(RecipeDto recipeDto);

    void editAllRecipe(RecipeDto recipeDto, Long id);
}
