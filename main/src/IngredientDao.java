package src;


import java.util.Set;

public interface IngredientDao {
Ingredient getIngredient(int ingredientId);
Set<Ingredient> getAllIngredients();
boolean insertIngredient(Ingredient ingredient);
boolean updateIngredient(Ingredient ingredient);
boolean deleteIngredient(int ingredientId);

}
