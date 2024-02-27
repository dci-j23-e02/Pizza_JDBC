package src;

public enum SqlQuery {
  GET_INGREDIENT_BY_ID("SELECT * FROM pizza_ingredients WHERE id = ?"),
  GET_INGREDIENT_BY_NAME("SELECT * FROM pizza_ingredients WHERE name = ?"),
  GET_ALL_INGREDIENTS("SELECT * FROM pizza_ingredients"),
  INSERT_INGREDIENT("INSERT INTO pizza_ingredients (name, quantity) VALUES (?, ?)"),
  UPDATE_INGREDIENT("UPDATE pizza_ingredients SET name = ?, quantity = ? WHERE id = ?"),
  DELETE_INGREDIENT("DELETE FROM pizza_ingredients WHERE id = ?");

  private final String query;

  SqlQuery(String query) {
    this.query = query;
  }

  public String getQuery() {
    return query;
  }
}
