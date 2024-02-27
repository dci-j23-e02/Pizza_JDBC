package src;

public class Main {

  public static void main(String[] args) {
    IngredientDao ingredientDao = new IngredientDaoImpl();
    System.out.println( "Inserting new ingredient");
  /*  Ingredient ingredient = new Ingredient("Tomato", 100);
    if(ingredientDao.insertIngredient(ingredient)){
      System.out.println("Tomato ingredient inserted successfully.");
    }

    Ingredient ingredient2 = new Ingredient("Cheese", 50);
    if(ingredientDao.insertIngredient(ingredient2)){
      System.out.println("Cheese ingredient inserted successfully.");
    }*/

    System.out.println("List all ingredients:");


  }
}
