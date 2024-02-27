package src;

import java.util.Set;

public class Main {

  public static void main(String[] args) {
    IngredientDao ingredientDao = new IngredientDaoImpl();
    System.out.println( "Inserting new ingredient");
    Ingredient tomato = new Ingredient("Tomato", 100);
    Ingredient cheese = new Ingredient("Cheese", 50);

   /*
    if(ingredientDao.insertIngredient(tomato)){
      System.out.println("Tomato ingredient inserted successfully.");
    }


    if(ingredientDao.insertIngredient(cheese)){
      System.out.println("Cheese ingredient inserted successfully.");
    }

    System.out.println("List all ingredients:");
    Set<Ingredient> ingredientSet = ingredientDao.getAllIngredients();
    for (Ingredient ingredient: ingredientSet) {
      System.out.println(ingredient);
    }
*/

    // Update an ingredient
    System.out.println("Update Tomato quantity");
    tomato.setQuantity(50);

  }
}
