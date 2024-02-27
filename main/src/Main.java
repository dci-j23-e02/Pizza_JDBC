package src;

import java.util.Set;

public class Main {

  public static void main(String[] args) {
    IngredientDao ingredientDao = new IngredientDaoImpl();
    System.out.println( "Inserting new ingredient");

    Ingredient tomato = new Ingredient("Tomato", 100);
    Ingredient cheese = new Ingredient("Cheese", 50);
    Ingredient mushroom = new Ingredient("Mushroom", 70);


    mushroom =  ingredientDao.insertIngredient(mushroom);
    if(mushroom != null)  System.out.println("Mushroom ingredient inserted successfully.");
    System.out.println(mushroom);


    tomato = ingredientDao.insertIngredient(tomato);
    if( tomato != null ){
      System.out.println("Tomato ingredient inserted successfully.");
    }

    cheese = ingredientDao.insertIngredient(cheese);
    if( cheese != null ){
      System.out.println("Cheese ingredient inserted successfully.");
    }

    System.out.println("List all ingredients:");
    Set<Ingredient> ingredientSet = ingredientDao.getAllIngredients();
    for (Ingredient ingredient: ingredientSet) {
      System.out.println(ingredient);
    }


    // Update an ingredient
    System.out.println("Update Tomato quantity");

    if ( tomato != null ) tomato.setQuantity(50);
    if(ingredientDao.updateIngredient(tomato)){
      System.out.println("Tomato ingredient quantity updated successfully!");
    }

    // Delete an ingredient
    System.out.println("Delete Tomato ingredient");
    if ( tomato != null ){
      if(ingredientDao.deleteIngredient(tomato.getId())){
      System.out.println("Tomato is deleted");
    }}

  }
}
