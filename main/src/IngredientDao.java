package src;


import java.util.Set;

public interface IngredientDao {
Ingredient getIngredient(int ingredientId);
Ingredient getIngredientByName(String ingredientName);
Set<Ingredient> getAllIngredients();
Ingredient insertIngredient(Ingredient ingredient);
boolean updateIngredient(Ingredient ingredient);
boolean deleteIngredient(int ingredientId);

}
